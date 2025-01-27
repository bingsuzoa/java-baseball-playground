package com.baseball.referee;

import com.baseball.ball.Baseball;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ResultTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3));

    @DisplayName("스트라이크 / 볼 카운트 종합하는 테스트")
    @Test
    public void 결과판정테스트() {
        Result result1 = new Result();
        Result result2 = new Result();
        List<Integer> answer1 = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> answer2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Baseball> printList1 = new ArrayList<>(Arrays.asList(Baseball.BALL, Baseball.BALL, Baseball.STRIKE));
        List<Baseball> printList2 = new ArrayList<>(Arrays.asList( Baseball.STRIKE,  Baseball.STRIKE, Baseball.STRIKE));
        result1.collectBallAndStrike(inputList, answer1);
        result2.collectBallAndStrike(inputList, answer2);
        Assertions.assertEquals(printList1, result1.getResult());
        Assertions.assertEquals(printList2, result2.getResult());
    }

    @DisplayName("3스트라이크 확인하는 테스트")
    @Test
    public void 스트라이크확인() {
        Result result1 = new Result();
        Result result2 = new Result();
        List<Integer> answer1 = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> answer2 = new ArrayList<>(Arrays.asList(1,2,3));
        result1.collectBallAndStrike(inputList, answer1);
        result2.collectBallAndStrike(inputList, answer2);
        Assertions.assertFalse(result1.isThreeStrike());
        Assertions.assertTrue(result2.isThreeStrike());
    }
}
