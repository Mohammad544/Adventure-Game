package package01;

import java.awt.Color; //this is used to import Color
import java.awt.Font; //this is used to import Font
import java.awt.GridLayout; //this is used to import GridLayout

import javax.swing.JFrame; //this is used to import the JFrame
import javax.swing.JPanel; //this is used to import the JPanel
import javax.swing.JLabel; //this is used to import the JLabel
import javax.swing.JButton; //this is used to import the JButton
import javax.swing.JTextArea; //this is used to import the JTextArea

/**
 * In this class I made all GUI parts, like the window, button, JPanel, etc.
 * This class handles all the GUI elements of the game.
 * It also contains the descriptions for all the Heroes in my game.
 */

public class GUI {

    Player wizard = new Wizard();
    Player warrior = new Warrior();
    Player knight = new Knight();
    Player archer = new Archer();


    JFrame window, N, E, S, W; //this is to create a window, because without a window you cannot do anything
    JPanel titleNamePanel, startButtonPanel, selectPlayerPanel, characterButtonPanel, wizardPlayerPanel, wizardStatsTextPanel,
            warriorPlayerPanel, warriorStatsTextPanel, knightPlayerPanel, knightStatsTextPanel, archerPlayerPanel,
            archerStatsTextPanel, continue1ButtonPanel, continue2ButtonPanel, continue3ButtonPanel,
            continue4ButtonPanel, mainTextPanel, choiceButtonPanel, playerPanel;  //this is used to make the title names and customise title backgrounds
    JLabel titleNameLabel, selectPlayerLabel, wizardPlayerLabel, warriorPlayerLabel, knightPlayerLabel, archerPlayerLabel,
            hpLabel, hpNumberLabel, weaponLabel, weaponNameLabel;
    JButton startButton, continue1Button, continue2Button, continue3Button, continue4Button, choice1, choice2,
            choice3, choice4, character1, character2, character3, character4;
    JTextArea mainTextArea, wizardStatsTextArea, warriorStatsTextArea, knightStatsTextArea, archerStatsTextArea;
    Font titleFont = new Font("Times New Roman", Font.PLAIN, 60);
    Font normalFont = new Font("Times New Roman", Font.PLAIN, 26);

