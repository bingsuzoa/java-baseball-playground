package com.baseballgame.player;

import com.baseballgame.view.OutputView;

import java.util.HashSet;
import java.util.Set;

public class InputValidator {
    OutputView outputView = new OutputView();

    public boolean isValidatedInput(String threeNumber) {
        try {
            validateOnlyNumberAndThreeCount(threeNumber);
            validateDuplicatedNumber(threeNumber);
            return true;
        } catch (IllegalArgumentException e) {
            outputView.printError(e.getMessage());
        }
        return false;
    }

    private void validateOnlyNumberAndThreeCount(String threeNumber) {
        if (!threeNumber.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(threeNumber + " : 1-9까지 3개의 숫자만 입력해주세요.");
        }
    }

    private void validateDuplicatedNumber(String threeNumber) {
        Set<Integer> duplicateChecker = new HashSet<>();
        for (int i = 0; i < threeNumber.length(); i++) {
            int number = Integer.parseInt(threeNumber.substring(i, i + 1));
            duplicateChecker.add(number);
        }
        if (duplicateChecker.size() != 3) {
            throw new IllegalArgumentException(threeNumber + " : 중복된 숫자는 입력할 수 없습니다.");
        }
    }
}
