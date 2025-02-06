package com.baseball.model.hint;

import java.util.List;

public class Strike {
    private final int strike;

    public Strike(String playerInput, List<Integer> answer) {

        strike = findStrike(playerInput, answer);
    }

    public int getStrike() {
        return strike;
    }

    private int findStrike(String playerInput, List<Integer> answer) {
        NumberProcessor numberProcessor = new NumberProcessor();
        List<Integer> inputList = numberProcessor.getInputList(playerInput);
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += numberProcessor.compare(inputList.get(i), answer.get(i));
        }
        return sum;
    }


}