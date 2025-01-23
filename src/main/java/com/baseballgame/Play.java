package com.baseballgame;


import com.baseballgame.computer.Computer;
import com.baseballgame.player.Numbers;
import com.baseballgame.view.InputView;

import java.util.List;

public class Play {
    static InputView inputView = new InputView();

    public static void main(String[] args) {
        boolean isAnswer = false;

        Computer computer = new Computer();
        List<Integer> answer = computer.getNewAnswer();
        Numbers numbers = new Numbers();

        while (!isAnswer) {
            isAnswer = numbers.sendInputToReferee(inputView.getThreeNumbers(), answer);
        }


    }
}
