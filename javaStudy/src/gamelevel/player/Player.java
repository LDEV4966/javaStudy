package gamelevel.player;

import gamelevel.level.BeginnerLevel;
import gamelevel.level.PlayerLevel;

public class Player {

    private PlayerLevel level;

    public Player(){
        this.level = new BeginnerLevel();
        level.showLevelMessage();
    }

    public PlayerLevel getLevel() {
        return level;
    }

    public void upgradeLevel(PlayerLevel level){
        this.level = level;
        this.level.showLevelMessage();
    }

    public void play(int count){
         level.go(count);
    }

}
