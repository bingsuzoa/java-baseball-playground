package com.baseballgame.game;

import com.baseballgame.computer.Computer;
import com.baseballgame.rule.BallChecker;
import com.baseballgame.rule.InputChecker;
import com.baseballgame.rule.NothingChecker;
import com.baseballgame.rule.StrikeChecker;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Game {
    InputChecker inputChecker = new InputChecker();
    StrikeChecker strikeChecker = new StrikeChecker();
    BallChecker ballChecker = new BallChecker();
    NothingChecker nothingChecker = new NothingChecker();
    Computer computer = new Computer();
    Progress progress = new Progress();

    private final List<String> gameResult = new ArrayList<>();
    Integer[] answer = computer.getAnswer();
    int[] userNumbers;
    int ballNumber;
    int strikeNumber;
    boolean isNothing;

    public int startPlay(String input) {
        try {
            userNumbers = inputChecker.getUserNumbers(input);
            ballNumber = ballChecker.getBallResult(userNumbers, answer);
            strikeNumber = strikeChecker.getStrikeResult(userNumbers, answer);
            isNothing = nothingChecker.getNothingResult(userNumbers, answer);

            saveGameResult(ballNumber, strikeNumber, isNothing);
            printGameResult();
            removeGameResult();
            return getProgressNumber(strikeNumber);
        } catch (IllegalArgumentException | IOException | StringIndexOutOfBoundsException e) {
            System.out.println(e.getMessage());
        }
        return 1;
    }

    private int getProgressNumber(int strikeNumber) throws IOException {
        if (checkThreeStrike(strikeNumber)) {
            answer = computer.getAnswer();
            return progress.isProgressGame();
        }
        return 1;
    }

    private boolean checkThreeStrike(int strikeNumber) {
        if (strikeNumber == 3) {
            System.out.println("3개의 숫자를 모두 맞히셨습니다! 게임 종료");
            return true;
        }
        return false;
    }

    private void saveGameResult(int ballNumber, int strikeNumber, boolean isNothing) {
        if (ballNumber > 0) {
            gameResult.add(ballNumber + "볼");
        }
        if (strikeNumber > 0) {
            gameResult.add(strikeNumber + "스트라이크");
        }
        if (isNothing) {
            gameResult.add("낫싱");
        }
    }

    private void printGameResult() {
        for (String result : gameResult) {
            System.out.print(result + " ");
        }
        System.out.println();
    }

    private void removeGameResult() {
        gameResult.clear();
    }


}
