package com.baseballgame;

import com.baseballgame.game.Game;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class PlayGame {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        Game game = new Game();


        while(game.getProgressGameNumber() != 2) {
            System.out.println("숫자를 입력해 주세요 : ");
            String input = buffer.readLine();
            game.startPlay(input);
        }

    }
}
