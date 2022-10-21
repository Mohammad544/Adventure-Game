package package01;


/**
 * This class is used for the story element of my adventure game, such as dialogue.
 * new java.util.Random().nextInt(player.currentWeapon.damage) means this will pick up a random number based on your weapon damage
 * So if your weapon damage is 12, the actual damage will be 0 to 11
 */

public class Story {

    Game game;
    GUI gui;
    Transition t;
    Player player = new Player();
    Player archer = new Archer();
    Player wizard = new Wizard();
    Player warrior = new Warrior();
    Player knight = new Knight();
    Monster monster = new Monster();
    Monster ogre = new Ogre();
    Monster troll = new Troll();
    Monster dragon = new Dragon();


    int diamond=0;

    //In this method I initialised the objects.
    public Story(Game g, GUI graphicalUserInterface, Transition transition){

        game = g;
        gui = graphicalUserInterface;
        t = transition;
    }

    //This method sets default values for the player, such as setting a default value for the players hp
    public void defaultSetup(){

        player.hp = 100;
        gui.hpNumberLabel.setText("" + player.hp);

        player.currentWeapon = new Knife();
        gui.weaponNameLabel.setText(player.currentWeapon.name); //this is to display the weapons name on the screen



        diamond = 0;
    }

    //This method uses switch statements to call methods accordingly
    public void selectPosition(String nextPosition){

        switch (nextPosition){
            case "storyBeginning": storyBeginning(); break;
            case "talkToGuardian": talkToGuardian(); break;
            case "attackGuardian": attackGuardian(); break;
            case "crossRoad": crossRoad(); break;
            case "north": showNorthMovement(); break;
            case "northMovement": north(); break;
            case "east": showEastMovement(); break;
            case "eastMovement": east(); break;
            case "west": showWestMovement(); break;
            case "westMovement": west(); break;
            case "fight": fight(); break;
            case "playerAttack": playerAttack(); break;
            case "monsterAttack": monsterAttack(); break;
            case "win": win(); break;
            case "lose": lose(); break;
            case "ending": ending(); break;
            case "toTitle": toTitle(); break;
        }
    }

    //shows north movement
    public void showNorthMovement(){
        gui.N.setVisible(true);
        game.nextPosition1 = "northMovement";
    }

    //shows east movement
    public void showEastMovement(){
        gui.E.setVisible(true);
        game.nextPosition2 = "eastMovement";
    }

    //shows west movement
    public void showWestMovement(){
        gui.W.setVisible(true);
        game.nextPosition4 = "westMovement";
    }


    //This method is where the story begins
    public void storyBeginning(){

        gui.mainTextArea.setText("You are at the entrance of the Safe Haven. \nA guardian is standing in front of you. \n\nWhat do you do?");
        gui.choice1.setText("Talk to the Guardian");
        gui.choice2.setText("Attack the Guardian");
        gui.choice3.setText("Leave");
        gui.choice4.setText("");

        game.nextPosition1 = "talkToGuardian";
        game.nextPosition2 = "attackGuardian";
        game.nextPosition3 = "crossRoad";
        game.nextPosition4 = "";
    }

