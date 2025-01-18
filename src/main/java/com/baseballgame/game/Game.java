package com.baseballgame.game;

import com.baseballgame.computer.Computer;
import com.baseballgame.rule.BallChecker;
import com.baseballgame.rule.InputChecker;
import com.baseballgame.rule.NothingChecker;
import com.baseballgame.rule.StrikeChecker;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.List;

public class Game {
    BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
    InputChecker inputChecker = new InputChecker();
    StrikeChecker strikeChecker = new StrikeChecker();
    BallChecker ballChecker = new BallChecker();
    NothingChecker nothingChecker = new NothingChecker();
    Computer computer = new Computer();

    private List<String> gameResult = new ArrayList<>();
    private int isProgressGameNumber = 1;
    Integer[] answer = computer.getAnswer();

    public int startPlay(String input) throws IOException {
        int[] userNumbers = inputChecker.getUserNumbers(input);
        int ballNumber = ballChecker.getBallResult(userNumbers, answer);
        int strikeNumber = strikeChecker.getStrikeResult(userNumbers, answer);
        boolean isNothing = nothingChecker.getNothingResult(userNumbers, answer);

        saveGameResult(ballNumber, strikeNumber, isNothing);
        printGameResult();
        removeGameResult();

        if(checkThreeStrike(strikeNumber)) {
            isProgressGameNumber = isProgressGame();
        }
        return isProgressGameNumber;
    }


    private boolean checkThreeStrike(int strikeNumber){
        if(strikeNumber == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            System.out.println("게임을 다시 시작하려면 1, 종료하려면 2를 입력하세요.");
            return true;
        }
        return false;
    }

    public int isProgressGame() throws IOException {
        int isProgressGame = Integer.parseInt(buffer.readLine());

        if(isProgressGame == 1) {
            answer = computer.getAnswer();
            return isProgressGame;
        }
        return isProgressGame;
    }

    private void saveGameResult(int ballNumber, int strikeNumber, boolean isNothing) {
        if(ballNumber > 0) {
            gameResult.add(ballNumber + "볼");
        }
        if(strikeNumber > 0) {
            gameResult.add(strikeNumber + "스트라이크");
        }
        if(isNothing) {
            gameResult.add("낫싱");
        }
    }

    private void printGameResult() {
        for(String result : gameResult) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

    private void removeGameResult() {
        gameResult.clear();
    }


}
