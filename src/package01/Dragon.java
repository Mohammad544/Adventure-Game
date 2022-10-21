package package01;

/**
 * This class is a subclass of Monster. It is the main monster in my game.
 */

public class Dragon extends Monster {

    //Constructor that contains the monsters stats and attack message
    public Dragon(){

        name = "Dragon";
        hp = 50;
        attack = 20;
        attackMessage = "The Dragon hit you with his icy breath";
    }

    //getter method
    public String getAttackMessage(){
        return attackMessage;
    }

    //setter method
    public void setAttackMessage(String newAttackMessage) {
        this.attackMessage = newAttackMessage;
    }


}