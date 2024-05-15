package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class GameUtilTest {

    @Test
    @DisplayName("Returns Exception if input is null")
    public void shouldReturnException(){
        GameUtil gameUtil = new GameUtil();
        Assertions.assertThrows(GameException.class, () -> gameUtil.toLowerCaseButFirstLetterCapitalized(null));

    }

}
