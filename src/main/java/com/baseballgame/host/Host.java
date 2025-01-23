package com.baseballgame.host;


import com.baseballgame.player.InputValidator;
import com.baseballgame.view.InputView;

import java.io.IOException;


public class Host {
    private static final int RESTART = 1;
    private static final int STOP = 2;
    private static final int INIT_NUMBER = 3;
    InputView inputView = new InputView();
    InputValidator inputValidator = new InputValidator();

    public boolean checkRestart() throws IOException {
        int restartNumber = INIT_NUMBER;
        while (restartNumber != RESTART && restartNumber != STOP) {
            String temp = inputView.getRestartNumber();
            restartNumber = inputValidator.isValidatedRestartNumber(temp);
        }
        if (restartNumber == STOP) {
            return true;
        }
        return false;
    }
}
