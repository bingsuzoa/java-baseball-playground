package com.baseball.referee;

import com.baseball.model.computer.AnswerGenerator;

import java.util.List;

public class FixedAnswerGenerator implements AnswerGenerator {
    private final List<Integer> fixedAnswer;

    public FixedAnswerGenerator(List<Integer> fixedAnswer) {
        this.fixedAnswer = fixedAnswer;
    }

    @Override
    public List<Integer> getAnswer (boolean isCorrect) {
        return fixedAnswer;
    }
}
