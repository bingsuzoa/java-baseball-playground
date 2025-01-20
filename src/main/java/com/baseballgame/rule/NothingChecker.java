package com.baseballgame.rule;

public class NothingChecker {
    StrikeChecker strikeChecker = new StrikeChecker();
    BallChecker ballChecker = new BallChecker();

    public boolean getNothingResult(int[] inputNumbers, Integer[] answer) {
        int strikeNumber = strikeChecker.getStrikeResult(inputNumbers, answer);
        int ballNumber = ballChecker.getBallResult(inputNumbers, answer);

        if (strikeNumber == 0 && ballNumber == 0) {
            return true;
        }
        return false;
    }
}
