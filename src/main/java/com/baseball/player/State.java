package com.baseball.player;

import com.baseball.InputView;
import com.baseball.Message;
import com.baseball.referee.Referee;

public class State {
    private boolean playingState;

    Referee referee = new Referee();
    InputView inputView = new InputView();

    public State() {
        playingState = true;
    }
    public boolean getState() {
        return playingState;
    }

    public void updateStateWhenAnswered() {
        if(referee.isThreeStrike()) {
            updateStateWhenRestart();
        }
    }
    private void updateStateWhenRestart() {
        int restartNumber = 0;
        while(restartNumber != 1 && restartNumber != 2) {
            restartNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        }
        if(restartNumber == 2) {
            this.playingState = false;
        }
    }


}
