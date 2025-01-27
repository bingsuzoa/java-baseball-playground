package com.baseball;

public class OutputView {


    public void printResult(String result) {
        System.out.print(result);
    }

    public void printError(Message message) {
        System.out.println(message.getMessage());
    }


}
