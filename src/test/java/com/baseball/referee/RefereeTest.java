package com.baseball.referee;


import com.baseball.ball.Baseball;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class RefereeTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3));

    @DisplayName("결과 판정하는 테스트")
    @Test
    public void 결과판정테스트() {
        Referee referee = new Referee();
        List<Integer> answer1 = new ArrayList<>(Arrays.asList(2,1,3));
        List<Integer> answer2 = new ArrayList<>(Arrays.asList(1,2,3));
        List<Baseball> printList1 = new ArrayList<>(Arrays.asList(Baseball.BALL, Baseball.BALL, Baseball.STRIKE));
        List<Baseball> printList2 = new ArrayList<>(Arrays.asList( Baseball.STRIKE,  Baseball.STRIKE, Baseball.STRIKE));
        Assertions.assertEquals(printList1, referee.judgeAndGetResult(inputList,answer1));
        Assertions.assertEquals(printList2, referee.judgeAndGetResult(inputList,answer2));

    }

    @DisplayName("정답 출력 테스트")
    @Test
    public void 정답출력테스트() {
        Referee referee = new Referee();
        referee.isThreeStrike();

    }


}
