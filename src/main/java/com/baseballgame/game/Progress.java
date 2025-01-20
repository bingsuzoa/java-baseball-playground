package com.baseballgame.game;

import com.baseballgame.computer.Computer;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Progress {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    Computer computer = new Computer();

    public int isProgressGame() throws IOException {
        int gameProgressNumber = getInputWhenThreeStrike();

        if(gameProgressNumber == 1) {
            computer.getAnswer();
        }
        return gameProgressNumber;
    }

    private int getInputWhenThreeStrike() throws IOException {
        int isProgressNumber = 1;
        boolean isValid = false;
        System.out.println("게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요.");
        while(!isValid) {
            isProgressNumber = Integer.parseInt(buffer.readLine());
            isValid = isValidNumber(isProgressNumber);
        }
        return isProgressNumber;
    }

    private boolean isValidNumber(int isProgressGameNumber) {
        if(isProgressGameNumber != 1 && isProgressGameNumber != 2) {
            System.out.println("올바른 입력이 아닙니다. 1 또는 2만 입력해주세요.");
            return false;
        }
        return true;
    }

}
