package com.baseballgame.referee;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Result {
    private final int HIT_THE_BALL = 1;
    private final int MISS_THE_BALL = 0;
    private final String STRIKE = "스트라이크";
    private final String BALL = "볼";
    private final Map<String, Integer> scoreBoard = new HashMap<>();

    public Map<String, Integer> getResult() {
        return scoreBoard;
    }

    private Map<String, Integer> judge(List<Integer> input, List<Integer> answer) {
        int stikeCount = 0;
        int ballCount = 0;
        for(int i = 0; i < answer.size(); i++) {
            stikeCount += countNumberOfHits(input.get(i), answer.get(i));
        }
        for(int i = 0; i < answer.size(); i++)  {
            ballCount += addBallCount(input, answer.get(i), stikeCount);
        }
        scoreBoard.put(STRIKE, stikeCount);
        scoreBoard.put(BALL, ballCount);
        return scoreBoard;
    }

    private int addBallCount(List<Integer> input, int answer, int strikeCount) {
        int ballCount = 0;
        for(int i = 0; i < input.size(); i++) {
            ballCount = countNumberOfHits(input.get(i), answer);
        }
        ballCount -= strikeCount;
        return ballCount;
    }

    private int countNumberOfHits(int input, int answer) {
        if(input == answer) {
            return HIT_THE_BALL;
        }
        return MISS_THE_BALL;
    }
}
