package com.baseball;


import com.baseball.view.InputView;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.*;

public class GameServiceTest {

    @DisplayName("플레이어의 입력이 정답인 경우 hint 출력 및 true 반환하는 테스트")
    @Test
    public void getHintAndIsAnswer() {
        InputView inputView = new InputView();
        GameService gameService = new GameService(inputView);
        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
        Assertions.assertTrue(gameService.startGameAndIsAnswer("123", answer));
    }

    @DisplayName("플레이어의 입력에 따라 게임 진행 여부 결정하는 테스트 : 2 입력 시 false 반환")
    @Test
    public void continueToPlay_false_ifInputTwo() {
        InputView inputView = new InputView();
        GameService gameService = new GameService(inputView);
        int restartNumber = 2;
        Assertions.assertFalse(gameService.continueToPlay(restartNumber));
    }

    @DisplayName("플레이어의 입력에 따라 게임 진행 여부 결정하는 테스트 : 1 입력 시 true 반환")
    @Test
    public void continueToPlay_true_ifInputOne() {
        InputView inputView = new InputView();
        GameService gameService = new GameService(inputView);
        int restartNumber = 1;
        Assertions.assertTrue(gameService.continueToPlay(restartNumber));
    }


}
