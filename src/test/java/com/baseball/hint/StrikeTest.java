package com.baseball.hint;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrikeTest {
    String playerInput = "123";

    @DisplayName("스트라이크 찾아 반환하는 테스트")
    @Test
    public void getStrike() {
        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        Strike Strike = new Strike(playerInput, answer);
        int strike = 3;
        Assertions.assertEquals(strike, Strike.getStrike());
    }

}