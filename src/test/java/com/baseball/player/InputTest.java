package com.baseball.player;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class InputTest {
    List<Integer> inputList = new ArrayList<>(Arrays.asList(1,2,3));

    @DisplayName("플레이어 입력을 리스트로 바꾸는 테스트")
    @Test
    public void 플레이어입력_리스트로변경() {
        Input input = new Input("123");
        Assertions.assertEquals(inputList, input.convertInputToList());
    }

    @DisplayName("플레이어 입력이 유효한지 판별하는 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"123","256", "259"})
    public void 플레이어입력_유효하면트루(String value) {
        Input input = new Input(value);
        Assertions.assertTrue(input.isValid());
    }

    /// ///////예외 테스트
    @DisplayName("유효하지 않은 입력은 예외 출력하는 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"1x3","012", "112"})
    public void 플레이어입력_유효한가요(String value) {
        Input input = new Input(value);
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            input.isValid();
        });
    }

}
