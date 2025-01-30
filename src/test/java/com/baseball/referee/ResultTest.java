package com.baseball.referee;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class ResultTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3));
    List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
    Result result = new Result(inputList, answer);


    @DisplayName("힌트 출력")
    @Test
    public void 힌트출력() {
        String hintMessage = "3스트라이크 ";
        Assertions.assertEquals(hintMessage, result.getHint());
    }

    @DisplayName("정답여부 확인")
    @Test
    public void 정답여부확인() {
        Assertions.assertTrue(result.isCorrect());
    }


}
