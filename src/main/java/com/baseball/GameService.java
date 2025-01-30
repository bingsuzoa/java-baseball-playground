package com.baseball;

import com.baseball.player.Player;
import com.baseball.referee.Referee;
import com.baseball.view.InputView;
import com.baseball.view.Message;
import com.baseball.view.OutputView;


import java.util.List;

public class GameService {
    private Player player;
    private List<Integer> answer;
    private InputView inputView;
    private OutputView outputView;

    public GameService(Player player, List<Integer> answer) {
        this.player = player;
        this.inputView = new InputView();
        this.outputView = new OutputView();
        this.answer = answer;
    }

    public boolean startGameAndIsAnswer(boolean isProperInput) {
        if (!isProperInput) {
            return false;
        }
        Referee referee = new Referee(player.getPlayerInput(), answer);
        printHintMessage(referee.judgeIsAnswer(), referee.getHintMessage());
        return referee.judgeIsAnswer();
    }

    public boolean checkWantsToPlay(boolean isCorrect) {
        int restartNumber = 0;
        if (!isCorrect) {
            return true;
        }
        while (restartNumber != 1 && restartNumber != 2) {
            restartNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        }
        return player.getPlayingState(restartNumber);
    }

    private void printHintMessage(boolean isCorrect, String hintMessage) {
        outputView.printString(hintMessage);
        if (isCorrect) {
            outputView.printMessage(Message.GAME_ANSWER_MESSAGE);
        }
    }
}
