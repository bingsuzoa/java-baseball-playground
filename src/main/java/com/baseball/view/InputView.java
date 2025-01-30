package com.baseball.view;

import java.util.Scanner;

public class InputView {
    private final int INVALID_NUMBER = 0;
    private Scanner scanner;

    OutputView outputView = new OutputView();

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String getPlayerInput(Message message) {
        outputView.printMessage(message);
        return scanner.nextLine();
    }

    public int getRestartInput(Message message) {
        try {
            outputView.printMessage(message);
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            outputView.printMessage(message);
        }
        return INVALID_NUMBER;
    }
}
