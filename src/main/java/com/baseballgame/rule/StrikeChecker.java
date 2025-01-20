package com.baseballgame.rule;


public class StrikeChecker {
    NumberComparator numberComparator = new NumberComparator();

    public int getStrikeResult(int[] inputNumbers, Integer[] answer) {
        return countStrikeNumber(inputNumbers, answer);
    }

    private int countStrikeNumber(int[] inputNumbers, Integer[] answer) {
        int countStrikeNumber = 0;
        for (int i = 0; i < inputNumbers.length; i++) {
            countStrikeNumber += numberComparator.compareNumber(answer[i], inputNumbers[i]);
        }
        return countStrikeNumber;
    }

}
