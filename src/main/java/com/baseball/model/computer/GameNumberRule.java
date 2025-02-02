package com.baseball.model.computer;

public enum GameNumberRule {
    COUNT(3),
    RANGE_START(1),
    RANGE_END(9);

    private final int value;

    GameNumberRule(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
