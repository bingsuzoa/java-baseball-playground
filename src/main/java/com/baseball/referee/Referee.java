package com.baseball.referee;


import com.baseball.OutputView;
import com.baseball.ball.Baseball;

import java.util.List;

public class Referee {
    private Result result;

    OutputView outputView = new OutputView();

    public Referee() {
        this.result = new Result();
    }

    public void judgeAndGetResult(List<Integer> inputList, List<Integer> answer) {
        result.collectBallAndStrike(inputList, answer);
        printResult();
    }

    public boolean isThreeStrike() {
        return result.isThreeStrike();
    }

    private void printResult() {
        int ballCount = 0;
        int strikeCount = 0;
        if (result.getResult().isEmpty()) {
            outputView.printResult(Baseball.NOTHING.getDescription());
        }
        for (Baseball result : result.getResult()) {
            strikeCount += Baseball.STRIKE.getCount(result);
            ballCount += Baseball.BALL.getCount(result);
        }
        if (strikeCount > 0) {
            outputView.printResult(strikeCount + Baseball.STRIKE.getDescription());
        }
        if (ballCount > 0) {
            outputView.printResult(ballCount + Baseball.BALL.getDescription());
        }
        if (strikeCount == 3) {
            outputView.printResult("\n" + "정답입니다.");
        }
    }


}
