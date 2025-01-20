package com.baseballgame.game;

import com.baseballgame.computer.Computer;
import com.baseballgame.rule.BallChecker;
import com.baseballgame.rule.InputChecker;
import com.baseballgame.rule.NothingChecker;
import com.baseballgame.rule.StrikeChecker;
import java.io.IOException;

public class Game {
    InputChecker inputChecker = new InputChecker();
    StrikeChecker strikeChecker = new StrikeChecker();
    BallChecker ballChecker = new BallChecker();
    NothingChecker nothingChecker = new NothingChecker();
    Computer computer = new Computer();
    Progress progress = new Progress();
    ResultManagement resultManagement = new ResultManagement();

    Integer[] answer = computer.getAnswer();
    int strikeNumber;

    public int startPlay(String input) {
        try {
            int[] userNumbers = inputChecker.getUserNumbers(input);
            int ballNumber = ballChecker.getBallResult(userNumbers, answer);
            strikeNumber = strikeChecker.getStrikeResult(userNumbers, answer);
            boolean isNothing = nothingChecker.getNothingResult(userNumbers, answer);

            resultManagement.getGameResult(ballNumber, strikeNumber, isNothing);
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
}
