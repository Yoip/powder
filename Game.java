import javax.swing.*;
import java.awt.event.*;

/**
 * Write a description of class Game here.
 * 
 * @author >:o
 * @version 0
 */
public class Game extends JPanel
{
    public void main(String[] args)
    {
        JFrame f = new JFrame("Powder Game");
        f.setContentPane(new Game());
        f.setVisible(true);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    public Game()
    {
        setSize(800,600);
    }
}
