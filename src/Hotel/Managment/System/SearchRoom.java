package Hotel.Managment.System;

import net.proteanit.sql.DbUtils;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class SearchRoom extends JFrame implements ActionListener {
    JCheckBox checkBox;
    Choice choice;
    JTable table;
    JButton search, back;

    public SearchRoom() {
        JPanel panel = new JPanel();
        panel.setBackground(new Color(3, 47, 48));
        panel.setBounds(5, 5, 690, 490);
        panel.setLayout(null);
        add(panel);

        JLabel searchForRoom = new JLabel("Search For Room");
        searchForRoom.setBounds(250, 11, 186, 31);
        searchForRoom.setForeground(new Color(229, 193, 133));
        searchForRoom.setFont(new Font("Tahoma", Font.BOLD, 20));
        panel.add(searchForRoom);

        JLabel rbt = new JLabel("Room Bed Type:");
        rbt.setBounds(50,73,120,25);
        rbt.setForeground(Color.WHITE);
        rbt.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(rbt);

        JLabel rn = new JLabel("Room Number");
        rn.setBounds(4,152,150,20);
        rn.setForeground(Color.WHITE);
        rn.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(rn);

        JLabel available = new JLabel("Availability");
        available.setBounds(175,152,150,20);
        available.setForeground(Color.WHITE);
        available.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(available);

        JLabel price = new JLabel("Price");
        price.setBounds(350,152,150,20);
        price.setForeground(Color.WHITE);
        price.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(price);

        JLabel BT = new JLabel("Bed Type");
        BT.setBounds(530,152,150,20);
        BT.setForeground(Color.WHITE);
        BT.setFont(new Font("Tahoma", Font.BOLD,14));
        panel.add(BT);


        checkBox = new JCheckBox("Only Display Available");
        checkBox.setBounds(400, 69, 205, 23);
        checkBox.setBackground(new Color(3, 47, 48));
        checkBox.setForeground(Color.white);
        panel.add(checkBox);



        choice=new Choice();
        choice.add("Single Bed");
        choice.add("Double Bed");
        choice.setBounds(170,73,120,20);
        panel.add(choice);

        table=new JTable();
        table.setBounds(0,172,700,150);
        table.setBackground(new Color(3,47,48));
        table.setForeground(Color.white);
        panel.add(table);

        try {
             Connect C=new Connect();
             String q="select * from room";
            ResultSet resultSet=C.statement.executeQuery(q);
            table.setModel(DbUtils.resultSetToTableModel(resultSet)); //data is stored in the table

        }catch (Exception e){
            e.printStackTrace();
        }

        search = new JButton("Search");
        search.setBounds(200,400,120,30);
        search.setBackground(Color.BLACK);
        search.setForeground(Color.WHITE);
        search.setFocusable(false);
        search.addActionListener(this);
        panel.add(search);

        back = new JButton("Back");
        back.setBounds(380,400,120,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.setFocusable(false);
        back.addActionListener(this);
        panel.add(back);

        setUndecorated(true);
        setLocation(500, 200);
        setSize(700, 500);
        setLayout(null);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
         if (e.getSource()==search){
            String q="select * from room where bed_type= '"+choice.getSelectedItem()+"'";
            String q1="select * from room where availability='Available' AND bed_type='"+choice.getSelectedItem()+"'";

            try {
                Connect C=new Connect();
                ResultSet resultSet=C.statement.executeQuery(q);
                table.setModel(DbUtils.resultSetToTableModel(resultSet));

                if (checkBox.isSelected()){
                    ResultSet resultSet1=C.statement.executeQuery(q1);
                    table.setModel(DbUtils.resultSetToTableModel(resultSet1));
                }

            }catch (Exception E){
                E.printStackTrace();
            }
         }
         else {
             setVisible(false);
         }
    }

    public static void main(String[] args) {
        new SearchRoom();
    }
}
