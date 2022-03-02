package gamelevel;

import gamelevel.level.AdvancedLevel;
import gamelevel.level.SuperLevel;
import gamelevel.player.Player;

public class MainBoardPlay {

    public static void main(String[] args) {

        Player player = new Player();
        player.play(1);

        player.upgradeLevel(new AdvancedLevel());
        player.play(2);

        player.upgradeLevel(new SuperLevel());
        player.play(3);

    }
}
