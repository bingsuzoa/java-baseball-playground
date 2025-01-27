package com.baseball.player;

import com.baseball.view.Message;
import com.baseball.view.OutputView;

import java.util.*;

public class Input {
    private final String input;

    OutputView outputView = new OutputView();

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
        try {
            isNumber1_9AndThree();
            isDuplicate();
            return true;
        } catch (IllegalArgumentException e) {
            outputView.printStringMessage(e.getMessage());
        }
        return false;
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
