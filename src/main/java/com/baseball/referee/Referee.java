package com.baseball.referee;


import com.baseball.Message;
import com.baseball.OutputView;
import com.baseball.ball.Baseball;

import java.util.List;

public class Referee {
    private Result result;

    OutputView outputView = new OutputView();

    public Referee () {
        this.result = Result.getInstance();
    }

    public void judgeAndGetResult(List<Integer> inputList, List<Integer> answer) {
        result.collectBallAndStrike(inputList, answer);
        printResult();
    }

    public boolean isThreeStrike() {
        return result.isThreeStrike();
    }

    private void printResult() {
        StringBuilder builder = new StringBuilder();
        int ballCount = 0;
        int strikeCount = 0;
        if (result.getResult().isEmpty()) {
            builder.append(Baseball.NOTHING.getDescription());
        }
        for (Baseball result : result.getResult()) {
            strikeCount += Baseball.STRIKE.getCount(result);
            ballCount += Baseball.BALL.getCount(result);
        }
        if (strikeCount > 0) {
            builder.append(strikeCount + Baseball.STRIKE.getDescription());
        }
        if (ballCount > 0) {
            builder.append(ballCount + Baseball.BALL.getDescription());
        }
        outputView.printStringMessage(builder.toString());
        if (strikeCount == 3) {
            outputView.printEnumMessage(Message.ANSWER_MESSAGE);
        }
    }


}
