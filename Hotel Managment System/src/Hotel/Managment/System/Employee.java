package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Employee extends Frame {
    Employee(){
        JPanel panel=new JPanel();
        panel.setBounds(5,5,990,590);
        panel.setBackground(new Color(3,47,48));
        panel.setLayout(null);
        add(panel);

        JTable table=new JTable();
        table.setBounds(20,45,980,450);
        table.setForeground(Color.WHITE);
        table.setBackground(new Color(3,47,48));
        panel.add(table);

        try {
            Connect C=new Connect();
            String qemployee="select * from employee";
            ResultSet resultSet=C.statement.executeQuery(qemployee);
            table.setModel(DbUtils.resultSetToTableModel(resultSet));
        }catch (Exception e){
            e.printStackTrace();
        }



        JButton back = new JButton("BACK");
        back.setBounds(350,500,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        panel.add(back);
        back.addActionListener(new ActionListener() {

            public void actionPerformed(ActionEvent e) {
                setVisible(false);
            }
        });

        JLabel name = new JLabel("Name");
        name.setBounds(20,25,70,19);
        name.setForeground(Color.WHITE);
        name.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(name);

        JLabel Age = new JLabel("Age");
        Age.setBounds(145,25,70,19);
        Age.setForeground(Color.WHITE);
        Age.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(Age);

        JLabel gender = new JLabel("Gender");
        gender.setBounds(266,25,70,19);
        gender.setForeground(Color.WHITE);
        gender.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gender);

        JLabel job = new JLabel("Job");
        job.setBounds(400,25,70,19);
        job.setForeground(Color.WHITE);
        job.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(job);

        JLabel salary = new JLabel("Salary");
        salary.setBounds(516,25,70,19);
        salary.setForeground(Color.WHITE);
        salary.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(salary);

        JLabel phone = new JLabel("Phone");
        phone.setBounds(636,25,70,19);
        phone.setForeground(Color.WHITE);
        phone.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(phone);

        JLabel gmail = new JLabel("Gmail");
        gmail.setBounds(766,25,70,19);
        gmail.setForeground(Color.WHITE);
        gmail.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(gmail);

        JLabel aadhar = new JLabel("Aadhar");
        aadhar.setBounds(878,25,70,19);
        aadhar.setForeground(Color.WHITE);
        aadhar.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(aadhar);



        setUndecorated(true);
        setLayout(null);
        setResizable(false);
        setLocation(430,100);
        setSize(1000,600);
        setVisible(true);

    }

    public static void main(String[] args){
        new Employee();
    }
}
