package study;

import com.baseballgame.computer.Computer;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

    @DisplayName("랜덤 숫자 중복 여부 확인 테스트")
    @Test
    public void getNewAnswer_true_ifListSize3() {
        Computer computer = new Computer();
        List<Integer> answer = computer.getNewAnswer();
        int number1 = answer.get(0);
        int number2 = answer.get(1);
        int number3 = answer.get(2);
        Assertions.assertNotEquals(number1, number2);
        Assertions.assertNotEquals(number1, number3);
        Assertions.assertNotEquals(number2, number3);
    }

    @DisplayName("랜덤 숫자 1~9까지 여부 확인 테스트")
    @Test
    public void getAnswer_true_Number1to9() {
        Computer computer = new Computer();
        List<Integer> answer = computer.getNewAnswer();
        int number1 = answer.get(0);
        int number2 = answer.get(1);
        int number3 = answer.get(2);
        assertThat(number1).isBetween(1, 9);
        assertThat(number2).isBetween(1, 9);
        assertThat(number3).isBetween(1, 9);
    }

    @DisplayName("플레이어 입력값 1-9까지의 중복없는 3자리 숫자인지 확인하는 테스트")
    @Test
    public void sendInputToReferee_false_ifMatchCondition() throws IOException {
        Computer computer = new Computer();
        List<Integer> answer = computer.getNewAnswer();
        int number1 = answer.get(0);
        int number2 = answer.get(1);
        int number3 = answer.get(2);

    }
}
