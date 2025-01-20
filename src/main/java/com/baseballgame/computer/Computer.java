package com.baseballgame.computer;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Computer {
    private Integer[] answer = new Integer[3];


    private Integer[] createAnswer() {
        Set<Integer> DuplicationCheck = new HashSet<>();

        while (DuplicationCheck.size() < 3) {
            DuplicationCheck.add(createRandomNumber());
        }

        Integer[] answer = DuplicationCheck.toArray(new Integer[0]);
        return answer;
    }

    private int createRandomNumber() {
        Random random = new Random();
        int randomNumber = random.nextInt(9) + 1;
        return randomNumber;
    }

    public Integer[] getAnswer() {
        answer = createAnswer();
        return answer;
    }
}
