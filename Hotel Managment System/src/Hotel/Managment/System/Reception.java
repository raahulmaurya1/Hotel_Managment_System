package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Reception extends JFrame {
    Reception(){
        JPanel panel =new JPanel();
        panel.setLayout(null);
        panel.setBounds(280,5,1250,920);
        panel.setBackground(new Color(3,48,47));
        add(panel);

        JPanel panel1=new JPanel();
        panel1.setLayout(null);
        panel1.setBounds(5,5,270,920);
        panel1.setBackground(new Color(3,48,47));
        add(panel1);

        ImageIcon imageIcon2=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i2=imageIcon2.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);;
        imageIcon2 = new ImageIcon(i2);
        JLabel label2=new JLabel(imageIcon2);
        label2.setBounds(300,20,800,800);
        panel.add(label2);

        ImageIcon imageIcon3=new ImageIcon(ClassLoader.getSystemResource("icon/logo.gif"));
        Image i3=imageIcon3.getImage().getScaledInstance(250,250,Image.SCALE_DEFAULT);;
        imageIcon3 = new ImageIcon(i3);
        JLabel label3=new JLabel(imageIcon3);
        label3.setBounds(5,530,250,250);
        panel1.add(label3);

        JButton btnncf=new JButton("New Customer Form");
        btnncf.setBounds(30,30,200,30);
        btnncf.setBackground(Color.BLACK);
        btnncf.setForeground(Color.WHITE);
        setBackground(new Color(3, 48, 47));
        btnncf.setFocusable(false);
        panel1.add(btnncf);
        btnncf.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    new NewCustomer();
                }catch (Exception E){

                }
            }
        });

        JButton btnroom=new JButton("Room");
        btnroom.setBounds(30,70,200,30);
        btnroom.setBackground(Color.BLACK);
        btnroom.setForeground(Color.WHITE);
        setBackground(new Color(3, 48, 47));
        btnroom.setFocusable(false);
        panel1.add(btnroom);
        btnroom.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    new Room();
                }catch (Exception E){

                }
            }
        });

        JButton btnaei=new JButton("All Employee Info");
        btnaei.setBounds(30,110,200,30);
        btnaei.setBackground(Color.BLACK);
        btnaei.setForeground(Color.WHITE);
        btnaei.setFocusable(false);
        panel1.add(btnaei);
        btnaei.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                 new Employee();
                }catch (Exception E){
                  E.printStackTrace();
                }
            }
        });

        JButton btnci=new JButton("Customer Info");
        btnci.setBounds(30,150,200,30);
        btnci.setBackground(Color.BLACK);
        btnci.setForeground(Color.WHITE);
        btnci.setFocusable(false);
        panel1.add(btnci);
        btnci.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                 new CustomerInfo();
                }catch (Exception E){

                }
            }
        });

        JButton btncho=new JButton("Check Out");
        btncho.setBounds(30,190,200,30);
        btncho.setBackground(Color.BLACK);
        btncho.setForeground(Color.WHITE);
        btncho.setFocusable(false);
        panel1.add(btncho);
        btncho.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    new CheckOut();
                }catch (Exception E){
                        E.printStackTrace();
                }
            }
        });

        JButton btnuchi=new JButton("Update Check IN");
        btnuchi.setBounds(30,230,200,30);
        btnuchi.setBackground(Color.BLACK);
        btnuchi.setForeground(Color.WHITE);
        btnuchi.setFocusable(false);
        panel1.add(btnuchi);
        btnuchi.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    new UpdateCheck();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });


        JButton btnsr=new JButton("Search Room");
        btnsr.setBounds(30,270,200,30);
        btnsr.setBackground(Color.BLACK);
        btnsr.setForeground(Color.WHITE);
        btnsr.setFocusable(false);
        panel1.add(btnsr);
        btnsr.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                   new SearchRoom();
                }catch (Exception E){

                }
            }
        });

        JButton logout = new JButton("Logout");
        logout.setBounds(30,450,95,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(Color.WHITE);
        logout.setFocusable(false);
        panel1.add(logout);
        logout.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    System.exit(500);
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        JButton back = new JButton("Back");
        back.setBounds(140,450,95,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        panel1.add(back);
        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                try {
                    setVisible(false);
                    new Dashboard();
                }catch (Exception E){
                    E.printStackTrace();
                }
            }
        });

        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setSize(1950,1090);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

    }
    public static void main(String[] args){
        new Reception();
    }
}
