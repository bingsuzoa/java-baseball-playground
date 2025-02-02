package com.baseball.referee;

import com.baseball.model.referee.InputValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;


public class InputValidatorTest {

    @DisplayName("플레이어의 입력이 유효한지 확인하는 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"123", "236"})
    public void isProperInput_true_ifValidatedInput(String value) {
        InputValidator inputValidator = new InputValidator(value);
        Assertions.assertTrue(inputValidator.isProperInput());
    }


    @DisplayName("플레이어의 입력이 올바르지 않은 경우 false 반환하는 테스트")
    @ParameterizedTest
    @ValueSource(strings = {"1s3", "012", "1245", "112"})
    public void isNumber1_9AndThree_IllegalArgumentException_ifNotNumber(String playerInput) {
        InputValidator inputValidator = new InputValidator(playerInput);
        Assertions.assertFalse(inputValidator.isProperInput());
    }

}