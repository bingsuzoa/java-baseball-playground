package com.baseball;


import java.util.Scanner;

public class InputView {
    private Scanner scanner;

    OutputView outputView = new OutputView();

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String getPlayerInput(Message message) {
        System.out.println(message.getMessage());
        return scanner.nextLine();
    }

    public int getRestartInput(Message message) {
        try {
            System.out.println(message.getMessage());
            return scanner.nextInt();
        } catch (NumberFormatException e) {
            outputView.printError(Message.INVALID_GAME_INPUT);
        }
        return 0;
    }
}
