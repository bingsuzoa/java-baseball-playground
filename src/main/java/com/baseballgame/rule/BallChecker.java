package com.baseballgame.rule;

public class BallChecker {
    StrikeChecker strikeChecker = new StrikeChecker();
    NumberComparator numberComparator = new NumberComparator();

    public int getBallResult(int[] userNumbers, Integer[] answer) {
        return subtractStrikeFromSum(userNumbers, answer);
    }

    private int subtractStrikeFromSum(int[] userNumbers, Integer[] answer) {
        int sumUserNumbersInAnswer = sumUserNumbersInAnswer(userNumbers, answer);
        int strikeNumber = strikeChecker.getStrikeResult(userNumbers, answer);
        int ballNumber = sumUserNumbersInAnswer - strikeNumber;

        return ballNumber;
    }

    private int sumUserNumbersInAnswer(int[] userNumbers, Integer[] answer) {
        int sumUserNumbersInAnswer = 0;

        for (int i = 0; i < userNumbers.length; i++) {
            sumUserNumbersInAnswer += countUserNumberInAnswer(userNumbers[i], answer);
        }
        return sumUserNumbersInAnswer;
    }

    private int countUserNumberInAnswer(int userNumber, Integer[] answer) {
        int countUserNumberInAnswer = 0;
        for (int i = 0; i < answer.length; i++) {
            countUserNumberInAnswer += numberComparator.compareNumber(answer[i], userNumber);
        }
        return countUserNumberInAnswer;
    }

}
