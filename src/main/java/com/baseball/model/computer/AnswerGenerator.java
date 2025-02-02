package com.baseball.model.computer;

import java.util.List;

public interface AnswerGenerator {

    List<Integer> getAnswer(boolean isCorrect);
}