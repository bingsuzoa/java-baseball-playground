package com.baseballgame;


import com.baseballgame.player.Input;
import com.baseballgame.view.InputView;

import java.io.IOException;

public class Play {
    static InputView inputView = new InputView();

    public static void main(String[] args) throws IOException {
        boolean isStopGame = false;
        Input input = new Input();

        while (!isStopGame) {
            isStopGame = input.sendInputToReferee(inputView.getThreeNumbers());
        }


    }
}
