package com.baseball.service;


import com.baseball.model.computer.AnswerGenerator;
import com.baseball.model.computer.RandomNumber;
import com.baseball.model.player.Player;
import com.baseball.model.referee.Referee;


public class GameService {
    private final Player player;
    private final Referee referee;

    public GameService() {
        this.player = new Player();
        AnswerGenerator answerGenerator = new RandomNumber();
        this.referee = new Referee(answerGenerator);
    }

    public boolean getAnswer(String playerInput) {
        return referee.isCorrect(playerInput);
    }

    public boolean continueToPlay(int playOption) {
        return player.isContinueToPlay(playOption);
    }

    public String getHintMessage() {
        return referee.getHintMessage();
    }

    public boolean checkInputIsValid(String playerInput) {
       return referee.isProperInput(playerInput);
    }
}
