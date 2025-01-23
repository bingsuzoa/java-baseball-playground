package com.baseballgame.view;

import java.util.List;
import java.util.Map;

public class OutputView {


    public void printError(String errorMessage) {
        System.out.println(errorMessage);
    }


    public void printResult(List<String> resultPrintList, Map<String, Integer> scoreBoard) {
        for (String result : resultPrintList) {
            int score = scoreBoard.get(result);
            System.out.print(score + result + " ");
        }
        System.out.println();
    }

    public void printAnswer() {
        System.out.println("정답입니다.");
    }

    public void printNothing() {
        System.out.println("낫싱");
    }

}
