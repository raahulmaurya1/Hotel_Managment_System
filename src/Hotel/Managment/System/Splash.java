package Hotel.Managment.System;

import javax.swing.*;

public class Splash extends JFrame {
    Splash() {
        ImageIcon imageIcon= new ImageIcon(ClassLoader.getSystemResource("icon/splash.gif"));
        JLabel label = new JLabel(imageIcon);
        label.setBounds(0,0,858,680);
        add(label);

        setLayout(null);
        setLocation(300,80);
        setSize(858, 680);
        setVisible(true);
        setResizable(false);

        try {
            Thread.sleep(3000);
            new Login();
            setVisible(false);
        }catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Splash();
    }
}