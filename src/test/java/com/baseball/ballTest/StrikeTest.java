package com.baseball.ballTest;

import com.baseball.ball.Baseball;
import com.baseball.ball.Strike;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StrikeTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1, 2, 3));

    @DisplayName("플레이어의 입력에서 '스트라이크'를 찾아 리스트에 담는 테스트")
    @Test
    public void 스트라이크찾아랏() {
        Strike strike = new Strike();
        List<Integer> answer1 = new ArrayList<>(Arrays.asList(1, 2, 3));
        List<Baseball> strikeList1 = new ArrayList<>(Arrays.asList(Baseball.STRIKE, Baseball.STRIKE, Baseball.STRIKE));
        List<Integer> answer2 = new ArrayList<>(Arrays.asList(2, 3, 1));
        List<Baseball> strikeList2 = new ArrayList<>();
        List<Integer> answer3 = new ArrayList<>(Arrays.asList(1, 3, 2));
        List<Baseball> strikeList3 = new ArrayList<>(Arrays.asList(Baseball.STRIKE));
        Assertions.assertEquals(strikeList1, strike.getSTRIKE(inputList, answer1));
        Assertions.assertEquals(strikeList2, strike.getSTRIKE(inputList, answer2));
        Assertions.assertEquals(strikeList3, strike.getSTRIKE(inputList, answer3));
    }

}
