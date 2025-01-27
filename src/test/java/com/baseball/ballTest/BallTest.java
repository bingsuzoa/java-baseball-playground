package com.baseball.ballTest;

import com.baseball.ball.Ball;
import com.baseball.ball.Baseball;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class BallTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3));

    @DisplayName("플레이어의 입력에서 '볼'을 찾아 리스트에 담는 테스트")
    @Test
    public void 플레이어입력_정답과비교() {
        Ball ball = new Ball();
        List<Integer> answer1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Baseball> ballList1 = new ArrayList<>();
        List<Integer> answer2 = new ArrayList<>(Arrays.asList(2, 3, 1));
        List<Baseball> ballList2 = new ArrayList<>(Arrays.asList(Baseball.BALL, Baseball.BALL, Baseball.BALL));
        List<Integer> answer3 = new ArrayList<>(Arrays.asList(1, 3, 2));
        List<Baseball> ballList3 = new ArrayList<>(Arrays.asList(Baseball.BALL, Baseball.BALL));
        Assertions.assertEquals(ballList1, ball.getBALL(inputList, answer1));
        Assertions.assertEquals(ballList2, ball.getBALL(inputList, answer2));
        Assertions.assertEquals(ballList3, ball.getBALL(inputList, answer3));

    }
}
