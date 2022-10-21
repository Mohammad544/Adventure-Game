package package01;

/**
 * This class is a subclass of Monster. It is one of the side quests in my game.
 */

//Constructor that contains the monsters stats and attack message
public class Ogre extends Monster {

    public Ogre() {

        name = "Ogre";
        hp = 20;
        attack = 6;
        attackMessage = "The monster hit you with his fist.";
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
