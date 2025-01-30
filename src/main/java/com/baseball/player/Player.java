package com.baseball.player;


import java.util.List;

public class Player {
    private final Input input;
    private final State state;

    public Player(String playerInput) {
        this.input = new Input(playerInput);
        this.state = new State();
    }

    public List<Integer> getPlayerInput() {

        return input.getInputList();
    }

    public boolean isProperInput() {

        return input.checkProperInput();
    }

    public boolean getPlayingState(boolean isCorrect, int restartNumber) {
        return state.checkPlayerWantsToPlay(isCorrect, restartNumber);
    }


}
