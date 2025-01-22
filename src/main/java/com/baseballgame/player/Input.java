package com.baseballgame.player;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Input {
    private final List<Integer> numbers;

    public Input(String threeNumber) {
        validateOnlyNumberAndThreeCount(threeNumber);
        validateDuplicatedNumber(threeNumber);
        this.numbers = new ArrayList<>(convertStringToList(threeNumber));
    }

    public List<Integer> getInput() {
        return numbers;
    }


    private void validateOnlyNumberAndThreeCount(String threeNumber) {
        threeNumber = threeNumber.replace(" ", "");
        if(!threeNumber.matches("[1-9]{3}")) {
            throw new IllegalArgumentException(threeNumber + " : 1-9까지 3개의 숫자만 입력해주세요.");
        }
    }

    private void validateDuplicatedNumber(String threeNumber) {
        Set<Integer> duplicateChecker = new HashSet<>();
        for(int i = 0; i < threeNumber.length(); i++) {
            int number = Integer.parseInt(threeNumber.substring(i, i+1));
            duplicateChecker.add(number);
        }
        if(duplicateChecker.size() != 3) {
            throw new IllegalArgumentException(threeNumber + " : 중복된 숫자는 입력할 수 없습니다.");
        }
    }

    private List<Integer> convertStringToList(String numbers) {
        List<Integer> input = new ArrayList<>();
        for(int i = 0; i < numbers.length(); i++) {
            input.add(Integer.parseInt(numbers.substring(i, i+1)));
        }
        return input;
    }
}
