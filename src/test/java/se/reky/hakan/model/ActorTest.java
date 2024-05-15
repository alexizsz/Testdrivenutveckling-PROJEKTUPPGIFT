package se.reky.hakan.model;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class ActorTest {

    @Test
    @DisplayName("Is HP correct after receiving damage")
    public void attackMethodTesting() {
        Player player = new Player("Håkan",3,2);
        Goblin goblin = new Goblin();
        goblin.attack(player);
        Assertions.assertEquals(0,player.getHp());
    }
}
