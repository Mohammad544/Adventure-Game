package package01;

/**
 * This class is used to display the title screen, and handle the transition from the title screen to the game screen
 */


public class Transition {

    GUI gui;
    Game game;

    //constructor which initialises gui
    public Transition(GUI graphicalUserInterface) { //Inserting graphicalUserInterface (also named gui) into this constructor allows
        // all the methods below to have graphicalUserInterface as an argument
        gui = graphicalUserInterface;
    }

    //In this method I made the titleNamePanel and startButtonPanel visible (i.e.title screen)
    //I made the mainTextArea, choiceButtonPanel, choice1, choice2, choice3 and choice4 invisible (i.e. game screen)
    //Whenever you want to display the title screen you just need to call this method
    public void showTitleScreen() {

        //Show the title screen
        gui.titleNamePanel.setVisible(true); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(true);


        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
    }

    public void showSelectCharacterScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(false);

        //Show the select character screen
        gui.selectPlayerPanel.setVisible(true);
        gui.characterButtonPanel.setVisible(true);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);
    }
    //In this method I made the Wizard information screen visible and all the other screens invisible
    public void showWizardInfoScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(false);

        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Show the Wizard info screen
        gui.wizardPlayerPanel.setVisible(true);
        gui.wizardStatsTextPanel.setVisible(true);
        gui.continue1ButtonPanel.setVisible(true);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);

    }

    //In this method I made the Warrior information screen visible and all the other screens invisible
    public void showWarriorInfoScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(false);

        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Show the Warrior info screen
        gui.warriorPlayerPanel.setVisible(true);
        gui.warriorStatsTextPanel.setVisible(true);
        gui.continue2ButtonPanel.setVisible(true);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);

    }
    //In this method I made the Knight information screen visible and all the other screens invisible
    public void showKnightInfoScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(false);

        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Show the Knight info screen
        gui.knightPlayerPanel.setVisible(true);
        gui.knightStatsTextPanel.setVisible(true);
        gui.continue3ButtonPanel.setVisible(true);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);

    }
    //In this method I made the Archer information screen visible and all the other screens invisible
    public void showArcherInfoScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false); //Note: gui.titleNamePanel allows us to access titleNamePanel inside of the GUI class
        gui.startButtonPanel.setVisible(false);

        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        // the Archer info screen
        gui.archerPlayerPanel.setVisible(true);
        gui.archerStatsTextPanel.setVisible(true);
        gui.continue4ButtonPanel.setVisible(true);

        //Hide the game screen
        gui.mainTextPanel.setVisible(false);
        gui.choiceButtonPanel.setVisible(false);
        gui.playerPanel.setVisible(false);

    }
    //In this method I made the game screen visible and all the other screens invisible
    public void showGameScreen() {

        //Hide the title screen
        gui.titleNamePanel.setVisible(false);
        gui.startButtonPanel.setVisible(false);

        //Hide the select character screen
        gui.selectPlayerPanel.setVisible(false);
        gui.characterButtonPanel.setVisible(false);

        //Hide the Wizard info screen
        gui.wizardPlayerPanel.setVisible(false);
        gui.wizardStatsTextPanel.setVisible(false);
        gui.continue1ButtonPanel.setVisible(false);

        //Hide the Warrior info screen
        gui.warriorPlayerPanel.setVisible(false);
        gui.warriorStatsTextPanel.setVisible(false);
        gui.continue2ButtonPanel.setVisible(false);

        //Hide the Knight info screen
        gui.knightPlayerPanel.setVisible(false);
        gui.knightStatsTextPanel.setVisible(false);
        gui.continue3ButtonPanel.setVisible(false);

        //Hide the Archer info screen
        gui.archerPlayerPanel.setVisible(false);
        gui.archerStatsTextPanel.setVisible(false);
        gui.continue4ButtonPanel.setVisible(false);

        //Show the game screen
        gui.mainTextPanel.setVisible(true);
        gui.choiceButtonPanel.setVisible(true);
        gui.playerPanel.setVisible(true);

    }


}

