package com.baseball;


import com.baseball.computer.Computer;
import com.baseball.player.Player;


import java.util.List;

public class PlayGame {

    public static void main(String[] args) {
        Computer computer = new Computer();
        List<Integer> answer = computer.getNewAnswer();

        InputView inputView = new InputView();
        Player player = new Player();

        while(!player.getPlayerState()) {
            if(!player.saveValidatedInput(inputView.getPlayerInput(Message.GAME_INPUT_MESSAGE))) {
                continue;
            }
            player.requestDecisions(answer);
            answer = computer.ReMakeNewAnswer();
            player.updatePlayerState();
        }
    }
}
