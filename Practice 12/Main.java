import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Main extends JFrame {
    JTextField jtf = new JTextField(10);
    JButton button = new JButton("Learn");
    Font fnt = new Font("Lombardina Initial Two", Font.BOLD, 20);

    Main(){
        super("Gravitational acceleration");
        setLayout(new FlowLayout());
        setSize(700, 450);
        add(new JLabel("Planet"));
        add(jtf);
        add(button);

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                try {
                    String nameOfPlanet = (jtf.getText().trim());
                    Planets planet = Planets.valueOf(nameOfPlanet.toUpperCase());
                    double gravAccel = ((double)((int)(planet.getGravity()*100.0))/100.0);
                    JOptionPane.showMessageDialog(null, "Gravitational acceleration on the surface of " + planet.getTitle() + " is " + gravAccel, "Success", JOptionPane.INFORMATION_MESSAGE);
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