    //This method allows you to talk to the Guardian
    public void talkToGuardian(){

        if(diamond==0){
            gui.mainTextArea.setText("Guardian: Hello Stranger. Im sorry but you shall not pass. \nHowever if you help us with a problem, then you may seek passage." +
                                     "\nKill the Mystical Dragon that has been tormenting our people. It lies in the Ice Cave. Recover the diamonds that it possesses and you will be rewarded for your efforts.");
            gui.choice1.setText(">");
            gui.choice2.setText("");
            gui.choice3.setText("");
            gui.choice4.setText("");

            game.nextPosition1 = "storyBeginning";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(diamond==1){
            ending();
        }
    }

    //This method allows you to attack the Guardian
    public void attackGuardian(){

        gui.mainTextArea.setText("Guardian: Hey don't be a fool!\n\nThe Guardian attacked you. He was too powerful so you retreated.\n(You received 3 damage.)");
        player.hp = player.hp - 3;
        gui.hpNumberLabel.setText("" + player.hp);
        gui.choice1.setText(">");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "storyBeginning";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    //This method gives you options once you have reached the epicentre
    public void crossRoad(){

        gui.mainTextArea.setText("You are at the Epicentre. \nIf you head south, you will go back to the Safe Haven.");
        gui.choice1.setText("Go north");
        gui.choice2.setText("Go east");
        gui.choice3.setText("Go south");
        gui.choice4.setText("Go west");

        game.nextPosition1 = "north";
        game.nextPosition2 = "east";
        game.nextPosition3 = "storyBeginning";
        game.nextPosition4 = "west";
    }

    //This method is used to regenerate your health once you head north. It then gives you the option to head back to where you came from
    public void north(){

        gui.mainTextArea.setText("You have found the fountain of youth. \nYou drink the magical water and regain your energy. \n\n(Your HP is recovered by 1)");
        player.hp = player.hp + 1;
        gui.hpNumberLabel.setText("" + player.hp);
        gui.choice1.setText("Go south");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    //This method gives you loot
    public void east(){

        gui.mainTextArea.setText("You came across a treasure chest. You open it and found the legendary War Axe! \n\n(You obtained the legendary War Axe)");

        player.currentWeapon = new WarAxe();
        gui.weaponNameLabel.setText(player.currentWeapon.name);

        gui.choice1.setText("Go west");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
}

    //This method makes you encounter enemies once you head west
    public void west(){

        int i = new java.util.Random().nextInt(100)+1; //Its going to pick up a number between 1-100

        if(i<70){
            monster = new Ogre(); //Here we put the Ogre subclass into the object monster. Now we can use monster to access all the parameters inside the Ogre class.
        }
        else if(i<30) {
            monster = new Troll();
        }
        else{
            monster = new Dragon();
        }

        gui.mainTextArea.setText("You encounter an " + monster.name + "!");
        gui.choice1.setText("Fight");
        gui.choice2.setText("Run");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "fight";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";

    }

    //This method allows you to engage in battles
    public void fight(){

        gui.mainTextArea.setText(monster.name + ": " + monster.hp + "\n\nWhat do you do?");
        gui.choice1.setText("Attack");
        gui.choice2.setText("Run");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "playerAttack";
        game.nextPosition2 = "crossRoad";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    //Allows you to attack
    public void playerAttack(){

        int playerDamage = new java.util.Random().nextInt(player.currentWeapon.damage);

        gui.mainTextArea.setText("You attacked the " + monster.name + " and gave " + playerDamage + " damage!");

        monster.hp = monster.hp - playerDamage;

        gui.choice1.setText(">");
        gui.choice2.setText("Run");
        gui.choice3.setText("");
        gui.choice4.setText("");

        if(monster.hp>0){

            game.nextPosition1 = "monsterAttack";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(monster.hp<1){

            game.nextPosition1 = "win";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    //Allows the monster to attack
    public void monsterAttack(){

        int monsterDamage = new java.util.Random().nextInt(monster.attack);

        if(monster.name==ogre.name){
            gui.mainTextArea.setText(ogre.getAttackMessage() + "\nYou received " + monsterDamage + " damage!");
        }
        else if(monster.name==troll.name) {
            gui.mainTextArea.setText(troll.getAttackMessage() + "\nYou received " + monsterDamage + " damage!");
        }
        else if(monster.name==dragon.name){
            gui.mainTextArea.setText(dragon.getAttackMessage() + "\nYou received " + monsterDamage + " damage!");
        }

        player.hp = player.hp - monsterDamage;
        gui.hpNumberLabel.setText("" + player.hp);

        gui.choice1.setText(">");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        if(player.hp>0){

            game.nextPosition1 = "fight";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
        else if(player.hp<1){

            game.nextPosition1 = "lose";
            game.nextPosition2 = "";
            game.nextPosition3 = "";
            game.nextPosition4 = "";
        }
    }

    //This method is used to display the message that pops up when you win a battle
    public void win(){

        if(monster.name==dragon.name) {
            gui.mainTextArea.setText("You've defeated the " + monster.name + "!\nThe monster dropped some diamonds!\n\n(You obtained diamonds!)");
        }

        else if (monster.name==ogre.name){
            gui.mainTextArea.setText("You've Slayed the " + monster.name + "! However, to seek passage to the Safe Haven, you must slay the Mystical Dragon.");
        }

        else if(monster.name==troll.name){
            gui.mainTextArea.setText("You've Slayed the " + monster.name + "! However, to seek passage to the Safe Haven, you must slay the Mystical Dragon.");
        }

        diamond = 1;

        gui.choice1.setText("Go EAST");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "crossRoad";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    //This method occurs when you die. You then have the option to return to the main menu
    public void lose(){

        gui.mainTextArea.setText("You are dead!\n\nGAME OVER");

        gui.choice1.setText("Back to main menu");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }

    //This method is used to display the ending of the game
    public void ending(){

            gui.mainTextArea.setText("Guardian: Oh my, you killed the mystical Dragon!?\nThese diamonds are the " +
                    "most precious thing that Ive ever seen! I will be sure to deliver these to the Emperor and you will be rewarded handsomely. " +
                    "For now enjoy your stay at the Safe Haven, your welcome anytime!\n\n(THE END)");

        gui.choice1.setVisible(true);
        gui.choice2.setVisible(true);
        gui.choice3.setVisible(true);
        gui.choice4.setVisible(true);

        gui.choice1.setText("Back to main menu");
        gui.choice2.setText("");
        gui.choice3.setText("");
        gui.choice4.setText("");

        game.nextPosition1 = "toTitle";
        game.nextPosition2 = "";
        game.nextPosition3 = "";
        game.nextPosition4 = "";
    }
    //This method is used to return you to the main menu
    public void toTitle(){

        defaultSetup(); //This causes the players hp to become 100 again and the players weapon will be a knife again
        t.showTitleScreen();
    }

}