package com.baseball.model.referee;


import com.baseball.model.hint.Ball;
import com.baseball.model.hint.Hint;
import com.baseball.model.hint.Strike;
import com.baseball.view.Message;

import java.util.List;


public class Result {
    private final int strike;
    private final int ball;
    private final String hintMessage;

    private boolean isCorrect;

    public Result(String playerInput, List<Integer> answer) {
        strike = new Strike(playerInput, answer).getStrike();
        ball = new Ball(playerInput, answer).getBall();
        hintMessage = getHintMap(strike, ball);
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    public String getHintMessage() {
        return hintMessage;
    }

    private boolean checkIsCorrect(int strike) {
        if (strike == 3) {
            return true;
        }
        return false;
    }

    private String getHintMap(int strike, int ball) {
        isCorrect = checkIsCorrect(strike);
        StringBuilder hintMessage = new StringBuilder();
        if (strike != 0) {
            hintMessage.append(strike + Hint.STRIKE.getDescription() + " ");
        }
        if (ball != 0) {
            hintMessage.append(ball + Hint.BALL.getDescription());
        }
        if (strike == 0 && ball == 0) {
            hintMessage.append(Hint.NOTHING.getDescription());
        }
        if (isCorrect) {
            hintMessage.append("\n" + Message.GAME_ANSWER_MESSAGE.getMessage());
        }
        return hintMessage.toString();
    }


}