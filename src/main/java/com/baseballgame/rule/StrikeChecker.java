package com.baseballgame.rule;


public class StrikeChecker {

    public int getStrikeResult(int[] inputNumbers, Integer[] answer) {
        return countStrikeNumber(inputNumbers, answer);
    }

    private int countStrikeNumber(int[] inputNumbers, Integer[] answer) {
        int countStrikeNumber = 0;
        for(int i = 0; i < inputNumbers.length; i++) {
            countStrikeNumber += compareNumber(answer[i], inputNumbers[i]);
        }
        return countStrikeNumber;
    }

    private int compareNumber(int answerNumber, int inputNumber) {
        if(answerNumber == inputNumber) {
            return 1;
        }
        return 0;
    }

}
