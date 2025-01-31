package com.baseball.player;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class InputValidatorTest {
//    /// ///해피 테스트
//    @DisplayName("플레이어의 입력이 유효한 입력인지 검증한 후 리턴하는 테스트")
//    @ParameterizedTest
//    @ValueSource(strings = {"123", "236"})
//    public void 유효한입력인경우리턴(String value) {
//        InputValidator inputValidator = new InputValidator(value);
//        Assertions.assertTrue(inputValidator.checkProperInput());
//    }
//
//    @DisplayName("플레이어의 문자열 입력을 숫자리스트로 리턴하는 테스트")
//    @Test
//    public void 숫자리스트리턴() {
//        InputValidator inputValidator = new InputValidator("123");
//        List<Integer> answer = new ArrayList<>(Arrays.asList(1, 2, 3));
//        Assertions.assertEquals(answer, inputValidator.getInputList());
//    }
//
//    /// ///예외 테스트
//    @DisplayName("플레이어의 입력이 숫자가 아닌경우 예외 발생")
//    @Test
//    public void 숫자가아니면예외() {
//        String playerInput = "1s3";
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            new InputValidator(playerInput).checkProperInput();
//        });
//    }
//
//    @DisplayName("플레이어의 입력이 1-9의 3자리가 아닌 경우 예외발생")
//    @ParameterizedTest
//    @ValueSource(strings = {"012", "1245"})
//    public void 일부터구까지의세자리수아니면예외(String playerInput) {
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            new InputValidator(playerInput).checkProperInput();
//        });
//
//    }
//
//    @DisplayName("플레이어의 입력이 중복인 경우 예외 발생")
//    @Test
//    public void 입력이중복인경우예외() {
//        String playerInput = "112";
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {
//            new InputValidator(playerInput).checkProperInput();
//        });
//    }
}
