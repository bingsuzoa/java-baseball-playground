package com.baseball.referee;


import com.baseball.ball.Ball;
import com.baseball.ball.Baseball;
import com.baseball.ball.Strike;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Result {
    private final List<Baseball> resultList;

    Ball ball = new Ball();
    Strike strike = new Strike();

    public Result() {
        resultList = new ArrayList<>();
    }

    public List<Baseball> getResult() {
        return resultList;
    }

    public boolean isThreeStrike() {
        Set<Baseball> resultCollector = new HashSet<>();
        for(Baseball result : resultList) {
            resultCollector.add(result);
        }
        if(resultCollector.size() == 1 && resultCollector.contains(Baseball.STRIKE)) {
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
