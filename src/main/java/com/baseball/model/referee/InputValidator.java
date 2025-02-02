package com.baseball.model.referee;

import com.baseball.view.Message;
import com.baseball.view.OutputView;


import java.util.HashSet;

import java.util.Set;

public class InputValidator {
    private final String playerInput;
    private final OutputView outputView;

    public InputValidator(String playerInput) {
        this.playerInput = playerInput;
        this.outputView = new OutputView();
    }

    public boolean isProperInput() {
        try {
            isNumber1_9AndThree(playerInput);
            isDuplicate(playerInput);
            return true;
        } catch (IllegalArgumentException e) {
            outputView.printMessage(Message.INVALID_GAME_INPUT);
        }
        return false;
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