    //This method is used to create the window, title screen, information screens and the game screen. It also hides the screens that need to be hided and shows the screens that need to be shown.
    public void createGUI(Game.Handler handler){

        //WINDOW
        window = new JFrame(); //here we initialised the JFrame above (window)
        window.setSize(800, 600); //here we set the size of the window (i.e. the width and the height)
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //this sets a function to close the window (i.e. an x button)
        window.getContentPane().setBackground(Color.RED); //this sets the color of the window black
        window.setLayout(null); //this disables the default layout so that we can use a custom layout

        //TITLE SCREEN
        titleNamePanel = new JPanel(); //here we initialised the JPanel above (titleNamePanel)
        titleNamePanel.setBounds(15, 100, 750, 80); //this is used to set the size of the panel
        titleNamePanel.setBackground(Color.BLUE); //this sets the background color of the panel black

        titleNameLabel = new JLabel("ADVENTURES OF HEROES"); //this is used to name the title "ADVENTURE"
        titleNameLabel.setForeground(Color.white);
        titleNameLabel.setFont(titleFont);

        titleNamePanel.add(titleNameLabel); //here I added the titleNameLabel to the titleNamePanel

        startButtonPanel = new JPanel(); //here we initialised the JPanel above (startButtonPanel)
        startButtonPanel.setBounds(300, 400, 210, 100); //this is used to set the size of the panel
        startButtonPanel.setBackground(Color.RED);

        startButton = new JButton("START"); //this is used to name the button START
        startButton.setBackground(Color.green); //this sets the background color of the button black
        startButton.setForeground(Color.white);
        startButton.setFont(normalFont);
        startButton.setFocusPainted(false);
        startButton.addActionListener(handler);
        startButton.setActionCommand("START");

        startButtonPanel.add(startButton);

        window.add(titleNamePanel);
        window.add(startButtonPanel);

        //SELECT CHARACTER SCREEN
        selectPlayerPanel = new JPanel();
        selectPlayerPanel.setBounds(15, 100, 750, 80);
        selectPlayerPanel.setBackground(Color.BLUE);
        selectPlayerLabel = new JLabel("Select your character");
        selectPlayerLabel.setForeground(Color.white);
        selectPlayerLabel.setFont(titleFont);
        selectPlayerPanel.add(selectPlayerLabel);


        characterButtonPanel = new JPanel();
        characterButtonPanel.setBounds(250, 380, 300, 150);
        characterButtonPanel.setBackground(Color.black);
        characterButtonPanel.setLayout(new GridLayout(4,1));

        character1 = new JButton("Wizard");
        character1.setBackground(Color.black);
        character1.setForeground(Color.white);
        character1.setFont(normalFont);
        character1.setFocusPainted(false);
        character1.addActionListener(handler);
        character1.setActionCommand("ch1");
        characterButtonPanel.add(character1);

        character2 = new JButton("Warrior");
        character2.setBackground(Color.black);
        character2.setForeground(Color.white);
        character2.setFont(normalFont);
        character2.setFocusPainted(false);
        character2.addActionListener(handler);
        character2.setActionCommand("ch2");
        characterButtonPanel.add(character2);

        character3 = new JButton("Knight");
        character3.setBackground(Color.black);
        character3.setForeground(Color.white);
        character3.setFont(normalFont);
        character3.setFocusPainted(false);
        character3.addActionListener(handler);
        character3.setActionCommand("ch3");
        characterButtonPanel.add(character3);

        character4 = new JButton("Archer");
        character4.setBackground(Color.black);
        character4.setForeground(Color.white);
        character4.setFont(normalFont);
        character4.setFocusPainted(false);
        character4.addActionListener(handler);
        character4.setActionCommand("ch4");
        characterButtonPanel.add(character4);

        window.add(selectPlayerPanel);
        window.add(characterButtonPanel);

        //WIZARD INFO SCREEN
        wizardPlayerPanel = new JPanel();
        wizardPlayerPanel.setBounds(15, 50, 750, 80);
        wizardPlayerPanel.setBackground(Color.BLUE);
        wizardPlayerLabel = new JLabel("Character Description");
        wizardPlayerLabel.setForeground(Color.white);
        wizardPlayerLabel.setFont(titleFont);
        wizardPlayerPanel.add(wizardPlayerLabel);
        window.add(wizardPlayerPanel);

        wizardStatsTextPanel = new JPanel();
        wizardStatsTextPanel.setBounds(100, 200, 600, 250);
        wizardStatsTextPanel.setBackground(Color.black);
        window.add(wizardStatsTextPanel);

        wizardStatsTextArea = new JTextArea("Name: " + wizard.name + "\n\nDescription: The wizard is a \"genius student\" of arcane magic, who has studied the subject for years. He practices until he is able to command magic with ease. The wizard must prepare spells daily.");
        wizardStatsTextArea.setBounds(100, 100, 600, 250);
        wizardStatsTextArea.setBackground(Color.black);
        wizardStatsTextArea.setForeground(Color.white);
        wizardStatsTextArea.setFont(normalFont);
        wizardStatsTextArea.setLineWrap(true);
        wizardStatsTextArea.setWrapStyleWord(true);
        wizardStatsTextArea.setEditable(false);
        wizardStatsTextPanel.add(wizardStatsTextArea);

        continue1ButtonPanel = new JPanel();
        continue1ButtonPanel.setBounds(300, 470, 210, 100);
        continue1ButtonPanel.setBackground(Color.RED);
        continue1Button = new JButton("CONTINUE");
        continue1Button.setBackground(Color.green);
        continue1Button.setForeground(Color.white);
        continue1Button.setFont(normalFont);
        continue1Button.setFocusPainted(false);
        continue1Button.addActionListener(handler);
        continue1Button.setActionCommand("CONTINUE1");
        continue1ButtonPanel.add(continue1Button);
        window.add(continue1ButtonPanel);

        //WARRIOR INFO SCREEN
        warriorPlayerPanel = new JPanel();
        warriorPlayerPanel.setBounds(15, 50, 750, 80);
        warriorPlayerPanel.setBackground(Color.BLUE);
        warriorPlayerLabel = new JLabel("Character Description");
        warriorPlayerLabel.setForeground(Color.white);
        warriorPlayerLabel.setFont(titleFont);
        warriorPlayerPanel.add(warriorPlayerLabel);
        window.add(warriorPlayerPanel);

        warriorStatsTextPanel = new JPanel();
        warriorStatsTextPanel.setBounds(100, 200, 600, 250);
        warriorStatsTextPanel.setBackground(Color.black);
        window.add(warriorStatsTextPanel);

        warriorStatsTextArea = new JTextArea("Name: " + warrior.name + "\n\nDescription: The Warrior's skills are centered around strength and physical combat. He is noble and is always looking for a challenge.");
        warriorStatsTextArea.setBounds(100, 100, 600, 250);
        warriorStatsTextArea.setBackground(Color.black);
        warriorStatsTextArea.setForeground(Color.white);
        warriorStatsTextArea.setFont(normalFont);
        warriorStatsTextArea.setLineWrap(true);
        warriorStatsTextArea.setWrapStyleWord(true);
        warriorStatsTextArea.setEditable(false);
        warriorStatsTextPanel.add(warriorStatsTextArea);

        continue2ButtonPanel = new JPanel();
        continue2ButtonPanel.setBounds(300, 470, 210, 100);
        continue2ButtonPanel.setBackground(Color.RED);
        continue2Button = new JButton("CONTINUE");
        continue2Button.setBackground(Color.green);
        continue2Button.setForeground(Color.white);
        continue2Button.setFont(normalFont);
        continue2Button.setFocusPainted(false);
        continue2Button.addActionListener(handler);
        continue2Button.setActionCommand("CONTINUE2");
        continue2ButtonPanel.add(continue2Button);
        window.add(continue2ButtonPanel);

        //KNIGHT INFO SCREEN
        knightPlayerPanel = new JPanel();
        knightPlayerPanel.setBounds(15, 50, 750, 80);
        knightPlayerPanel.setBackground(Color.BLUE);
        knightPlayerLabel = new JLabel("Character Description");
        knightPlayerLabel.setForeground(Color.white);
        knightPlayerLabel.setFont(titleFont);
        knightPlayerPanel.add(knightPlayerLabel);
        window.add(knightPlayerPanel);

        knightStatsTextPanel = new JPanel();
        knightStatsTextPanel.setBounds(100, 200, 600, 250);
        knightStatsTextPanel.setBackground(Color.black);
        window.add(knightStatsTextPanel);

        knightStatsTextArea = new JTextArea("Name: " + knight.name + "\n\nDescription: Knights are well-trained martial masters who use a combination of muscle and strategy to win battles. They are capable tacticians, and dislike running into battle without a plan. They usually fight for honor and justice, rather than hire themselves out for rewards.");
        knightStatsTextArea.setBounds(100, 100, 600, 250);
        knightStatsTextArea.setBackground(Color.black);
        knightStatsTextArea.setForeground(Color.white);
        knightStatsTextArea.setFont(normalFont);
        knightStatsTextArea.setLineWrap(true);
        knightStatsTextArea.setWrapStyleWord(true);
        knightStatsTextArea.setEditable(false);
        knightStatsTextPanel.add(knightStatsTextArea);

        continue3ButtonPanel = new JPanel();
        continue3ButtonPanel.setBounds(300, 470, 210, 100);
        continue3ButtonPanel.setBackground(Color.RED);
        continue3Button = new JButton("CONTINUE");
        continue3Button.setBackground(Color.green);
        continue3Button.setForeground(Color.white);
        continue3Button.setFont(normalFont);
        continue3Button.setFocusPainted(false);
        continue3Button.addActionListener(handler);
        continue3Button.setActionCommand("CONTINUE3");
        continue3ButtonPanel.add(continue3Button);
        window.add(continue3ButtonPanel);

        //ARCHER INFO SCREEN
        archerPlayerPanel = new JPanel();
        archerPlayerPanel.setBounds(15, 50, 750, 80);
        archerPlayerPanel.setBackground(Color.BLUE);
        archerPlayerLabel = new JLabel("Character Description");
        archerPlayerLabel.setForeground(Color.white);
        archerPlayerLabel.setFont(titleFont);
        archerPlayerPanel.add(archerPlayerLabel);
        window.add(archerPlayerPanel);

        archerStatsTextPanel = new JPanel();
        archerStatsTextPanel.setBounds(100, 200, 600, 250);
        archerStatsTextPanel.setBackground(Color.black);
        window.add(archerStatsTextPanel);

        archerStatsTextArea = new JTextArea("Name: " + archer.name + "\n\nDescription: “Move like wind. Strike like thunder.” While the Archer is peerless in ranged combat, she can fluidly shift between combat styles to dispense with enemies near and far with deadly grace and efficiency.");
        archerStatsTextArea.setBounds(100, 100, 600, 250);
        archerStatsTextArea.setBackground(Color.black);
        archerStatsTextArea.setForeground(Color.white);
        archerStatsTextArea.setFont(normalFont);
        archerStatsTextArea.setLineWrap(true);
        archerStatsTextArea.setWrapStyleWord(true);
        archerStatsTextArea.setEditable(false);
        archerStatsTextPanel.add(archerStatsTextArea);

        continue4ButtonPanel = new JPanel();
        continue4ButtonPanel.setBounds(300, 470, 210, 100);
        continue4ButtonPanel.setBackground(Color.RED);
        continue4Button = new JButton("CONTINUE");
        continue4Button.setBackground(Color.green);
        continue4Button.setForeground(Color.white);
        continue4Button.setFont(normalFont);
        continue4Button.setFocusPainted(false);
        continue4Button.addActionListener(handler);
        continue4Button.setActionCommand("CONTINUE2");
        continue4ButtonPanel.add(continue4Button);
        window.add(continue4ButtonPanel);

        //GAME SCREEN
        mainTextPanel = new JPanel();
        mainTextPanel.setBounds(100, 100, 600, 250);
        mainTextPanel.setBackground(Color.black);
        window.add(mainTextPanel);

        mainTextArea = new JTextArea();
        mainTextArea.setBounds(100, 100, 600, 250);
        mainTextArea.setBackground(Color.black);
        mainTextArea.setForeground(Color.white);
        mainTextArea.setFont(normalFont);
        mainTextArea.setLineWrap(true);
        mainTextArea.setWrapStyleWord(true);
        mainTextArea.setEditable(false);
        mainTextPanel.add(mainTextArea);

        choiceButtonPanel = new JPanel();
        choiceButtonPanel.setBounds(250, 380, 300, 150);
        choiceButtonPanel.setBackground(Color.black);
        choiceButtonPanel.setLayout(new GridLayout(4,1));
        window.add(choiceButtonPanel);

        choice1 = new JButton("choice1");
        choice1.setBackground(Color.black);
        choice1.setForeground(Color.white);
        choice1.setFont(normalFont);
        choice1.setFocusPainted(false);
        choice1.addActionListener(handler);
        choice1.setActionCommand("c1");
        choiceButtonPanel.add(choice1);

        choice2 = new JButton("choice1");
        choice2.setBackground(Color.black);
        choice2.setForeground(Color.white);
        choice2.setFont(normalFont);
        choice2.setFocusPainted(false);
        choice2.addActionListener(handler);
        choice2.setActionCommand("c2");
        choiceButtonPanel.add(choice2);

        choice3 = new JButton("choice1");
        choice3.setBackground(Color.black);
        choice3.setForeground(Color.white);
        choice3.setFont(normalFont);
        choice3.setFocusPainted(false);
        choice3.addActionListener(handler);
        choice3.setActionCommand("c3");
        choiceButtonPanel.add(choice3);

        choice4 = new JButton("choice1");
        choice4.setBackground(Color.black);
        choice4.setForeground(Color.white);
        choice4.setFont(normalFont);
        choice4.setFocusPainted(false);
        choice4.addActionListener(handler);
        choice4.setActionCommand("c4");
        choiceButtonPanel.add(choice4);

        playerPanel = new JPanel();
        playerPanel.setBounds(100, 15, 600, 50);
        playerPanel.setBackground(Color.darkGray);
        playerPanel.setLayout(new GridLayout(1,4));
        window.add(playerPanel);

        hpLabel = new JLabel("HP:");
        hpLabel.setFont(normalFont);
        hpLabel.setForeground(Color.white);
        playerPanel.add(hpLabel);
        hpNumberLabel = new JLabel();
        hpNumberLabel.setFont(normalFont);
        hpNumberLabel.setForeground(Color.white);
        playerPanel.add(hpNumberLabel);
        weaponLabel = new JLabel("Weapon:");
        weaponLabel.setFont(normalFont);
        weaponLabel.setForeground(Color.white);
        playerPanel.add(weaponLabel);
        weaponNameLabel = new JLabel();
        weaponNameLabel.setFont(normalFont);
        weaponNameLabel.setForeground(Color.white);
        playerPanel.add(weaponNameLabel);

        NorthMovement nm = new NorthMovement();
        N = new JFrame();
        N.add(nm);
        N.setSize(600, 400);
        N.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        N.setTitle("Player moving North");

        EastMovement em = new EastMovement();
        E = new JFrame();
        E.add(em);
        E.setSize(600, 400);
        E.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        E.setTitle("Player moving East");

        WestMovement wm = new WestMovement();
        W = new JFrame();
        W.add(wm);
        W.setSize(600, 400);
        W.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        W.setTitle("Player moving West");


        window.setVisible(true); //this is to actually see the window that you created


    }
}
