package MVCcrypt;

import java.io.File;
import java.util.Scanner;
import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class MVC {
    public static void main(String[] args) {

     int message = 56;
     int key = 12;
     int crypt = message^key;

     int cribt = message|key;

     System.out.println(Integer.toBinaryString(crypt));
        System.out.println(Integer.toBinaryString(cribt));
    }
}
