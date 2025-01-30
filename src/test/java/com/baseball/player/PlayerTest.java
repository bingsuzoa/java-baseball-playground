package com.baseball.player;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


public class PlayerTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3));

    @DisplayName("input객체로부터 리스트받아 리턴하는 테스트")
    @Test
    public void 플레이어의입력을리스트로변경() {
        String playerInput = "123";
        Player player = new Player(playerInput);
        Assertions.assertEquals(inputList, player.getPlayerInput());
    }

    @DisplayName("input객체가 적절한 입력인지 확인한 결과 가져오는 테스트")
    @Test
    public void 확인() {
        String playerInput = "123";
        Player player = new Player(playerInput);
        Assertions.assertTrue(player.isProperInput());
    }

    @DisplayName("플레이어의 게임 진행 상태를 확인하는 테스트 (wantsToPlay : false 인 경우 게임종료)")
    @Test
    public void 플레이어의게임진행상태확인하는테스트() {
        Player player = new Player("123");
        boolean isCorrect = false;
        int restartNumber = 1;
        Assertions.assertTrue(player.getPlayingState(isCorrect, restartNumber));
    }

}
