package com.baseballgame.rule;


public class StrikeChecker {

    public int getStrikeResult(int[] inputNumbers, Integer[] answer) {
        return addStrikeNumber(inputNumbers, answer);
    }

    private int addStrikeNumber(int[] inputNumbers, Integer[] answer) {
        int count = 0;
        for(int i = 0; i < inputNumbers.length; i++) {
            count += compareNumberBySameIndex(answer[i], inputNumbers[i]);
        }
        return count;
    }

    private int compareNumberBySameIndex(int answerNumber, int inputNumber) {
        if(answerNumber == inputNumber) {
            return 1;
        }
        return 0;
    }

}
