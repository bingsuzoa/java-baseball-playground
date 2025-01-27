package com.baseball.player;

import com.baseball.InputView;
import com.baseball.Message;
import com.baseball.referee.Referee;

public class State {
    private boolean playingState;

    Referee referee = new Referee();
    InputView inputView = new InputView();

    public State() {
        this.playingState = true;
    }

    public boolean getState() {
        return playingState;
    }

    public void updateStateWhenAnswered() {
        if (referee.isThreeStrike()) {
            int restartNumber = getRestartNumber();
            isRestartGame(restartNumber);
        }
    }

    public void isRestartGame(int restartNumber) {
        if (restartNumber != 1 && restartNumber != 2) {
            throw new IllegalArgumentException(Message.INVALID_GAME_INPUT.getMessage());
        }
        if (restartNumber == 2) {
            this.playingState = false;
        }
    }

    private int getRestartNumber() {
        int restartNumber = 0;
        while (restartNumber != 1 && restartNumber != 2) {
            restartNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        }
        return restartNumber;
    }


}
