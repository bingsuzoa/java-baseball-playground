package com.baseballgame.computer;

import java.util.*;

public class Computer {

    private List<Integer> answer;
    Random random = new Random();

    public List<Integer> getNewAnswer() {
        return makeRandomList();
    }

    private List<Integer> makeRandomList() {
        Set<Integer> uniqueNumbers = new HashSet<>();
        while(uniqueNumbers.size() < 3) {
            uniqueNumbers.add(makeRandomNumber());
        }
        answer = new ArrayList<>(uniqueNumbers);
        return answer;
    }

    private int makeRandomNumber() {
        return random.nextInt(9)+1;
    }
}
