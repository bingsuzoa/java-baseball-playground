package com.baseball.computer;

import java.util.*;

public class Computer {
    private List<Integer> answer;

    Random random = new Random();

    public Computer() {
        answer = new ArrayList<>();
    }

    public List<Integer> getAnswer() {
        answer = makeRandomList();
        return answer;
    }

    public List<Integer> getReAnswer(boolean isCorrect) {
        if(isCorrect) {
            answer.clear();
            answer = makeRandomList();
        }
        return answer;
    }

    private List<Integer> makeRandomList() {
        List<Integer> answer = new ArrayList<>();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < 3) {
            uniqueNumbers.add(makeRandomNumber());
        }
        for (int number : uniqueNumbers) {
            answer.add(number);
        }
        return answer;
    }

    private int makeRandomNumber() {
        return random.nextInt(9) + 1;
    }
}