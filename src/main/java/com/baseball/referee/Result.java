package com.baseball.referee;


import com.baseball.hint.Ball;
import com.baseball.hint.Hint;
import com.baseball.hint.Strike;
import com.baseball.view.Message;

import java.util.List;


public class Result {
    private final int strikeCount;
    private final int ballCount;
    private final String hintMessage;

    private boolean isCorrect;

    public Result(List<Integer> inputList, List<Integer> answer) {
        strikeCount = new Strike(inputList, answer).getStrike();
        ballCount = new Ball(inputList, answer).getBall();
        hintMessage = getHintMap(strikeCount, ballCount);
    }

    public String getHint() {
        return hintMessage;
    }

    public boolean isCorrect() {
        return isCorrect;
    }

    private boolean checkIsCorrect(int strikeCount) {
        if (strikeCount == 3) {
            return true;
        }
        return false;
    }

    private String getHintMap(int strikeCount, int ballCount) {
        isCorrect = checkIsCorrect(strikeCount);
        StringBuilder hintMessage = new StringBuilder();
        if (strikeCount != 0) {
            hintMessage.append(strikeCount + Hint.STRIKE.getDescription() + " ");
        }
        if (ballCount != 0) {
            hintMessage.append(ballCount + Hint.BALL.getDescription());
        }
        if (strikeCount == 0 && ballCount == 0) {
            hintMessage.append(Hint.NOTHING.getDescription());
        }
        if(isCorrect) {
            hintMessage.append("\n" + Message.GAME_ANSWER_MESSAGE.getMessage());
        }
        return hintMessage.toString();
    }


}