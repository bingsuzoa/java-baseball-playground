package com.baseball.player;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class StateTest {

    @DisplayName("정답 + 플레이어의 입력 1 , true 반환하여 게임 진행하는 테스트")
    @Test
    public void 정답일때입력받아게임진행여부확인() {
        State state = new State();
        int restartNumber = 1;
        Assertions.assertTrue(state.checkPlayerWantsToPlay(restartNumber));
    }

    @DisplayName("정답 + 플레이어의 입력 2 , false 반환하여 게임 종료하는 테스트")
    @Test
    public void 게임종료() {
        State state = new State();
        int restartNumber = 2;
        Assertions.assertFalse(state.checkPlayerWantsToPlay(restartNumber));
    }

    @DisplayName("오답인 경우 true 반환하여 게임 진행하는 테스트")
    @Test
    public void 오답일시게임진행() {
        State state = new State();
        int restartNumber = 1;
        Assertions.assertTrue(state.checkPlayerWantsToPlay(restartNumber));
    }
}
