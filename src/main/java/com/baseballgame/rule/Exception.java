package com.baseballgame.rule;

import java.util.HashSet;
import java.util.Set;

public class Exception {

    protected void isValidInputNumber(String input) {
        if (input.length() != 3) {
            throw new StringIndexOutOfBoundsException(input + " : 올바른 입력 개수가 아닙니다. 3개의 입력이 필요합니다.");
        }
    }

    protected void isDuplicatedInput(String input) {
        Set<Character> setForCheckDuplicatedInput = new HashSet<>();

        for (int i = 0; i < input.length(); i++) {
            setForCheckDuplicatedInput.add(input.charAt(i));
        }
        if (setForCheckDuplicatedInput.size() != 3) {
            throw new IllegalArgumentException(input + " : 중복된 입력이 있습니다. 서로 다른 숫자 3개의 입력이 필요합니다.");
        }
    }

    protected void isNumberInput(String input) {
        if (!input.matches("[1-9]+")) {
            throw new IllegalArgumentException(input + " : 게임이 불가능한 입력값이 있습니다. 1~9까지의 숫자 입력이 필요합니다.");
        }
    }
}
