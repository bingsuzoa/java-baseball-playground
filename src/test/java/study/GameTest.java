package study;

import com.baseballgame.player.Input;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.assertj.core.api.Assertions.assertThat;

public class GameTest {

//    @DisplayName("플레이어의 문자열 입력을 숫자리스트로 바꾸기")
//    @Test
//    public void getInput_true_whenStringToIntegerList() {
//        String threeNumber = "123";
//        List<Integer> expected = new ArrayList<>(Arrays.asList(1,2,3));
//        Input input = new Input(threeNumber);
//        Assertions.assertEquals(input.getInput(), expected);
//    }
//
//    @DisplayName("플레이어가 올바른 입력을 하지 않았을 때 예외 발생하기")
//    @ParameterizedTest
//    @ValueSource(strings = {"1s2", "013", "dsr"})
//    public void getInput_ThrowException_haveNotNumberElement(String threeNumber) {
//        Input input = new Input(threeNumber);
//        Assertions.assertThrows(IllegalArgumentException.class, () -> {input.getInput();});
//    }
}
