package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Room extends JFrame{
    JTable table;
    JButton back;
    Room(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color( 3,47,48));
        panel.setLayout(null);
        add(panel);

        ImageIcon imageIcon=new ImageIcon(ClassLoader.getSystemResource("icon/roomm.png"));
        Image image=imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1=new ImageIcon(image);
        JLabel label=new JLabel(imageIcon1);
        label.setBounds(600,200,200,200);
        panel.add(label);

        table=new JTable();
        table.setBounds(10,40,500,400);
        table.setBackground(new Color(3,47,48));
        table.setForeground(Color.white);
        panel.add(table);

        try {
            Connect C= new Connect();
            String q="select * from room"; //to getb roominfo
            ResultSet resultSet=C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception E){
            E.printStackTrace();
        }

        back = new JButton("BACK");
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setBounds(200,500,120,30);
        panel.add(back);
        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });
        JLabel room_no = new JLabel("Room No.");
        room_no.setBounds(20,15,80,19);
        room_no.setForeground(Color.WHITE);
        room_no.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(room_no);

        JLabel availablity=new JLabel("Availability");
        availablity.setBounds(135,15,80,19);
        availablity.setForeground(Color.WHITE);
        availablity.setFont(new Font("tahoma",Font.BOLD,14));
        panel.add(availablity);

        JLabel Price = new JLabel("Price");
        Price.setBounds(260,15,80,19);
        Price.setForeground(Color.WHITE);
        Price.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Price);

        JLabel Bed = new JLabel("Bed Type");
        Bed.setBounds(400,15,80,19);
        Bed.setForeground(Color.WHITE);
        Bed.setFont(new Font("Tahoma", Font.BOLD, 14));
        panel.add(Bed);

        setUndecorated(true);
        setLayout(null);
      setLocation(500,100);
      setSize(900,600);
      setVisible(true);
      setResizable(false);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String[] args){
        new Room();
    }
}
