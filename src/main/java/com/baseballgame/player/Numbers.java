package com.baseballgame.player;


import com.baseballgame.referee.Judgement;

import java.util.ArrayList;
import java.util.List;

public class Numbers {
    InputValidator inputValidator = new InputValidator();
    Judgement judgement = new Judgement();


    public boolean sendInputToReferee(String threeNumbers, List<Integer> answer) {
        if (inputValidator.isValidatedInput(threeNumbers)) {
            return judgement.getPlayerInput(convertStringToList(threeNumbers), answer);
        }
        return false;
    }

    private List<Integer> convertStringToList(String threeNumbers) {
        List<Integer> input = new ArrayList<>();
        for (int i = 0; i < threeNumbers.length(); i++) {
            input.add(Integer.parseInt(threeNumbers.substring(i, i + 1)));
        }
        return input;
    }
}
