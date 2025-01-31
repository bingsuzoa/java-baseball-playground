package com.baseball.hint;

import java.util.ArrayList;
import java.util.List;

public class NumberProcessor {

    public int compare(int number1, int number2) {
        if(number1 == number2) {
            return 1;
        }
        return 0;
    }

    public List<Integer> getInputList(String playerInput) {
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < playerInput.length(); i++) {
            inputList.add(Integer.parseInt(playerInput.substring(i, i + 1)));
        }
        return inputList;
    }
}
