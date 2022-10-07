import javax.swing.*;
import java.awt.*;

public class GUI {
        public static void main(String args[]){
            JFrame frame = new JFrame("GUI");
            frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
            frame.setSize(800,200);

            JLabel message = new JLabel("Enter Message");
            JTextField messagefield = new JTextField(10);

            JLabel key = new JLabel("Enter Key");
            JTextField keyfield = new JTextField(10);

            JLabel resultat = new JLabel("Resultat");
            JTextField resultatfield = new JTextField(10);

            JButton crypt = new JButton("CRYPT");
            frame.getContentPane().add(crypt);

            JPanel panelmessage = new JPanel();
            JPanel panelkey = new JPanel();
            JPanel panelresultat = new JPanel();

            panelmessage.add(message);
            panelmessage.add(messagefield);
            panelkey.add(key);
            panelkey.add(keyfield);
            panelresultat.add(resultat);
            panelresultat.add(resultatfield);

            frame.getContentPane().add(BorderLayout.WEST, panelmessage);
            frame.getContentPane().add(BorderLayout.CENTER, panelkey);
            frame.getContentPane().add(BorderLayout.EAST, panelresultat);

            frame.setVisible(true);

    }
}
