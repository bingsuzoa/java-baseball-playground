package com.baseball;


import com.baseball.computer.Computer;
import com.baseball.view.InputView;
import com.baseball.view.Message;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean isProperInput = false;
        boolean isCorrect = false;
        boolean wantsToPlay = true;

        InputView inputView = new InputView();
        Computer computer = new Computer();
        GameService gameService = new GameService();

        List<Integer> answer = computer.getAnswer();

        while(!isProperInput) {
            isProperInput = gameService.getProperPlayerInput(
                            inputView.getPlayerInput(Message.GAME_START_MESSAGE));
        }

        while(!isCorrect || wantsToPlay) {
            isCorrect = gameService.startGameAndGetIsAnswer(answer);
            if(isCorrect) {
                answer = computer.getAnswer();
            }
            wantsToPlay = gameService.getProperRestartNumber(
                    isCorrect, inputView.getRestartInput(Message.GAME_RESTART_MESSAGE));
        }

    }
}
