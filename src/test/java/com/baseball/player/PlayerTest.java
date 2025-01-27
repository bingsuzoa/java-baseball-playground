package com.baseball.player;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class PlayerTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3));

    @DisplayName("플레이어의 입력을 리스트로 저장하는 테스트")
    @Test
    public void 입력리스트저장() {
        Player player = new Player();
        player.saveValidatedInput("123");
        Assertions.assertEquals(inputList, player.getInputList());

    }

    @DisplayName("입력이 정답이면 게임 종료하는 테스트")
    @Test
    public void 정답인경우게임종료() {
        Player player = new Player();
        player.saveValidatedInput("123");
        Assertions.assertEquals(inputList, player.getInputList());

    }
}
