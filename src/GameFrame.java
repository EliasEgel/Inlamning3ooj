import javax.swing.*;
import java.awt.*;

public class GameFrame extends JFrame{
    Functions f = new Functions();
    JPanel mainPanel = new JPanel(new BorderLayout());
    JPanel l1 = new JPanel(new GridLayout(4,4));
    JLabel northlabel = new JLabel("", SwingConstants.CENTER);
    JPanel southPanel = new JPanel();
    JButton b1 = new JButton(f.getList().get(0));
    JButton b2 = new JButton(f.getList().get(1));
    JButton b3 = new JButton(f.getList().get(2));
    JButton b4 = new JButton(f.getList().get(3));
    JButton b5 = new JButton(f.getList().get(4));
    JButton b6 = new JButton(f.getList().get(5));
    JButton b7 = new JButton(f.getList().get(6));
    JButton b8 = new JButton(f.getList().get(7));
    JButton b9 = new JButton(f.getList().get(8));
    JButton b10 = new JButton(f.getList().get(9));
    JButton b11 = new JButton(f.getList().get(10));
    JButton b12 = new JButton(f.getList().get(11));
    JButton b13 = new JButton(f.getList().get(12));
    JButton b14 = new JButton(f.getList().get(13));
    JButton b15 = new JButton(f.getList().get(14));
    JButton empty = new JButton(f.getList().get(15));
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
