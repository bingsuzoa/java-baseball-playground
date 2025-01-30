package com.baseball.hint;


import java.util.List;

public class Strike implements NumberComparator {
    private final int strikeCount;

    public Strike(List<Integer> inputList, List<Integer> answer) {
        strikeCount = count(inputList, answer);
    }

    public int getStrikeCount() {
        return strikeCount;
    }

    private int count(List<Integer> inputList, List<Integer> answer) {
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += compare(inputList.get(i), answer.get(i));
        }
        return sum;
    }


}