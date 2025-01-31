package com.baseball.player;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayerTest {

//    @DisplayName("입력을 숫자리스트로 반환하는 테스트")
//    @Test
//    public void getInputList() {
//        Player player = new Player("123");
//        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
//        Assertions.assertEquals(answer, player.getInputList());
//    }
//
//    @DisplayName("유효한 입력의 경우 true 반환하는 테스트")
//    @Test
//    public void requestInputValidation_true_ifValidatedInput() {
//        Player player = new Player("123");
//        Assertions.assertTrue(player.requestInputValidation());
//    }
//
//    @DisplayName("유효한 입력이 아닌 경우 false 반환하는 테스트")
//    @ParameterizedTest
//    @ValueSource(strings = {"1s3", "122", "12345"})
//    public void requestInputValidation_false_ifNotValidatedInput(String value) {
//        Player player = new Player(value);
//        Assertions.assertFalse(player.requestInputValidation());
//    }
//
//    @DisplayName("플레이어의 게임 진행 상태를 확인하는 테스트 (continueToPlay : false 인 경우 게임종료)")
//    @Test
//    public void isContinueToPlay_false_ifInput_2() {
//        Player player = new Player("123");
//        int restartNumber = 2;
//        Assertions.assertFalse(player.isContinueToPlay(restartNumber));
//    }

}
