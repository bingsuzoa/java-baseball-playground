package com.baseball;

import com.baseball.player.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameServiceTest {
    List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));

//    @DisplayName("플레이어의 입력이 정답인 경우 true")
//    @Test
//    public void 테스트1() {
//        Player player = new Player("123");
//        GameService gameService = new GameService(player, answer);
//        boolean isProperInput = true;
//        Assertions.assertTrue(gameService.startGameAndIsAnswer(isProperInput));
//    }
//
//    @DisplayName("플레이어의 입력이 오답인 경우 false")
//    @Test
//    public void 테스트2() {
//        Player player = new Player("213");
//        GameService gameService = new GameService(player, answer);
//        boolean isProperInput = true;
//        Assertions.assertFalse(gameService.startGameAndIsAnswer(isProperInput));
//    }
}
