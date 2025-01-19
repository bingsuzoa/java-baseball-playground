package study;

import com.baseballgame.computer.Computer;
import com.baseballgame.game.Game;
import com.baseballgame.rule.BallChecker;
import com.baseballgame.rule.InputChecker;
import com.baseballgame.rule.NothingChecker;
import com.baseballgame.rule.StrikeChecker;
import org.junit.jupiter.api.Assertions;
import static org.assertj.core.api.Assertions.*;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.io.IOException;
import java.util.Arrays;
import java.util.stream.Collectors;


public class StringTest {
    /////////////*****해피 테스트*****/////////////
    @DisplayName("랜덤 숫자 중복 여부 확인 테스트")
    @Test
    void getAnswer_true_notDuplicated() {
        Computer computer = new Computer();
        Integer[] answer = computer.getAnswer();
        int number1 = answer[0];
        int number2 = answer[1];
        int number3 = answer[2];

        Assertions.assertNotEquals(number1, number2);
        Assertions.assertNotEquals(number1, number3);
        Assertions.assertNotEquals(number2, number3);
    }

    @DisplayName("랜덤 숫자 1~9까지 여부 확인 테스트")
    @Test
    void getAnswer_true_Number1to9() {
        Computer computer = new Computer();
        Integer[] answer = computer.getAnswer();
        int number1 = answer[0];
        int number2 = answer[1];
        int number3 = answer[2];

        assertThat(number1).isBetween(1, 9);
        assertThat(number2).isBetween(1, 9);
        assertThat(number3).isBetween(1, 9);
    }

    @DisplayName("유저의 문자열입력을 int배열로 정렬하는 테스트")
    @Test
    void getUserNumbers_true_StringToIntegerArray() {
        InputChecker inputChecker = new InputChecker();
        int[] userNumbers = inputChecker.getUserNumbers("123");
        int[] compareNumbers = {1,2,3};
        Arrays.equals(userNumbers, compareNumbers);
    }

    @DisplayName("볼 테스트(스트라이크인 경우 볼의 개수에서 제외되어야 한다.)")
    @Test
    void getBallResult_true_ifValueMatch() {
        BallChecker ballChecker = new BallChecker();
        int[] userNumbers_1 = {1,3,4};
        int[] userNumbers_2 = {1,3,5};
        int[] userNumbers_3 = {3,4,1};
        Integer[] answer = {3,5,6};

        Assertions.assertEquals(1, ballChecker.getBallResult(userNumbers_1, answer));
        Assertions.assertEquals(2, ballChecker.getBallResult(userNumbers_2, answer));
        Assertions.assertEquals(0, ballChecker.getBallResult(userNumbers_3, answer));
    }

    @DisplayName("스트라이크 테스트")
    @Test
    void getStrikeResult_true_ifValueMatch() {
        StrikeChecker strikeChecker = new StrikeChecker();
        int[] userNumbers_1 = {3,1,6};
        int[] userNumbers_2 = {1,3,5};
        int[] userNumbers_3 = {3,4,1};
        Integer[] answer = {3,5,6};

        Assertions.assertEquals(2, strikeChecker.getStrikeResult(userNumbers_1, answer));
        Assertions.assertEquals(0, strikeChecker.getStrikeResult(userNumbers_2, answer));
        Assertions.assertEquals(1, strikeChecker.getStrikeResult(userNumbers_3, answer));
    }

    @DisplayName("낫싱 테스트")
    @Test
    void getNothingResult_true_ifNotHavingMatchingValue() {
        NothingChecker nothingChecker = new NothingChecker();
        int[] userNumbers_1 = {3,1,6};
        int[] userNumbers_2 = {2,1,4};
        Integer[] answer = {3,5,6};

        Assertions.assertFalse(nothingChecker.getNothingResult(userNumbers_1, answer));
        Assertions.assertTrue(nothingChecker.getNothingResult(userNumbers_2, answer));
    }

//    @DisplayName("유저의 입력이 정답이 아니면 false 리턴함으로써 게임을 계속 진행하는 테스트")
//    @Test
//    void startPlay_true_return1IfNotAnswer() throws IOException {
//        Game game = new Game();
//        Computer computer = new Computer();
//
//        Integer[] answer = computer.getAnswer();
//        int[] wrongAnswer = new int[3];
//        wrongAnswer[0] = answer[2];
//        wrongAnswer[1] = answer[1];
//        wrongAnswer[2] = answer[0];
//
//        String input = Arrays.stream(wrongAnswer)
//                        .mapToObj(String::valueOf)
//                        .collect(Collectors.joining());
//
//        Assertions.assertFalse(game.startPlay(input));
//    }
    /////////////*****예외 테스트*****/////////////
    @DisplayName("게임 진행 여부를 결정하는 입력이 1 또는 2가 아닌 경우")
    @ParameterizedTest
    @ValueSource(ints = {3,4,0})
    void startPlay_illegalArgumentException_inputNot1or2(int value) throws IOException {
        Game game = new Game();
        int isProgressGameNumber = value;
    }


}
