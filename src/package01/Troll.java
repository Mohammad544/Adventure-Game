package package01;

/**
 * This class is a subclass of Monster. It is one of the side quests in my game.
 */

//Constructor that contains the monsters stats and attack message
public class Troll extends Monster {

    public Troll(){

        name = "Troll";
        hp = 40;
        attack = 20;
        attackMessage = "The monster hit you with a rock.";
    }

    //Getter method
    public String getAttackMessage(){
        return attackMessage;
    }

    //Setter method
    public void setAttackMessage(String newAttackMessage) {
        this.attackMessage = newAttackMessage;
    }


}
