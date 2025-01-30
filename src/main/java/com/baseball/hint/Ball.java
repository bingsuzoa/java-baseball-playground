package com.baseball.hint;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ball implements NumberComparator {
    private final int ballCount;

    public Ball(List<Integer> inputList, List<Integer> answer) {
        ballCount = count(inputList, answer);
    }

    public int getBallCount() {
        return ballCount;
    }

    private int count(List<Integer> inputList, List<Integer> answer) {
        int sum = inputList.size() + answer.size();
        int strikeCount = 0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < inputList.size(); i++) {
            uniqueNumbers.add(inputList.get(i));
            uniqueNumbers.add(answer.get(i));
            strikeCount += compare(inputList.get(i), answer.get(i));
        }
        sum -= uniqueNumbers.size();
        sum -= strikeCount;
        return sum;
    }


}