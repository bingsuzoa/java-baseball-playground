package com.baseball.referee;

import com.baseball.view.Message;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RefereeTest {
    List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
    String playerInput = "123";
    Referee referee = new Referee();

    @DisplayName("플레이어의 입력이 적절한지 반환하는 테스트")
    @Test
    public void jisProperInput_true_ifProperInput() {
        Assertions.assertTrue(referee.isProperInput(playerInput));
    }

    @DisplayName("정답인 경우 true 반환하는 테스트")
    @Test
    public void isCorrect_true_ifAnswered() {
        Assertions.assertTrue(referee.isCorrect(playerInput ,answer));
    }

    @DisplayName("정답 아닌경우 false 반환하는 테스트")
    @Test
    public void isCorrect_false_ifNotAnswered() {
        answer = new ArrayList<>(Arrays.asList(1, 3, 2));
        Assertions.assertFalse(referee.isCorrect(playerInput ,answer));
    }

}
