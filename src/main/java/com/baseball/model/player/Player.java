package com.baseball.model.player;

import com.baseball.controller.PlayOption;

public class Player {

    public boolean isContinueToPlay(int restartNumber) {
        if(restartNumber == PlayOption.STOP.getPlayNumber()) {
            return PlayOption.STOP.getOption();
        }
        return PlayOption.RESTART.getOption();
    }


}
