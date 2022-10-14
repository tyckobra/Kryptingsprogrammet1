package MVCcrypt;

import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Controller extends JFrame {
    Model model;
    View view;

    public Controller(Model m, View v) {
        this.model = m;
        this.view = v;
    }

}
