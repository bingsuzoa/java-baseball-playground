package com.baseball;

import com.baseball.player.Player;
import com.baseball.referee.Referee;
import com.baseball.view.InputView;
import com.baseball.view.Message;


import java.util.List;

public class GameService {
    private final InputView inputView;
    private final Player player;
    private final Referee referee;


    public GameService(InputView inputView) {
        this.player = new Player();
        this.inputView = inputView;
        this.referee = new Referee();
    }

    public boolean startGameAndIsAnswer(String playerInput, List<Integer> answer) {
        return referee.isCorrect(playerInput, answer);
    }

    public boolean continueToPlay(int restartNumber) {
        return player.isContinueToPlay(restartNumber);
    }

    public int getRestartNumberWhenAnswered(boolean isCorrect) {
        int restartNumber = 0;
        if (isCorrect) {
            restartNumber = getRestartNumber();
        }
        return restartNumber;
    }

    private int getRestartNumber() {
        int restartNumber = 0;
        while (restartNumber != 1 && restartNumber != 2) {
            restartNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        }
        return restartNumber;
    }

    public String getPlayerInput() {
        boolean isProperInput = false;
        String playerInput = "";
        while (!isProperInput) {
            playerInput = inputView.getPlayerInput(Message.GAME_START_MESSAGE);
            isProperInput = referee.isProperInput(playerInput);
        }
        return playerInput;
    }
}
