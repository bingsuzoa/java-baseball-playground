package com.baseball.player;


import java.util.ArrayList;
import java.util.List;

public class Player {
    private boolean continueToPlay;
    private final InputValidator inputValidator;

    public Player(String playerInput) {
        this.inputValidator = new InputValidator(playerInput);
        this.continueToPlay = true;
    }

    public List<Integer> getInputList() {
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < inputValidator.getInputFromValidator().length(); i++) {
            inputList.add(Integer.parseInt(inputValidator.getInputFromValidator().substring(i, i + 1)));
        }
        return inputList;
    }

    public boolean requestInputValidation() {
        return inputValidator.isProperInput();
    }

    public boolean isContinueToPlay(int restartNumber) {
        if (restartNumber == 2) {
            continueToPlay = false;
        }
        return continueToPlay;
    }


}
