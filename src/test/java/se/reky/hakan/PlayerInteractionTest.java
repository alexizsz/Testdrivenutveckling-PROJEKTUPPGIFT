package se.reky.hakan;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import se.reky.hakan.model.Player;

import java.util.Scanner;

public class PlayerInteractionTest {

    private Player player;

    @BeforeEach
    void initNewPlayer() {
        player = new Player();
    }

    private PlayerInteraction playerInteraction(String dataForScanner) {
        PlayerInteraction playerInteraction = new SimplePlayerInteraction(new IOHandler(new Scanner(dataForScanner)));
        return playerInteraction;
    }

    @Test
    @DisplayName("Is Name same as input")
    public void newCreatedPlayerName() {
        playerInteraction("Alexis").setupPlayer(player);
        Assertions.assertEquals("Alexis", player.getName());
    }

    @Test
    @DisplayName("Is new health same as input")
    public void newUpdatedPlayerHealth() {

        playerInteraction("Alexis").updatePlayerHealth(player, 24);

        Assertions.assertEquals(24, player.getHp());

    }


}
