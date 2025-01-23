package com.baseballgame.view;


import java.util.Scanner;

public class InputView {
    private final Scanner scanner;

    public InputView() {
        this.scanner = new Scanner(System.in);
    }

    public String getThreeNumbers() {
        System.out.println("숫자를 입력하세요.");
        return scanner.nextLine().trim();
    }

    public String getRestartNumber() {
        System.out.println("게임을 다시 하려면 1, 종료하려면 2를 입력해주세요.");
        return scanner.nextLine().trim();

    }


}
