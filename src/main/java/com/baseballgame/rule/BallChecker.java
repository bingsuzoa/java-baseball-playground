package com.baseballgame.rule;

public class BallChecker {
    StrikeChecker strikeChecker = new StrikeChecker();

    public int getBallResult(int[] inputNumbers, Integer[] answer) {
        return addBallNumber(inputNumbers, answer);
    }

    private int addBallNumber(int[] inputNumbers, Integer[] answer) {
        int count = 0;

        for(int i = 0; i < inputNumbers.length; i++) {
            count += compareNumberByAllIndex(inputNumbers[i], answer);
        }

        count -= strikeChecker.getStrikeResult(inputNumbers, answer);
        return count;
    }

    private int compareNumberByAllIndex(int inputNumber, Integer[] answer) {
        int countByAllIndex = 0;
        for(int i = 0; i < answer.length; i++) {
            countByAllIndex += compareNumber(answer[i], inputNumber);
        }
        return countByAllIndex;
    }

    private int compareNumber(int answerNumber, int inputNumber) {
        if(answerNumber == inputNumber) {
            return 1;
        }
        return 0;
    }
}
