package com.baseball.ball;

public enum Baseball {
    STRIKE("스트라이크 "),
    BALL("볼 "),
    NOTHING("낫싱");

    private final String description;

    Baseball(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public int getCount(Baseball result) {
        if(this.equals(result)) {
            return 1;
        }
        return 0;
    }


}
