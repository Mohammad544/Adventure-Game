package package01;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;



/**
 * This class is our main class where the main method is run.
 * It also uses switch statements to handle all the screen transitions.
 */

//Contains objects that have been instantiated
public class Game  {

    Handler handler = new Handler(); //instantiating the choiceHandler object, called cHandler
    GUI gui = new GUI(); //instantiating the GUI object, called gui
    Transition t = new Transition(gui); //instantiating the Transition object, called t
    Story story = new Story(this, gui, t); //instantiating the Story object, called story

    String nextPosition1, nextPosition2, nextPosition3, nextPosition4;

    //Method used to run the game
    public static void main(String[] args) {

        new Game();

    }

    //In this method, methods are called using objects.
    public Game() {

        gui.createGUI(handler); //here I used the instantiated object (gui) to call the method createGUI from the GUI class
                                 //also handler has been sent to the createGUI method in the GUI class
        story.defaultSetup(); //here I used the instantiated object (story) to call the method defaultSetup from the Story class
        t.showTitleScreen(); //here I used the instantiated object (t) to call the method showTitleScreen from the Transition class

    }

    //This class implements the ActionListener in order to use the built in method actionPerformed.
    public class Handler implements ActionListener {

        //This method is used to display the different screens in my game. It makes use of switch statements.
        public void actionPerformed(ActionEvent event) {
            String yourChoice = event.getActionCommand();

            switch (yourChoice) {
                case "START": t.showSelectCharacterScreen(); break;
                case "ch1": t.showWizardInfoScreen(); break;
                case "ch2": t.showWarriorInfoScreen(); break;
                case "ch3": t.showKnightInfoScreen(); break;
                case "ch4": t.showArcherInfoScreen(); break;
                case "CONTINUE1":
                case "CONTINUE2":
                case "CONTINUE3":
                case "CONTINUE4":
                    t.showGameScreen(); story.storyBeginning(); break;
                case "c1": story.selectPosition(nextPosition1); break;
                case "c2": story.selectPosition(nextPosition2); break;
                case "c3": story.selectPosition(nextPosition3); break;
                case "c4": story.selectPosition(nextPosition4); break;

            }

        }

    }
}