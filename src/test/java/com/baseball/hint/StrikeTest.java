package com.baseball.hint;

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
        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        Strike strike = new Strike(inputList, answer);
        int strikeCount = 3;
        Assertions.assertEquals(strikeCount, strike.getStrikeCount());
    }

}