package package01;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class NorthMovement extends JPanel implements ActionListener {

    Timer timer = new Timer(10, this);
    int horizontalPositionOfPanel = 0, speedOfMovingCharacter = 2;

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        g.setColor(Color.RED);
        g.fillRect(horizontalPositionOfPanel, 140, 30,30);
        timer.start();


    }
    public void actionPerformed(ActionEvent e){
        if(horizontalPositionOfPanel<0 || horizontalPositionOfPanel>300) {
            speedOfMovingCharacter = -speedOfMovingCharacter;
        }
        horizontalPositionOfPanel = horizontalPositionOfPanel + speedOfMovingCharacter;
        repaint();
    }
}
