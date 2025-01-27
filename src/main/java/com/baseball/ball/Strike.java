package com.baseball.ball;

import java.util.ArrayList;
import java.util.List;

public class Strike implements NumberComparator {
    private List<Baseball> strikeList;

    @Override
    public void count(List<Integer> inputList, List<Integer> answer) {
        strikeList = new ArrayList<>();
        int sum = 0;
        for (int i = 0; i < inputList.size(); i++) {
            sum += compare(inputList.get(i), answer.get(i));
        }
        for(int i = 0; i < sum; i++) {
            strikeList.add(Baseball.STRIKE);
        }
    }

    public List<Baseball> getSTRIKE(List<Integer> inputList, List<Integer> answer) {
        count(inputList, answer);
        return strikeList;
    }


}
