package com.baseball.model.referee;

import com.baseball.model.computer.AnswerGenerator;
import com.baseball.model.computer.RandomNumber;
import com.baseball.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class Referee {
    private final AnswerGenerator answerGenerator = new RandomNumber();
    private List<Integer> answer;
    private Result result;

    public Referee() {
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
        changeAnswer(result.isCorrect());
        return result.isCorrect();
    }

    private void changeAnswer(boolean isCorrect) {
        answer = answerGenerator.getAnswer(isCorrect);
    }
}