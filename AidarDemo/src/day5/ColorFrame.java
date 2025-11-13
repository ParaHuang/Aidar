package day5;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ColorFrame extends JFrame implements ActionListener {
    public static void main(String[] args) {
        ColorFrame frame = new ColorFrame();
        frame.setVisible(true);
    }

    public ColorFrame(){
        setSize(400,400);

        JButton button = new JButton("click me");
        add(button);
        button.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        setTitle("you just click the button");
    }
}
