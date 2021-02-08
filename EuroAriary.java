import javax.swing.*;
import java.awt.*;
import java.awt.event.*;


public class EuroAriary {

    JTextField EuroText, AriaryText;
    JButton Conversion, Conversion1;

    EuroAriary() {
        JFrame frame = new JFrame("Conversion Euro-Ariary");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(450, 300);

        JPanel panel = new JPanel();


        panel.setLayout(null);
        JLabel Euro = new JLabel("Euro : ");
        Euro.setBounds(60, 20, 140, 25);
        panel.add(Euro);

        JTextField EuroText = new JTextField(20);
        EuroText.setBounds(190, 20, 185, 30);
        panel.add(EuroText);

        JLabel Ariary = new JLabel("Taux de change: ");
        Ariary.setBounds(60, 80, 140, 25);
        panel.add(Ariary);

        JTextField AriaryText = new JTextField(20);
        AriaryText.setBounds(190, 80, 185, 30);
        panel.add(AriaryText);

        JLabel Montant = new JLabel("Montant en Ariary: ");
        Montant.setBounds(60, 130, 140, 25);
        panel.add(Montant);

        JTextField MontantText = new JTextField(20);
        MontantText.setBounds(190, 130, 185, 30);
        panel.add(MontantText);

        JButton Conversion = new JButton("Conversion Euro-Ariary");
        Conversion.setBounds(100, 170, 200, 25);
        panel.add(Conversion);

        Conversion.addActionListener(new ActionListener() {

            @Override
            public void actionPerformed(ActionEvent e) {

                String Euro = EuroText.getText();
                String change = AriaryText.getText();
                double B = Double.parseDouble(change);
                double A = Double.parseDouble(Euro);
                double res;
                res = A * B;
                Double Resu = res;
                String ans = Resu.toString();

                MontantText.setText(ans);


            }
        });


        frame.add(panel);
        frame.setVisible(true);
    }


    public static void main(String[] args) {
        new EuroAriary();
    }

}
