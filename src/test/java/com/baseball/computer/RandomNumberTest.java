package com.baseball.computer;


import com.baseball.model.computer.AnswerGenerator;
import com.baseball.model.computer.RandomNumber;
import com.baseball.model.referee.InputValidator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class RandomNumberTest {

    @DisplayName("1-9까지의 중복없는 3자리 랜덤 정답 생성하는 테스트")
    @Test
    public void getAnswer_notThrow_ifConditionMatches() {
        AnswerGenerator answerGenerator = new RandomNumber();
        boolean isCorrectForStartGame = false;
        StringBuilder buffer = new StringBuilder();
        for (int answer : answerGenerator.getAnswer(isCorrectForStartGame)) {
            buffer.append(answer);
        }
        String answerToString = buffer.toString();
        Assertions.assertDoesNotThrow(() -> new InputValidator(answerToString));
    }
}
