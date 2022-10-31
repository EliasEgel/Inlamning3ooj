import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class GameFrame extends JFrame implements ActionListener {
    Functions f = new Functions();
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
    JButton b16 = new JButton();
    JButton newGame = new JButton("New Game");
    JButton winGame = new JButton("Easy Win");
    GameFrame(){
        f.randomizeOrder();
        add(mainPanel);
        mainPanel.add(l1, BorderLayout.CENTER);

        l1.add(b1);l1.add(b2);l1.add(b3);l1.add(b4);
        l1.add(b5);l1.add(b6);l1.add(b7);l1.add(b8);
        l1.add(b9);l1.add(b10);l1.add(b11);l1.add(b12);
        l1.add(b13);l1.add(b14);l1.add(b15);l1.add(b16);

        b1.setText(f.getList().get(0));b2.setText(f.getList().get(1));b3.setText(f.getList().get(2));b4.setText(f.getList().get(3));
        b5.setText(f.getList().get(4));b6.setText(f.getList().get(5));b7.setText(f.getList().get(6));b8.setText(f.getList().get(7));
        b9.setText(f.getList().get(8));b10.setText(f.getList().get(9));b11.setText(f.getList().get(10));b12.setText(f.getList().get(11));
        b13.setText(f.getList().get(12));b14.setText(f.getList().get(13));b15.setText(f.getList().get(14));b16.setText(f.getList().get(15));

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
        b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
        b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);

        mainPanel.add(southPanel, BorderLayout.SOUTH);
        southPanel.add(newGame);
        newGame.addActionListener(this);
        southPanel.add(winGame);
        winGame.addActionListener(this);

        mainPanel.add(northlabel, BorderLayout.NORTH);

        setSize(320,320);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == b1){
            if(b2.getText().equals(" ")){
                b2.setText(b1.getText());
                b1.setText(" ");
            }else if (b5.getText().equals(" ")){
                b5.setText(b1.getText());
                b1.setText(" ");
            }
        }
        if(e.getSource() == b2){
            if(b1.getText().equals(" ")){
                b1.setText(b2.getText());
                b2.setText(" ");
            }else if (b3.getText().equals(" ")){
                b3.setText(b2.getText());
                b2.setText(" ");
            }else if (b6.getText().equals(" ")){
                b6.setText(b2.getText());
                b2.setText(" ");
            }
        }
        if(e.getSource() == b3){
            if(b2.getText().equals(" ")){
                b2.setText(b3.getText());
                b3.setText(" ");
            }else if (b4.getText().equals(" ")){
                b4.setText(b3.getText());
                b3.setText(" ");
            }else if (b7.getText().equals(" ")){
                b7.setText(b3.getText());
                b3.setText(" ");
            }
        }
        if(e.getSource() == b4){
            if(b3.getText().equals(" ")){
                b3.setText(b4.getText());
                b4.setText(" ");
            }else if (b8.getText().equals(" ")){
                b8.setText(b4.getText());
                b4.setText(" ");
            }
        }
        if(e.getSource() == b5){
            if(b1.getText().equals(" ")){
                b1.setText(b5.getText());
                b5.setText(" ");
            }else if (b6.getText().equals(" ")){
                b6.setText(b5.getText());
                b5.setText(" ");
            }else if (b9.getText().equals(" ")){
                b9.setText(b5.getText());
                b5.setText(" ");
            }
        }
        if(e.getSource() == b6){
            if(b2.getText().equals(" ")){
                b2.setText(b6.getText());
                b6.setText(" ");
            }else if (b5.getText().equals(" ")){
                b5.setText(b6.getText());
                b6.setText(" ");
            }else if (b7.getText().equals(" ")){
                b7.setText(b6.getText());
                b6.setText(" ");
            }else if (b10.getText().equals(" ")){
                b10.setText(b6.getText());
                b6.setText(" ");
            }
        }
        if(e.getSource() == b7){
            if(b3.getText().equals(" ")){
                b3.setText(b7.getText());
                b7.setText(" ");
            }else if (b6.getText().equals(" ")){
                b6.setText(b7.getText());
                b7.setText(" ");
            }else if (b8.getText().equals(" ")){
                b8.setText(b7.getText());
                b7.setText(" ");
            }else if (b11.getText().equals(" ")){
                b11.setText(b7.getText());
                b7.setText(" ");
            }
        }
        if(e.getSource()==b8){
            if (b4.getText().equals(" ")) {
                b4.setText(b8.getText());
                b8.setText(" ");
            } else if (b7.getText().equals(" ")) {
                b7.setText(b8.getText());
                b8.setText(" ");
            } else if (b12.getText().equals(" ")) {
                b12.setText(b8.getText());
                b8.setText(" ");
            }
        }
        if(e.getSource()==b9){
            if (b5.getText().equals(" ")) {
                b5.setText(b9.getText());
                b9.setText(" ");
            } else if (b10.getText().equals(" ")) {
                b10.setText(b9.getText());
                b9.setText(" ");
            } else if (b13.getText().equals(" ")) {
                b13.setText(b9.getText());
                b9.setText(" ");
            }
        }
        if(e.getSource()==b10){
            if (b9.getText().equals(" ")) {
                b9.setText(b10.getText());
                b10.setText(" ");
            } else if (b11.getText().equals(" ")) {
                b11.setText(b10.getText());
                b10.setText(" ");
            } else if (b14.getText().equals(" ")) {
                b14.setText(b10.getText());
                b10.setText(" ");
            } else if (b6.getText().equals(" ")) {
                b6.setText(b10.getText());
                b10.setText(" ");
            }
        }
        if(e.getSource()==b11){
            if (b10.getText().equals(" ")) {
                b10.setText(b11.getText());
                b11.setText(" ");
            } else if (b12.getText().equals(" ")) {
                b12.setText(b11.getText());
                b11.setText(" ");
            } else if (b7.getText().equals(" ")) {
                b7.setText(b11.getText());
                b11.setText(" ");
            } else if (b15.getText().equals(" ")) {
                b15.setText(b11.getText());
                b11.setText(" ");
            }
        }
        if(e.getSource()==b12){
            if (b8.getText().equals(" ")) {
                b8.setText(b12.getText());
                b12.setText(" ");
            } else if (b16.getText().equals(" ")) {
                b16.setText(b12.getText());
                b12.setText(" ");
            } else if (b11.getText().equals(" ")) {
                b11.setText(b12.getText());
                b12.setText(" ");
            }
        }
        if(e.getSource()==b13){
            if (b9.getText().equals(" ")) {
                b9.setText(b13.getText());
                b13.setText(" ");
            } else if (b14.getText().equals(" ")) {
                b14.setText(b13.getText());
                b13.setText(" ");
            }
        }
        if(e.getSource()==b14){
            if (b13.getText().equals(" ")) {
                b13.setText(b14.getText());
                b14.setText(" ");
            } else if (b10.getText().equals(" ")) {
                b10.setText(b14.getText());
                b14.setText(" ");
            } else if (b15.getText().equals(" ")) {
                b15.setText(b14.getText());
                b14.setText(" ");
            }
        }
        if(e.getSource()==b15){
            if (b14.getText().equals(" ")) {
                b14.setText(b15.getText());
                b15.setText(" ");
            } else if (b11.getText().equals(" ")) {
                b11.setText(b15.getText());
                b15.setText(" ");
            } else if (b16.getText().equals(" ")) {
                b16.setText(b15.getText());
                b15.setText(" ");
            }
        }
        if(e.getSource()==b16){
            if (b15.getText().equals(" ")) {
                b15.setText(b16.getText());
                b16.setText(" ");
            } else if (b12.getText().equals(" ")) {
                b12.setText(b16.getText());
                b16.setText(" ");
            }
        }
        if(e.getSource() == newGame){
            f.randomizeOrder();

            b1.setText(f.getList().get(0));b5.setText(f.getList().get(4));
            b2.setText(f.getList().get(1));b6.setText(f.getList().get(5));
            b3.setText(f.getList().get(2));b7.setText(f.getList().get(6));
            b4.setText(f.getList().get(3));b8.setText(f.getList().get(7));
            b9.setText(f.getList().get(8)); b13.setText(f.getList().get(12));
            b10.setText(f.getList().get(9));b14.setText(f.getList().get(13));
            b11.setText(f.getList().get(10));b15.setText(f.getList().get(14));
            b12.setText(f.getList().get(11));b16.setText(f.getList().get(15));
        }
        if(e.getSource() == winGame){
            List<String> winValues = Arrays.asList("1","2","3","4","5","6","7","8","9","10","11","12","13","14"," ","15");

            b1.setText(winValues.get(0));b5.setText(winValues.get(4));
            b2.setText(winValues.get(1));b6.setText(winValues.get(5));
            b3.setText(winValues.get(2));b7.setText(winValues.get(6));
            b4.setText(winValues.get(3));b8.setText(winValues.get(7));
            b9.setText(winValues.get(8)); b13.setText(winValues.get(12));
            b10.setText(winValues.get(9));b14.setText(winValues.get(13));
            b11.setText(winValues.get(10));b15.setText(winValues.get(14));
            b12.setText(winValues.get(11));b16.setText(winValues.get(15));
        }
        if(f.checkWon(b1.getText()+b2.getText()+b3.getText()+b4.getText()+b5.getText()+b6.getText()+b7.getText()+b8.getText()
        +b9.getText()+b10.getText()+b11.getText()+b12.getText()+b13.getText()+b14.getText()+b15.getText()+b16.getText())){
            northlabel.setText("Gratulerar! du har vunnit");
        }else northlabel.setText("");
    }
}
