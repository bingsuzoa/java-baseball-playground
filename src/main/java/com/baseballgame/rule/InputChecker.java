package com.baseballgame.rule;


public class InputChecker {
    Exception inputException = new Exception();

    private final int[] userNumbers = new int[3];

    private int[] sortUserNumbers(String input) {
        input = input.replace(" ", "");
        inputException.isValidInputNumber(input);
        inputException.isDuplicatedInput(input);
        inputException.isNumberInput(input);

        for (int i = 0; i < 3; i++) {
            userNumbers[i] = Integer.parseInt(input.substring(i, i + 1));
        }
        return userNumbers;
    }

    public int[] getUserNumbers(String input) {
        return sortUserNumbers(input);
    }


}
