import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.*;

public class JFrameExample {
    public static void main(String [] args){
        JFrame frame = new JFrame("Hello Henintsoa");
        JLabel label = new JLabel("I am Henintsoa",JLabel.CENTER);
        JPanel panel = new JPanel();

        BoxLayout boxLayout = new BoxLayout(panel,BoxLayout.Y_AXIS);
        panel.setLayout(boxLayout);
        panel.setBorder(new EmptyBorder(new Insets(45,70,45,70)));

        JButton jb1 = new JButton("Button 1");
        JButton jb2 = new JButton("Button 2");
        JButton jb3 = new JButton("Button 3");

        panel.add(jb1);
        panel.add(jb2);
        panel.add(jb3);

        // Add the label and panel to the frame
        frame.setLayout(new GridLayout(2, 1));

        frame.add(label);
        frame.add(panel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
