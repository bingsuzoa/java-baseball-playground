package com.baseball.player;



import java.util.ArrayList;
import java.util.List;

public class Player {
    private final InputValidator inputValidator;
    private final State state;

    public Player(String playerInput) {
        this.inputValidator = new InputValidator(playerInput);
        this.state = new State();
    }

    public List<Integer> getInputList() {
        List<Integer> inputList = new ArrayList<>();
        for (int i = 0; i < inputValidator.getInputFromValidator().length(); i++) {
            inputList.add(Integer.parseInt(inputValidator.getInputFromValidator().substring(i, i + 1)));
        }
        return inputList;
    }

    public boolean getPlayingState(int restartNumber) {
        return state.checkPlayerWantsToPlay(restartNumber);
    }

    public boolean requestInputValidation() {
        return inputValidator.isProperInput();
    }


}
