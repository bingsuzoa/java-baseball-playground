package com.baseball.view;

public class OutputView {
    private static final OutputView outputView = new OutputView();

    public static OutputView getInstance() {
        return outputView;
    }
    public void printString(String result) {
        System.out.println(result);
    }

    public void printMessage(Message message) {
        System.out.println(message.getMessage());
    }
}
