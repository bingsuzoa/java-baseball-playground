package com.baseball.player;


import com.baseball.referee.Referee;

import java.util.ArrayList;
import java.util.List;

public class Player {
    private List<Integer> inputList;
    private State state;

    Referee referee = new Referee();

    public Player() {
        this.inputList = new ArrayList<>();
        this.state = new State();
    }

    public boolean saveValidatedInput(String playerInput) {
        Input input = new Input(playerInput);
        if (input.isValid()) {
            inputList = input.convertInputToList();
            return true;
        }
        return false;
    }

    public void requestDecisions(List<Integer> answer) {
        referee.judgeAndGetResult(inputList, answer);
    }

    public List<Integer> getInputList() {
        return inputList;
    }

    public void updatePlayerState() {
        state.updateStateWhenAnswered();
    }

    public boolean getPlayerState() {
        return state.getState();
    }
}
