package com.baseball;


import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    OutputView outputView = new OutputView();

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String getPlayerInput(Message message) {
        outputView.printEnumMessage(message);
        return scanner.nextLine();
    }

    public int getRestartInput(Message message) {
        try {
            outputView.printEnumMessage(message);
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            outputView.printEnumMessage(Message.INVALID_GAME_INPUT);
        }
        return 0;
    }
}
