package com.baseball;

import com.baseball.player.Input;
import com.baseball.player.Player;
import com.baseball.referee.Referee;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class GameServiceTest {

    @DisplayName("플레이어가 적절한 입력인지 확인하는 테스트")
    @Test
    public void 테스트1() {
        GameService gameService = new GameService();
        String playerInput = "123";
        Assertions.assertTrue(gameService.getProperPlayerInput(playerInput));
    }

    @DisplayName("정답얻기")
    @Test
    public void 테스트2() {
        GameService gameService = new GameService();
        List<Integer> answer = new ArrayList<>(Arrays.asList(1,2,3));
        Player player = new Player("123");
        Referee referee = new Referee(player.getPlayerInput(), answer);
        Assertions.assertTrue(referee.judgeIsAnswer());
    }

    @DisplayName("정답인 경우 게임진행 여부 확인, 1 입력 시 true, 2입력 시 false")
    @Test
    public void 테스트3() {
        GameService gameService = new GameService();
        Player player = new Player("123");
        boolean isCorrect = true;
        int restartNumber = 1;
        Assertions.assertTrue(player.getPlayingState(isCorrect, restartNumber));
    }

    /// ///예외 테스트
    @DisplayName("플레이어의 입력이 숫자가 아닌경우 예외 발생")
    @Test
    public void 숫자가아니면예외() {
        String playerInput = "1s3";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Input(playerInput).checkProperInput();
        });
    }

    @DisplayName("플레이어의 입력이 1-9의 3자리가 아닌 경우 예외발생")
    @ParameterizedTest
    @ValueSource(strings = {"012", "1245"})
    public void 일부터구까지의세자리수아니면예외(String playerInput) {
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Input(playerInput).checkProperInput();
        });

    }

    @DisplayName("플레이어의 입력이 중복인 경우 예외 발생")
    @Test
    public void 입력이중복인경우예외() {
        String playerInput = "112";
        Assertions.assertThrows(IllegalArgumentException.class, () -> {
            new Input(playerInput).checkProperInput();
        });
    }


}
