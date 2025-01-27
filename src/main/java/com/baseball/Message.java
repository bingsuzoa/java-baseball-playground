package com.baseball;

public enum Message {
    INVALID_GAME_INPUT("유효하지 않은 입력입니다."),
    DUPLICATED_GAME_INPUT("중복된 숫자는 입력할 수 없습니다."),
    GAME_INPUT_MESSAGE("숫자를 입력하세요 : "),
    GAME_RESTART_MESSAGE("게임을 다시 시작하려면 1, 종료하려면 2을 입력해주세요.");

    private final String message;

    Message(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }
}