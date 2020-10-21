package com.company;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.concurrent.ThreadLocalRandom;

public class Main extends JFrame {
    JTextField jtf = new JTextField(10);
    JButton button = new JButton("Guess");
    Font fnt = new Font("Lombardina Initial Two", Font.BOLD, 20);
    int randNumber = ThreadLocalRandom.current().nextInt(0, 21);
    int flag = 0;

    Main(){
        super("Example");
        setLayout(new FlowLayout());
        setSize(700, 450);
        add(new JLabel("Number"));
        add(jtf);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    double x1 = Double.parseDouble(jtf.getText().trim());

                    if (x1 == randNumber)
                        JOptionPane.showMessageDialog(null, "Congratulations! The number is " + x1, "Success", JOptionPane.INFORMATION_MESSAGE);
                    else {
                        JOptionPane.showMessageDialog(null, "Nope! Not this number", "Fail", JOptionPane.INFORMATION_MESSAGE);
                        flag++;
                        if (flag==3) System.exit(1);
                    }
                }   catch (Exception error) {
                    JOptionPane.showMessageDialog(null, "Error", "Alert", JOptionPane.ERROR_MESSAGE);
                }
            }
        });

        setVisible(true);
    }

    public static void main(String[] args) {
        new Main();
    }

}