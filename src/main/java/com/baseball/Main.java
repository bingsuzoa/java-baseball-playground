package com.baseball;


import com.baseball.computer.AnswerGenerator;
import com.baseball.computer.RandomNumber;
import com.baseball.view.InputView;
import com.baseball.view.OutputView;

public class Main {

    public static void main(String[] args) {
        boolean isCorrect = false;
        boolean continueToPlay = true;

        InputView inputView = new InputView();
        OutputView outputView = new OutputView();
        AnswerGenerator answerGenerator = new RandomNumber();
        GameService gameService = new GameService(inputView, outputView, answerGenerator);

        while (!isCorrect || continueToPlay) {
            gameService.getPlayerInput();
            isCorrect = gameService.getHintAndIsAnswer();
            continueToPlay = gameService.continueToPlay(isCorrect);
        }

    }
}
