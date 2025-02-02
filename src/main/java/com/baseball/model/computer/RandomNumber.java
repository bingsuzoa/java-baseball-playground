package com.baseball.model.computer;

import java.util.*;

public class RandomNumber implements AnswerGenerator {
    private List<Integer> answer;
    private final Random random;


    public RandomNumber() {
        this.answer = new ArrayList<>();
        this.random = new Random();
    }

    @Override
    public List<Integer> getAnswer(boolean isCorrect) {
        if (answer.isEmpty() || isCorrect) {
            this.answer = makeRandomList();
            return answer;
        }
        return answer;
    }

    private List<Integer> makeRandomList() {
        clearAnswer();
        Set<Integer> uniqueNumbers = new HashSet<>();
        while (uniqueNumbers.size() < 3) {
            uniqueNumbers.add(makeRandomNumber());
        }
        for (int number : uniqueNumbers) {
            answer.add(number);
        }
        return answer;
    }

    private void clearAnswer() {
        if (!answer.isEmpty()) {
            answer.clear();
        }
    }

    private int makeRandomNumber() {
        return random.nextInt(9) + 1;
    }
}