package com.baseballgame.rule;

import java.util.StringTokenizer;

public class InputChecker {

    private int[] inputNumbers;

    private int[] initInput(String input) {
        StringTokenizer st = new StringTokenizer(input);
        for(int i = 0; i < 3; i++) {
            inputNumbers[i] = Integer.parseInt(st.nextToken());
        }
        return inputNumbers;
    }

    public int[] getIntputNumbers(String input) {
        return initInput(input);
    }


}
