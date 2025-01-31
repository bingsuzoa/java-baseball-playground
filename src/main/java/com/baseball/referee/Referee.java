package com.baseball.referee;


import com.baseball.view.OutputView;

import java.util.List;

public class Referee {
    private final OutputView outputView;

    public Referee() {
        this.outputView = new OutputView();
    }

    public boolean isProperInput(String playerInput) {
        InputValidator inputValidator = new InputValidator(playerInput);
        if(inputValidator.isProperInput()) {
            return true;
        }
        return false;
    }

    public boolean isCorrect(String playerInput, List<Integer> answer) {
        Result result = new Result(playerInput, answer);
        outputView.printString(result.getHintMessage());
        return result.isCorrect();
    }
}