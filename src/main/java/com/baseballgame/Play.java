package com.baseballgame;

import com.baseballgame.player.Input;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.List;

public class Play {

    public static void main(String[] args) throws IOException {
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));

        while(true) {
            System.out.println("3자리의 숫자를 입력해주세요.");
            String threeNumber = buffer.readLine();
            Input input = new Input(threeNumber);
            List<Integer> numbers = input.getInput();
        }
    }
}
