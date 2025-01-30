package com.baseball.referee;


import java.util.List;


public class Referee {
    private final Result result;


    public Referee(List<Integer> inputList, List<Integer> answer) {
        this.result = new Result(inputList, answer);
    }

    public boolean judgeIsAnswer() {
        return result.isCorrect();
    }

    public String getHintMessage() {
        return result.getHint();
    }


}