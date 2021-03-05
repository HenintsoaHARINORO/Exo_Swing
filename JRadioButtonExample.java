import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class JRadioButtonExample {
    public static void main(String [] args){
        JFrame frame = new JFrame("Hello Henintsoa");
        JPanel panel = new JPanel();

        ButtonGroup bg = new ButtonGroup();
        JRadioButton rb1 = new JRadioButton("Male",true);
        JRadioButton rb2 = new JRadioButton("Female",false);

        bg.add(rb1);
        bg.add(rb2);

        panel.add(rb1);
        panel.add(rb2);
        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }
}
