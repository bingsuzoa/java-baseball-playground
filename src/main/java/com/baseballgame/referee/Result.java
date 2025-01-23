package com.baseballgame.referee;

import com.baseballgame.view.OutputView;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private final int ANSWER_COUNT = 3;
    private final Map<String, Integer> scoreBoard;
    private List<String> resultPrintList;

    OutputView outputView = new OutputView();

    public Result(Map<String, Integer> scoreBoard) {
        this.scoreBoard = new HashMap<>(scoreBoard);
    }

    public boolean isAnswer() {
        commandPrint();
        if (scoreBoard.get("스트라이크") == ANSWER_COUNT) {
            outputView.printAnswer();
            return true;
        }
        return false;
    }

    private void commandPrint() {
        if(!checkResultNothing()) {
            checkResultStrikeOrBall();
        }
    }
    private boolean checkResultNothing() {
        if (scoreBoard.containsKey("낫싱")) {
            outputView.printNothing();
            return true;
        }
        return false;
    }

    private void checkResultStrikeOrBall() {
        for(String result : scoreBoard.keySet()) {
            insertResultIfCountNotZero(result);
        }
        outputView.printResult(resultPrintList, scoreBoard);
    }

    private void insertResultIfCountNotZero(String result) {
        if(scoreBoard.get(result) != 0 && !result.equals("낫싱")) {
            resultPrintList = new ArrayList<>();
            resultPrintList.add(result);
        }
    }

}
