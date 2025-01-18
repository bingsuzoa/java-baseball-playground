package com.baseballgame.rule;


public class InputChecker {

    private int[] userNumbers = new int[3];

    private int[] sortUserNumbers(String input) {
        for(int i = 0; i < 3; i++) {
            userNumbers[i] = Integer.parseInt(input.substring(i, i+1));
        }
        return userNumbers;
    }

    public int[] getUserNumbers(String input) {
        return sortUserNumbers(input);
    }


}
