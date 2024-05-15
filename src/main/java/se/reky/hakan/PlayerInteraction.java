package se.reky.hakan;
import se.reky.hakan.model.Player;

public interface PlayerInteraction {
    String setupPlayer(Player player);
    void updatePlayerHealth(Player player, int hp);
    void greetPlayer(Player player);

}