package com.baseballgame.rule;

public class NumberComparator {

    protected int compareNumber(int answerNumber, int userNumber) {
        if (answerNumber == userNumber) {
            return 1;
        }
        return 0;
    }
}
