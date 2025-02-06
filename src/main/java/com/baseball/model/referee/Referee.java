package com.baseball.model.referee;

import com.baseball.model.computer.AnswerGenerator;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    private final AnswerGenerator answerGenerator;
    private List<Integer> answer;
    private Result result;

    public Referee(AnswerGenerator answerGenerator) {
        this.answerGenerator = answerGenerator;
        this.answer = answerGenerator.getAnswer(false);
        this.result = new Result("", new ArrayList<>());
    }

    public boolean isProperInput(String playerInput) {
        InputValidator inputValidator = new InputValidator(playerInput);
        if (inputValidator.isProperInput()) {
            return true;
        }
        return false;
    }

    public String getHintMessage() {
        return result.getHintMessage();
    }

    public boolean isCorrect(String playerInput) {
        this.result = new Result(playerInput, answer);
        changeAnswerWhenIsCorrect(result.isCorrect());
        return result.isCorrect();
    }

    private void changeAnswerWhenIsCorrect(boolean isCorrect) {
        answer = answerGenerator.getAnswer(isCorrect);
    }
}