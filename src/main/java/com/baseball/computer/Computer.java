package com.baseball.computer;


import com.baseball.referee.Result;

import java.util.*;

public class Computer {
    private List<Integer> answer;

    Random random = new Random();
    Result result = Result.getInstance();

    public List<Integer> getNewAnswer() {
        answer = makeRandomList();
        return answer;
    }

    public List<Integer> reMakeNewAnswer() {
        if(result.isThreeStrike()) {
            answer = makeRandomList();
            return answer;
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