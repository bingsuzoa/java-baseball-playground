package com.baseball.player;

import com.baseball.Message;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input {
    private final String input;

    public Input(String input) {
        this.input = input;
    }

    public List<Integer> convertInputToList() {
        List<Integer> inputToList = new ArrayList<>(3);
        for (int i = 0; i < input.length(); i++) {
            inputToList.add(Integer.parseInt(input.substring(i, i + 1)));
        }
        return inputToList;
    }

    public boolean isValid() {
        isNumber1_9AndThree();
        isDuplicate();
        return true;
    }

    private void isNumber1_9AndThree() {
        if(!input.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(Message.INVALID_GAME_INPUT.getMessage());
        }
    }
    private void isDuplicate() {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for(int i = 0; i < input.length(); i++) {
            uniqueNumbers.add(Integer.parseInt(input.substring(i, i+1)));
        }
        if(uniqueNumbers.size() != 3) {
            throw new IllegalArgumentException(Message.DUPLICATED_GAME_INPUT.getMessage());
        }
    }
}
