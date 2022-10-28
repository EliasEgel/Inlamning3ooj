import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{

    JPanel mainPanel = new JPanel(new BorderLayout());
    JPanel l1 = new JPanel(new GridLayout(4,4));
    JLabel northlabel = new JLabel("", SwingConstants.CENTER);
    JPanel southPanel = new JPanel();
    JButton b1 = new JButton();
    JButton b2 = new JButton();
    JButton b3 = new JButton();
    JButton b4 = new JButton();
    JButton b5 = new JButton();
    JButton b6 = new JButton();
    JButton b7 = new JButton();
    JButton b8 = new JButton();
    JButton b9 = new JButton();
    JButton b10 = new JButton();
    JButton b11 = new JButton();
    JButton b12 = new JButton();
    JButton b13 = new JButton();
    JButton b14 = new JButton();
    JButton b15 = new JButton();
    JButton empty = new JButton();
    JButton newGame = new JButton("New Game");
    GameFrame(){

        add(mainPanel);
        mainPanel.add(l1, BorderLayout.CENTER);

        l1.add(b1);l1.add(b2);l1.add(b3);l1.add(b4);
        l1.add(b5);l1.add(b6);l1.add(b7);l1.add(b8);
        l1.add(b9);l1.add(b10);l1.add(b11);l1.add(b12);
        l1.add(b13);l1.add(b14);l1.add(b15);l1.add(empty);

        mainPanel.add(southPanel, BorderLayout.SOUTH);
        southPanel.add(newGame);

        mainPanel.add(northlabel, BorderLayout.NORTH);

        setSize(320,320);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
}
