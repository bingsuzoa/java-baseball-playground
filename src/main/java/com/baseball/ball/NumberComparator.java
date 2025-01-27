package com.baseball.ball;

import java.util.List;

public interface NumberComparator {

    void count(List<Integer> inputList, List<Integer> answer);

    default int compare(int number1, int number2) {
        if(number1 == number2) {
            return 1;
        }
        return 0;
    }

}