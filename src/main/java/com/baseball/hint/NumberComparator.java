package com.baseball.hint;


public interface NumberComparator {


    default int compare(int number1, int number2) {
        if(number1 == number2) {
            return 1;
        }
        return 0;
    }

}