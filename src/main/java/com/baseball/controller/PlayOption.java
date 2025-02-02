package com.baseball.controller;

public enum PlayOption {
    RESTART(1, true),
    STOP(2, false),
    CONTINUE(0, true);

    private final int playNumber;
    private final boolean option;

    PlayOption(int playNumber, boolean option) {
        this.playNumber = playNumber;
        this.option = option;
    }

    public int getPlayNumber() {
        return playNumber;
    }

    public boolean getOption() {
        return option;
    }
}
