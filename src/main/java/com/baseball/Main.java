package com.baseball;


import com.baseball.computer.AnswerGenerator;
import com.baseball.computer.RandomNumber;
import com.baseball.view.InputView;

import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean isCorrect = false;
        boolean continueToPlay = true;

        InputView inputView = new InputView();
        AnswerGenerator answerGenerator = new RandomNumber();

        List<Integer> answer = answerGenerator.getAnswer(isCorrect);
        GameService gameService = new GameService(inputView);

        while (continueToPlay) {
            String playerInput = gameService.getPlayerInput();
            isCorrect = gameService.startGameAndIsAnswer(playerInput, answer);
            continueToPlay = gameService.continueToPlay(
                                gameService.getRestartNumberWhenAnswered(isCorrect));
            answer = answerGenerator.getAnswer(isCorrect);
        }

    }
}
