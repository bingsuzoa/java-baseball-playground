package com.baseball.controller;

import com.baseball.service.GameService;
import com.baseball.view.InputView;
import com.baseball.view.Message;
import com.baseball.view.OutputView;

public class GameController {
    private final InputView inputView = InputView.getInstance();
    private final OutputView outputView = OutputView.getInstance();
    private final GameService gameService;

    public GameController() {
        this.gameService = new GameService();
    }

    public void startGame() {
        boolean continueToPlay;
        do {
            boolean isCorrect = gameService.getAnswer(getValidatedInput());
            outputView.printString(gameService.getHintMessage());
            continueToPlay = gameService.continueToPlay(getRestartNumberWhenIsCorrect(isCorrect));
        } while (continueToPlay);
    }

    private int getRestartNumberWhenIsCorrect(boolean isCorrect) {
        if (isCorrect) {
            return getRestartNumber();
        }
        return PlayOption.CONTINUE.getPlayNumber();
    }

    private int getRestartNumber() {
        int playNumber;
        do {
            playNumber = inputView.getRestartInput(Message.GAME_RESTART_MESSAGE);
        } while (playNumber != PlayOption.RESTART.getPlayNumber() && playNumber != PlayOption.STOP.getPlayNumber());
        return playNumber;
    }

    private String getValidatedInput() {
        String validatedInput;
        boolean isProperInput;
        do {
            validatedInput = inputView.getPlayerInput(Message.GAME_START_MESSAGE);
            isProperInput = gameService.checkInputIsValid(validatedInput);
        } while (!isProperInput);
        return validatedInput;
    }
}
