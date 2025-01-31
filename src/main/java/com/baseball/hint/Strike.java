package com.baseball.hint;


import java.util.List;

public class Strike {
    private final int strike;

    public Strike(List<Integer> inputList, List<Integer> answer) {
        strike = findStrike(inputList, answer);
    }

    public int getStrike() {
        return strike;
    }

    private int findStrike(List<Integer> inputList, List<Integer> answer) {
        NumberComparator numberComparator = new NumberComparator();
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += numberComparator.compare(inputList.get(i), answer.get(i));
        }
        return sum;
    }


}