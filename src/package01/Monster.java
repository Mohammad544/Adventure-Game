package package01;

/**
 * This is my monster class.
 * It contains all the stats that the monsters (enemies) in my game will have.
 */

public class Monster {

    public String name;
    public int hp;
    public int attack;
    public String attackMessage;

    public String getAttackMessage(){
        return attackMessage;
    }

    public void setAttackMessage(String newAttackMessage) {
        this.attackMessage = newAttackMessage;
    }

}
