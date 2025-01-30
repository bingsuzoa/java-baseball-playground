package com.baseball.player;


public class State {
    private boolean wantsToPlay;

    public State() {
        this.wantsToPlay = true;
    }

    public boolean checkPlayerWantsToPlay(int restartNumber) {
        updateStateBasedOnInput(restartNumber);
        return wantsToPlay;
    }

    private void updateStateBasedOnInput(int restartNumber) {
        if (restartNumber == 2) {
            this.wantsToPlay = false;
        }
    }
}
