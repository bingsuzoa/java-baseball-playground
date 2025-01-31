package com.baseball.player;


public class Player {
    private boolean continueToPlay;

    public Player() {
        this.continueToPlay = true;
    }

    public boolean isContinueToPlay(int restartNumber) {
        if (restartNumber == 2) {
            continueToPlay = false;
        }
        return continueToPlay;
    }


}
