package com.baseballgame.referee;


import com.baseballgame.computer.Computer;
import com.baseballgame.host.Host;

import java.io.IOException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Judgement {
    private final int HIT_THE_BALL = 1;
    private final int MISS_THE_BALL = 0;
    Map<String, Integer> scoreBoard;

    Computer computer = new Computer();
    List<Integer> answer = computer.getNewAnswer();
    Host host = new Host();

    public boolean getPlayerInput(List<Integer> validatedInput) throws IOException {
        collectJudgement(validatedInput, answer);
        Result result = new Result(scoreBoard);
        if (result.isAnswer()) {
            answer = computer.getNewAnswer();
            return host.checkRestart();
        }
        return false;
    }

    private void collectJudgement(List<Integer> input, List<Integer> answer) {
        scoreBoard = new HashMap<>();
        int strikeCount = getStrikeCount(input, answer);
        int ballCount = getBallCount(input, answer, strikeCount);
        scoreBoard.put("스트라이크", strikeCount);
        scoreBoard.put("볼", ballCount);
        if (strikeCount == 0 && ballCount == 0) {
            scoreBoard.put("낫싱", 1);
        }
    }

    private int getStrikeCount(List<Integer> input, List<Integer> answer) {
        int strikeCount = 0;
        for (int i = 0; i < answer.size(); i++) {
            strikeCount += countNumberOfHits(input.get(i), answer.get(i));
        }
        return strikeCount;
    }

    private int getBallCount(List<Integer> input, List<Integer> answer, int strikeCount) {
        int ballCount = 0;
        for (int i = 0; i < answer.size(); i++) {
            ballCount += addBallCount(input, answer.get(i));
        }
        ballCount -= strikeCount;
        return ballCount;
    }

    private int addBallCount(List<Integer> input, int answer) {
        int ballCount = 0;
        for (int i = 0; i < input.size(); i++) {
            ballCount += countNumberOfHits(input.get(i), answer);
        }
        return ballCount;
    }

    private int countNumberOfHits(int input, int answer) {
        if (input == answer) {
            return HIT_THE_BALL;
        }
        return MISS_THE_BALL;
    }
}
