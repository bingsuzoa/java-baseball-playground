package com.baseball.referee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ResultTest {
    List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
    String playerInput = "123";


    @DisplayName("정답여부를 반환하는 테스트")
    @Test
    public void isCorrect_true_ifAnswer() {
        Result result = new Result(playerInput, answer);
        Assertions.assertTrue(result.isCorrect());
    }

    @DisplayName("힌트 메세지를 반환하는 테스트")
    @Test
    public void getHintMessage() {
        playerInput = "213";
        Result result = new Result(playerInput, answer);
        Assertions.assertEquals("1스트라이크 2볼", result.getHintMessage());
    }


}
