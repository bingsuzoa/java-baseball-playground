package com.baseball.player;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class StateTest {

    @DisplayName("정답인 경우 플레이어의 입력을 받고 게임 진행여부 결정하는 테스트 (1:진행 2:종료)")
    @Test
    public void 게임진행() {
        State restartState = new State();
        State stopState = new State();
        int restartNumber = 1;
        int stopGameNumber = 2;
        restartState.isRestartGame(restartNumber);
        stopState.isRestartGame(stopGameNumber);
        Assertions.assertTrue(restartState.getState());
        Assertions.assertFalse(stopState.getState());
    }

    /// ///에러테스트
    @DisplayName("1 또는 2 이외의 입력을 할 경우 예외 발생하는 테스트")
    @ParameterizedTest
    @ValueSource(ints = {3,5,0})
    public void 예외발생테스트(int value) {
        State restartState = new State();
        Assertions.assertThrows(IllegalArgumentException.class, ()-> {
            restartState.isRestartGame(value);
        });
    }

}
