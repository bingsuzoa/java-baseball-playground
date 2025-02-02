package com.baseball.player;


import com.baseball.model.player.Player;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class PlayerTest {
    Player player = new Player();

    @DisplayName("게임 진행 여부를 결정하는 숫자가 2인 경우 false 반환하는 테스트")
    @Test
    public void isContinueToPlay_false_ifInputTwo() {
        int restartNumber = 2;
        Assertions.assertFalse(player.isContinueToPlay(restartNumber));

    }

    @DisplayName("게임 진행 여부를 결정하는 숫자가 1인 경우 true 반환하는 테스트")
    @Test
    public void isContinueToPlay_true_ifInputOne() {
        int restartNumber = 1;
        Assertions.assertTrue(player.isContinueToPlay(restartNumber));

    }
}
