package com.baseball.player;

import com.baseball.view.Message;
import com.baseball.view.OutputView;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input {
    private final String playerInput;
    private final OutputView outputView;

    public Input(String playerInput) {
        this.playerInput = playerInput;
        this.outputView = new OutputView();
    }

    public boolean checkProperInput() {
        try {
            isNumber1_9AndThree(playerInput);
            isDuplicate(playerInput);
            return true;
        } catch (IllegalArgumentException e) {
            outputView.printMessage(Message.INVALID_GAME_INPUT);
        }
        return false;
    }

    public List<Integer> getInputList() {
        List<Integer> inputList = new ArrayList<>();
        for(int i = 0; i < playerInput.length(); i++) {
            inputList.add(Integer.parseInt(playerInput.substring(i, i+1)));
        }
        return inputList;
    }

    private void isNumber1_9AndThree(String playerInput) {
        if (!playerInput.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(Message.INVALID_GAME_INPUT.getMessage());
        }
    }

    private void isDuplicate(String playerInput) {
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < playerInput.length(); i++) {
            uniqueNumbers.add(Integer.parseInt(playerInput.substring(i, i + 1)));
        }
        if (uniqueNumbers.size() != 3) {
            throw new IllegalArgumentException(Message.DUPLICATED_GAME_INPUT.getMessage());
        }
    }
}

