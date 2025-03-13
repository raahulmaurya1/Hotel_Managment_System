package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Dashboard extends JFrame implements ActionListener {
    JButton add1, rec;

    Dashboard(){
        super("HOTEL MANAGEMENT SYSTEM");
        rec = new JButton("RECEPTION");
        rec.setBounds(425,510,140,30);
        rec.setFont(new Font("Tahoma",Font.BOLD,15));
        rec.setBackground(new Color(255,98,0));
        rec.setForeground(Color.WHITE);
        rec.setFocusable(false);
        rec.addActionListener(this);
        add(rec);


        add1 = new JButton("ADMIN");
        add1.setBounds(880,510,140,30);
        add1.setFont(new Font("Tahoma",Font.BOLD,15));
        add1.setBackground(new Color(255,98,0));
        add1.setForeground(Color.WHITE);
        add1.setFocusable(false);
        add1.addActionListener(this);
        add(add1);

        ImageIcon imageIcon2=new ImageIcon("C:\\Users\\raahu\\OneDrive\\Desktop\\Hotel Managment System\\Hotel Managment System\\src\\icon\\boss.png");
        Image i2=imageIcon2.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);;
        imageIcon2 = new ImageIcon(i2);
        JLabel label2=new JLabel(imageIcon2);
        label2.setBounds(850,300,200,195);

        add(label2);

        ImageIcon imageIcon3=new ImageIcon("C:\\Users\\raahu\\OneDrive\\Desktop\\Hotel Managment System\\Hotel Managment System\\src\\icon\\Reception.png");
        Image i3=imageIcon3.getImage().getScaledInstance(200,195,Image.SCALE_DEFAULT);;
        imageIcon3 = new ImageIcon(i3);
        JLabel label3=new JLabel(imageIcon3);
        label3.setBounds(400,300,200,195);
        add(label3);


        ImageIcon imageIcon=new ImageIcon("src/icon/Dashboard.gif");
        Image i1=imageIcon.getImage().getScaledInstance(1965,1090,Image.SCALE_DEFAULT);;
        ImageIcon imageIcon1= new ImageIcon(i1);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(0,0,1965,1090);

        setSize(1965,1090);
        setLayout(null);
        setVisible(true);
        add(label);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==rec){
           new Reception();
           setVisible(false);
        }else {
            new Login2();
            setVisible(false);
        }
    }
    public static void main(String[] args){
        new Dashboard();
    }
}
