package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class admin extends JFrame implements ActionListener {
    JButton add_emp,add_room,logout,back;
    admin(){
      add_emp = new JButton("ADD EMPLOYEE");
      add_emp.setBounds(250,230,200,30);
      add_emp.setBackground(Color.BLACK);
      add_emp.setForeground(new Color(229,193,133));
      add_emp.setFont(new Font("Tahoma",Font.BOLD,15));
      add_emp.setFocusable(false);
      add_emp.addActionListener(this);

      add(add_emp);

        add_room = new JButton("ADD ROOM");
        add_room.setBounds(250,380,200,30);
        add_room.setBackground(Color.BLACK);
        add_room.setForeground(new Color(229,193,133));
        add_room.setFont(new Font("Tahoma",Font.BOLD,15));
        add_room.setFocusable(false);
        add_room.addActionListener(this);
        add(add_room);

        logout = new JButton("LOGOUT");
        logout.setBounds(50,800,100,30);
        logout.setBackground(Color.BLACK);
        logout.setForeground(new Color(229,193,133));
        logout.setFont(new Font("Tahoma",Font.BOLD,15));
        logout.setFocusable(false);
        logout.addActionListener(this);
        add(logout);

        back = new JButton("BACK");
        back.setBounds(170,800,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(new Color(229,193,133));
        back.setFont(new Font("Tahoma",Font.BOLD,15));
        back.setFocusable(false);
        back.addActionListener(this);
        add(back);

        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icon/employees.png"));
        Image i2= i1.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon=new ImageIcon(i2);
        JLabel label=new JLabel(imageIcon);
        label.setBounds(70,180,120,120);
        add(label);

        ImageIcon i3=new ImageIcon(ClassLoader.getSystemResource("icon/room.png"));
        Image i4=i3.getImage().getScaledInstance(120,120,Image.SCALE_DEFAULT);
        ImageIcon imageIcon2=new ImageIcon(i4);
        JLabel label2=new JLabel(imageIcon2);
        label2.setBounds(70,340,120,120);
        add(label2);

        ImageIcon i5=new ImageIcon(ClassLoader.getSystemResource("icon/login.gif"));
        Image i6=i5.getImage().getScaledInstance(800,800,Image.SCALE_DEFAULT);
        ImageIcon imageIcon3=new ImageIcon(i6);
        JLabel label3=new JLabel(imageIcon3);
        label3.setBounds(550,20,800,800);
        add(label3);

      setLayout(null);
      setSize(1950,1090);
      setVisible(true);
      getContentPane().setBackground(new Color(3, 48, 47));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       if(e.getSource()==add_emp){
            new Addemployee();
       }else if(e.getSource()==add_room) {
          new Addroom();
       } else if (e.getSource()==logout) {
         System.exit(101);

       } else if (e.getSource()==back) {
         new Dashboard();
         this.setVisible(false);
       }
    }

    public static void main(String[] args){
      new admin();
    }
}
