package com.baseball.view;

import java.util.Scanner;

public class InputView {
    private static final InputView inputView = new InputView();
    private final OutputView outputView;
    private final Scanner scanner;

    private InputView () {
        this.scanner = new Scanner(System.in);
        this.outputView = OutputView.getInstance();
    }

    public static InputView getInstance() {
        return inputView;
    }

    public String getPlayerInput(Message message) {
            outputView.printMessage(message);
            return scanner.nextLine();
    }

    public int getRestartInput(Message message) {
        int endGameNumber = 0;
        try {
            outputView.printMessage(message);
            int restartNumber = scanner.nextInt();
            scanner.nextLine();
            return restartNumber;
        } catch (NumberFormatException e) {
            outputView.printMessage(message);
        }
        return endGameNumber;
    }
}
