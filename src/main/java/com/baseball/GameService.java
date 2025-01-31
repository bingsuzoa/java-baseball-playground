package com.baseball;

import com.baseball.computer.AnswerGenerator;
import com.baseball.player.Player;
import com.baseball.referee.Referee;
import com.baseball.view.InputView;
import com.baseball.view.Message;
import com.baseball.view.OutputView;


import java.util.List;

public class GameService {
    private final InputView inputView;
    private final OutputView outputView;
    private final AnswerGenerator answerGenerator;

    private List<Integer> answer;
    private Player player;

    public GameService(InputView inputView, OutputView outputView, AnswerGenerator answerGenerator) {
        this.inputView = inputView;
        this.outputView = outputView;
        this.answerGenerator = answerGenerator;
    }

    public boolean continueToPlay(boolean isCorrect) {
        int restartNumber = 0;
        answer = answerGenerator.getAnswer(isCorrect);
        if (!isCorrect) {
            return true;
        }
        while (restartNumber != 1 && restartNumber != 2) {
            restartNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        }
        return player.isContinueToPlay(restartNumber);
    }

    public boolean getHintAndIsAnswer() {
        boolean isCorrectForStartGame = false;
        answer = answerGenerator.getAnswer(isCorrectForStartGame);
        Referee referee = new Referee(player.getInputList(), answer);
        outputView.printString(referee.getHintMessage());
        return referee.judgeIsAnswer();
    }

    public void getPlayerInput() {
        boolean isProperInput = false;
        while (!isProperInput) {
            this.player = new Player(inputView.getPlayerInput(Message.GAME_START_MESSAGE));
            isProperInput = player.requestInputValidation();
        }
    }
}
