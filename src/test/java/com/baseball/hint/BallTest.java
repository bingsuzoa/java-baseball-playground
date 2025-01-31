package com.baseball.hint;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class BallTest {
    String playerInput = "123";

    @DisplayName("볼 찾아 반환하는 테스트")
    @Test
    public void getBall() {
        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        Ball Ball = new Ball(playerInput, answer);
        int ball = 0;
        Assertions.assertEquals(ball, Ball.getBall());
    }
}
