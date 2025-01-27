package com.baseball.ball;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Ball implements NumberComparator {
    private List<Baseball> ballList;

    Strike strike = new Strike();

    @Override
    public void count(List<Integer> inputList, List<Integer> answer) {
        ballList = new ArrayList<>();
        int sum = inputList.size() + answer.size();
        Set<Integer> uniqueNumbers = new HashSet<>();
        for (int i = 0; i < inputList.size(); i++) {
            uniqueNumbers.add(inputList.get(i));
            uniqueNumbers.add(answer.get(i));
        }
        sum -= uniqueNumbers.size();
        sum -= strike.getSTRIKE(inputList, answer).size();
        for(int i = 0; i < sum; i ++) {
            ballList.add(Baseball.BALL);
        }
    }

    public List<Baseball> getBALL(List<Integer> inputList, List<Integer> answer) {
        count(inputList, answer);
        return ballList;
    }


}
