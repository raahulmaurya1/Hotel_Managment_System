package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class CustomerInfo extends JFrame {
    CustomerInfo(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,890,590);
        panel.setBackground(new Color(3,45,48));
        panel.setLayout(null);
        add(panel);

        JLabel label=new JLabel("Customer Info");
        label.setBackground(new Color(3,47,48));
        label.setForeground(new Color(229, 193, 133));
        label.setFont(new Font("Tahoma",Font.BOLD,20));
        label.setBounds(360,5,260,53);
        panel.add(label);

        JTable table = new JTable();
        table.setBounds(10,80,900,350);
        table.setBackground(new Color(3,45,48));
        table.setForeground(Color.WHITE);
        panel.add(table);

        try {

            Connect c = new Connect();
            String q = "select * from Customer";
            ResultSet resultSet = c.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));

        }catch (Exception e ){
            e.printStackTrace();
        }

        JLabel id = new JLabel("ID");
        id.setBounds(20,60,100,14);
        id.setForeground(Color.WHITE);
        id.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(id);

        JLabel number = new JLabel("Number");
        number.setBounds(130,60,100,14);
        number.setForeground(Color.WHITE);
        number.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(number);

        JLabel name = new JLabel("Name");
        name.setBounds(237,60,100,14);
        name.setForeground(Color.WHITE);
        name.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(352,60,100,14);
        gender.setForeground(Color.WHITE);
        gender.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel country = new JLabel("Country");
        country.setBounds(462,60,100,25);
        country.setForeground(Color.WHITE);
        country.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(country);

        JLabel room = new JLabel("Room");
        room.setBounds(575,60,100,14);
        room.setForeground(Color.WHITE);
        room.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(room);

        JLabel Time = new JLabel("CI Time");
        Time.setBounds(700,60,100,14);
        Time.setForeground(Color.WHITE);
        Time.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Time);

        JLabel Deposit = new JLabel("Deposit");
        Deposit.setBounds(800,60,100,14);
        Deposit.setForeground(Color.WHITE);
        Deposit.setFont( new Font("Tahoma", Font.BOLD,14));
        panel.add(Deposit);

        JButton back = new JButton("Back");
        back.setBounds(450,510,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });


        setUndecorated(true);
        setLayout(null);
        setSize(900,600);
        setLocation(500,100);
        setVisible(true);

    }
    public static void main(String[] args){
        new CustomerInfo();
    }
}
