package com.baseball.hint;

import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ball {
    private final int ball;

    public Ball(List<Integer> inputList, List<Integer> answer) {
        ball = findBall(inputList, answer);
    }

    public int getBall() {
        return ball;
    }

    private int findBall(List<Integer> inputList, List<Integer> answer) {
        NumberComparator numberComparator = new NumberComparator();
        int sum = inputList.size() + answer.size();
        int strikeCount = 0;
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < inputList.size(); i++) {
            uniqueNumbers.add(inputList.get(i));
            uniqueNumbers.add(answer.get(i));
            strikeCount += numberComparator.compare(inputList.get(i), answer.get(i));
        }
        sum -= uniqueNumbers.size();
        sum -= strikeCount;
        return sum;
    }


}