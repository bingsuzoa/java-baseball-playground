package com.baseball.referee;


import com.baseball.ball.Ball;
import com.baseball.ball.Baseball;
import com.baseball.ball.Strike;

import java.util.ArrayList;
import java.util.List;

public class Result {
    private static Result result;
    private final List<Baseball> resultList;

    Ball ball = new Ball();
    Strike strike = new Strike();

    public Result () {
        resultList = new ArrayList<>();
    }

    public static Result getInstance() {
        if(result == null) {
            result = new Result();
        }
        return result;
    }

    public List<Baseball> getResult() {
        return resultList;
    }

    public boolean isThreeStrike() {
        if(strike.isThreeStrike()) {
            return true;
        }
        return false;
    }

    public void collectBallAndStrike(List<Integer> inputList, List<Integer> answer) {
        resultList.clear();
        List<Baseball> ballPocket = ball.getBALL(inputList, answer);
        List<Baseball> strikePocket = strike.getSTRIKE(inputList, answer);
        resultList.addAll(ballPocket);
        resultList.addAll(strikePocket);
    }

}
