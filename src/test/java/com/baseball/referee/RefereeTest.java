package com.baseball.referee;

import com.baseball.model.computer.AnswerGenerator;
import com.baseball.model.referee.Referee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RefereeTest {
    List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
    AnswerGenerator answerGenerator = new FixedAnswerGenerator(answer);
    Referee referee = new Referee(answerGenerator);


    @DisplayName("플레이어의 입력이 적절한지 반환하는 테스트")
    @Test
    public void jisProperInput_true_ifProperInput() {
        String playerInput = "123";
        Assertions.assertTrue(referee.isProperInput(playerInput));
    }

    @DisplayName("힌트 메세지를 반환하는 테스트")
    @Test
    public void getHintMessage() {
        String playerInput = "213";
        referee.isCorrect(playerInput);
        Assertions.assertEquals("1스트라이크 2볼", referee.getHintMessage());
    }

    @DisplayName("정답인 경우 true 반환하는 테스트")
    @Test
    public void isCorrect_true_ifAnswered() {
        String playerInput = "123";
        Assertions.assertTrue(referee.isCorrect(playerInput));
    }

    @DisplayName("정답 아닌경우 false 반환하는 테스트")
    @Test
    public void isCorrect_false_ifNotAnswered() {
        String playerInput = "213";
        Assertions.assertFalse(referee.isCorrect(playerInput));
    }

}
