import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GameFrame extends JFrame implements ActionListener {
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
    JButton b16 = new JButton(f.getList().get(15));
    JButton newGame = new JButton("New Game");
    GameFrame(){

        add(mainPanel);
        mainPanel.add(l1, BorderLayout.CENTER);

        l1.add(b1);l1.add(b2);l1.add(b3);l1.add(b4);
        l1.add(b5);l1.add(b6);l1.add(b7);l1.add(b8);
        l1.add(b9);l1.add(b10);l1.add(b11);l1.add(b12);
        l1.add(b13);l1.add(b14);l1.add(b15);l1.add(b16);

        b1.addActionListener(this);b2.addActionListener(this);b3.addActionListener(this);b4.addActionListener(this);
        b5.addActionListener(this);b6.addActionListener(this);b7.addActionListener(this);b8.addActionListener(this);
        b9.addActionListener(this);b10.addActionListener(this);b11.addActionListener(this);b12.addActionListener(this);
        b13.addActionListener(this);b14.addActionListener(this);b15.addActionListener(this);b16.addActionListener(this);

        mainPanel.add(southPanel, BorderLayout.SOUTH);
        southPanel.add(newGame);

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
    }
}
