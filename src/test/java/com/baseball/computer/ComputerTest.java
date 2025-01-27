package com.baseball.computer;

import com.baseball.player.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class ComputerTest {

    @DisplayName("1~9까지의 중복아닌 3자리 랜덤 수 출력하는 테스트")
    @Test
    public void 출력랜덤테스트() {
        Computer computer = new Computer();
        StringBuilder result = new StringBuilder();
        List<Integer> answerList = computer.getNewAnswer();
        for(int value : answerList) {
            result.append(value);
        }
        Input input = new Input(result.toString());
        Assertions.assertTrue(input.isValid());
    }
}
