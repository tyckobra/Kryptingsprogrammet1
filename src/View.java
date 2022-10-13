import javax.swing.*;

public class View {
    private JTextField textField1;
    private JTextField textField2;
    private JTextField textField3;
    private JPanel mainPanel;
    private JButton cryptButton;

    public static void main(String[] args) {
        JFrame frame = new JFrame("View");
        frame.setContentPane(new View().mainPanel);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.pack();
        frame.setVisible(true);
    }
}
