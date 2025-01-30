package com.baseball;

import com.baseball.player.Player;
import com.baseball.referee.Referee;
import com.baseball.view.Message;
import com.baseball.view.OutputView;

import java.util.ArrayList;
import java.util.List;

public class GameService {
    private Player player;
    private Referee referee;
    private OutputView outputView;

    public GameService() {
        this.player = new Player("");
        this.referee = new Referee(new ArrayList<>(), new ArrayList<>());
        this.outputView = new OutputView();
    }

    public boolean getProperPlayerInput(String playerInput) {
        try {
            player = new Player(playerInput);
        } catch (IllegalArgumentException e) {
            outputView.printString(e.getMessage());
        }
        return player.isProperInput();
    }

    public boolean startGameAndGetIsAnswer(List<Integer> answer) {
        referee = new Referee(player.getPlayerInput(), answer);
        if(referee.judgeIsAnswer()) {
            outputView.printMessage(Message.GAME_ANSWER_MESSAGE);
        }
        return referee.judgeIsAnswer();
    }

    public boolean getProperRestartNumber(boolean isCorrect, int restartNumber) {
        try {
            return player.getPlayingState(isCorrect, restartNumber);
        } catch (NumberFormatException e) {
            outputView.printString(e.getMessage());
        }
        return true;
    }
}
