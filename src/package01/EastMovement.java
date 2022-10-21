package package01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/**
 * This class is a subclass of the built in class JPanel.
 * It implements ActionListener to handle all action events.
 * This class handles all the gui elements for moving east.
 */
public class EastMovement extends JPanel implements ActionListener {

    Timer timer = new Timer(10, this);
    int horizontalPositionOfPanel = 0, speedOfMovingCharacter = 2;

    // this method is a built in method. It is a type Graphics which is from java.awt.Graphics. It handles the color of the object.
    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(horizontalPositionOfPanel, 140, 30,30);
        timer.start();


    }

    // This method comes from ActionListener. In this method I changed the X coordinate and recalled the method using the repaint method.
    public void actionPerformed(ActionEvent e){
        if(horizontalPositionOfPanel<0 || horizontalPositionOfPanel>300) {
            speedOfMovingCharacter = -speedOfMovingCharacter;
        }
        horizontalPositionOfPanel = horizontalPositionOfPanel + speedOfMovingCharacter;
        repaint();
    }
}