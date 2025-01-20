package com.baseballgame.game;

import java.util.ArrayList;
import java.util.List;

public class ResultManagement {
    private final List<String> gameResult = new ArrayList<>();

    public void getGameResult(int ballNumber, int strikeNumber, boolean isNothing) {
        saveGameResult(ballNumber, strikeNumber, isNothing);
        printGameResult();
        removeGameResult();
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
