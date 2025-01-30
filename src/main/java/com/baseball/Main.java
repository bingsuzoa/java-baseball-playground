package com.baseball;


import com.baseball.computer.Computer;
import com.baseball.player.Player;
import com.baseball.view.InputView;
import com.baseball.view.Message;


import java.util.List;

public class Main {

    public static void main(String[] args) {
        boolean wantsToPlay = true;
        boolean isCorrect;
        boolean isProperInput = false;

        Computer computer = new Computer();
        Player player;
        InputView inputView = new InputView();
        List<Integer> answer = computer.getAnswer();

        while(!isProperInput || wantsToPlay) {
            player = new Player(inputView.getPlayerInput(Message.GAME_START_MESSAGE));
            isProperInput = player.isProperInput();
            GameService gameService = new GameService(player, answer);
            isCorrect = gameService.startGameAndIsAnswer(isProperInput);
            wantsToPlay = gameService.checkWantsToPlay(isCorrect);
            answer = computer.getReAnswer(isCorrect);
        }

    }
}
