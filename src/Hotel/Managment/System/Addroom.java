package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Addroom extends JFrame implements ActionListener {
    JTextField t2,t4;
    JComboBox t3,t5;
    JButton b1,b2;
    Addroom(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,875,490);
        panel.setBackground(new Color(3,48,48));
        panel.setLayout(null);
        add(panel);
        setUndecorated(false);

        JLabel label1=new JLabel("ADD ROOM");
        label1.setBounds(194,10,160,22);
        label1.setFont(new Font("Tahoma",Font.BOLD,22));
        label1.setForeground(new Color(229, 193, 133));
        panel.add(label1);

        JLabel label2=new JLabel("Room Number");
        label2.setBounds(64,70,152,22);
        label2.setFont(new Font("Tahoma",Font.BOLD,18));
        label2.setForeground(Color.white);
        panel.add(label2);

        t2=new JTextField();
        t2.setBounds(210,72,156,20);
        t2.setFont(new Font("Tahoma",Font.PLAIN,15));
        t2.setForeground(Color.WHITE);
        t2.setBackground(new Color(12, 83, 90));
        panel.add(t2);

        JLabel label3=new JLabel("Availability");
        label3.setBounds(64,110,152,22);
        label3.setFont(new Font("Tahoma",Font.BOLD,18));
        label3.setForeground(Color.white);
        panel.add(label3);

        t3=new JComboBox(new String[]{"Available","Occupied"});
        t3.setFocusable(false);
        t3.setBounds(210,115,156,20);
        t3.setFont(new Font("Tahoma",Font.PLAIN,15));
        t3.setForeground(Color.WHITE);
        t3.setBackground(new Color(12, 83, 90));
        panel.add(t3);

        JLabel label4=new JLabel("Price");
        label4.setBounds(64,150,152,22);
        label4.setFont(new Font("Tahoma",Font.BOLD,18));
        label4.setForeground(Color.white);
        panel.add(label4);

        t4=new JTextField();
        t4.setBounds(210,152,156,20);
        t4.setFont(new Font("Tahoma",Font.PLAIN,15));
        t4.setForeground(Color.WHITE);
        t4.setBackground(new Color(12, 83, 90));
        panel.add(t4);

        JLabel label5=new JLabel("Bed Type");
        label5.setBounds(64,190,152,22);
        label5.setFont(new Font("Tahoma",Font.BOLD,16));
        label5.setForeground(Color.white);
        panel.add(label5);

        t5=new JComboBox(new String[]{"Single Bed","Double Bed"});
        t5.setBounds(210,192,156,20);
        t5.setFont(new Font("Tahoma",Font.PLAIN,15));
        t5.setForeground(Color.WHITE);
        t5.setBackground(new Color(12, 83, 90));
        panel.add(t5);

        b1 =new JButton("ADD");
        b1.setBounds(64,321,111,33);
        b1.setBackground(Color.BLACK);
        b1.setForeground(Color.WHITE);
        b1.setFocusable(false);
        b1.addActionListener(this);
        panel.add(b1);

        b2 =new JButton("BACK");
        b2.setBounds(198,321,111,33);
        b2.setBackground(Color.BLACK);
        b2.setForeground(Color.WHITE);
        b2.setFocusable(false);
        b2.addActionListener(this);
        panel.add(b2);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomser.png"));
        Image image=imageIcon.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(500,60,300,300);
        panel.add(label);


        setUndecorated(true);
        setLocation(20,200);
      setSize(885,500);
      setLayout(null);
      setVisible(true);
      setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if(e.getSource()==b1){
             try{
                 Connect C = new Connect();
                 String room=t2.getText();
                 String ava=(String) t3.getSelectedItem();
                 String price=t4.getText();
                 String type=(String) t5.getSelectedItem();

                 String q="insert into room values('"+room+"','"+ava+"','"+price+"','"+type+"')";
                 C.statement.executeUpdate(q); //executeupdate use to insert value in table- executequery use to get data from table
                 JOptionPane.showMessageDialog(null,"Room Successfully Added");
                 this.setVisible(false);
             }catch(Exception E) {
                 E.printStackTrace();
             }
         } else {
             setVisible(false);
         }
    }

    public static void main(String[] args){
        new Addroom();
    }
}
