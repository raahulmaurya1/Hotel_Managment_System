package Hotel.Managment.System;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class NewCustomer extends JFrame implements ActionListener {
    JComboBox comboBox;
    JTextField textFieldNumber ,TextName, TextCountry,TextDeposite;
    JRadioButton r1, r2;
    Choice c1;
    JLabel date;

    JButton add,back;
    NewCustomer(){
        JPanel panel = new JPanel();
        panel.setBounds(5,5,840,540);
        panel.setLayout(null);
        panel.setBackground(new Color(3,45,48));
        add(panel);

        ImageIcon imageIcon = new ImageIcon(ClassLoader.getSystemResource("icon/customer.png"));
        Image image = imageIcon.getImage().getScaledInstance(200,200,Image.SCALE_DEFAULT);
        ImageIcon imageIcon1 = new ImageIcon(image);
        JLabel imglabel = new JLabel(imageIcon1);
        imglabel.setBounds(550,150,200,200);
        panel.add(imglabel);

        JLabel labelName = new JLabel("NEW CUSTOMER FORM");
        labelName.setBounds(118,11,260,53);
        labelName.setForeground(new Color(229, 193, 133));
        labelName.setFont(new Font("Tahoma", Font.BOLD,20));
        panel.add(labelName);

        JLabel labelID = new JLabel("ID :");
        labelID.setBounds(35,76,200,14);
        labelID.setForeground(Color.WHITE);
        labelID.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelID);

        comboBox = new JComboBox(new String[] {"Passport", "Aadhar Card", "Voter Id", "Driving License"});
        comboBox.setBounds(271,73,150,20);
        comboBox.setBackground(new Color(3,45,48));
        comboBox.setForeground(Color.WHITE);
        comboBox.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(comboBox);

        JLabel labelNumber = new JLabel("Number :");
        labelNumber.setBounds(35,111,200,14);
        labelNumber.setForeground(Color.WHITE);
        labelNumber.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelNumber);
        textFieldNumber = new JTextField();
        textFieldNumber.setForeground(Color.WHITE);
        textFieldNumber.setBackground(new Color(16,108,115));
        textFieldNumber.setBounds(271,111,150,20);
        panel.add(textFieldNumber);

        JLabel labelname = new JLabel("Name :");
        labelname.setBounds(35,151,200,14);
        labelname.setForeground(Color.WHITE);
        labelname.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelname);
        TextName = new JTextField();
        TextName.setBackground(new Color(16,108,115));
        TextName.setForeground(Color.WHITE);
        TextName.setBounds(271,151,150,20);
        panel.add(TextName);


        JLabel labelGender = new JLabel("Gender :");
        labelGender.setBounds(35,191,200,14);
        labelGender.setForeground(Color.WHITE);
        labelGender.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelGender);

        r1 = new JRadioButton("Male");
        r1.setFont(new Font("Tahoma", Font.BOLD, 14));
        r1.setForeground(Color.WHITE);
        r1.setBackground(new Color(3,45,48));
        r1.setBounds(271,191,80,12);
        panel.add(r1);

        r2 = new JRadioButton("Female");
        r2.setFont(new Font("Tahoma", Font.BOLD, 14));
        r2.setForeground(Color.WHITE);
        r2.setBackground(new Color(3,45,48));
        r2.setBounds(350,191,80,12);
        panel.add(r2);

        JLabel labelCountry = new JLabel("Country :");
        labelCountry.setBounds(35,231,200,14);
        labelCountry.setForeground(Color.WHITE);
        labelCountry.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelCountry);
        TextCountry = new JTextField();
        TextCountry.setForeground(Color.WHITE);
        TextCountry.setBackground(new Color(16,108,115));
        TextCountry.setBounds(271,231,150,20);
        panel.add(TextCountry);


        JLabel labelRoom = new JLabel("Allocated Room Number :");
        labelRoom.setBounds(35,274,200,14);
        labelRoom.setForeground(Color.WHITE);
        labelRoom.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelRoom);

        c1=new Choice();
        try {
            Connect C=new Connect();
            ResultSet resultSet=C.statement.executeQuery("select * from room");
            while (resultSet.next()){
                c1.add(resultSet.getString("roomnumber"));
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        c1.setBounds(271,274,150,20);
        c1.setFont(new Font("Tahoma",Font.BOLD,14));
        c1.setForeground(Color.WHITE);
        c1.setBackground(new Color(16,108,115));
        panel.add(c1);

        JLabel labelCIS = new JLabel("Checked-In :");
        labelCIS.setBounds(35,316,200,14);
        labelCIS.setForeground(Color.WHITE);
        labelCIS.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelCIS);

        Date date1=new Date();
         date=new JLabel(""+date1);
        date.setBounds(200,316,200,14);
        date.setForeground(Color.WHITE);
        date.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(date);

        JLabel labelDeposite = new JLabel("Deposite :");
        labelDeposite.setBounds(35,359,200,14);
        labelDeposite.setForeground(Color.WHITE);
        labelDeposite.setFont(new Font("Tahoma", Font.PLAIN, 14));
        panel.add(labelDeposite);

        TextDeposite = new JTextField();
        TextDeposite.setBackground(new Color(16,108,115));
        TextDeposite.setForeground(Color.white);
        TextDeposite.setBounds(271,359,150,20);
        panel.add(TextDeposite);

        add = new JButton("ADD");
        add.setBounds(100,430,120,30);
        add.setForeground(Color.WHITE);
        add.setBackground(Color.BLACK);
        add.setFocusable(false);
        add.addActionListener(this);
        panel.add(add);

        back = new JButton("BACK");
        back.setBounds(260,430,120,30);
        back.setForeground(Color.WHITE);
        back.setBackground(Color.BLACK);
        back.addActionListener(this);
        back.setFocusable(false);
        panel.add(back);

        setUndecorated(false);
        setUndecorated(true);
        setLayout(null);
        setLocation(500,150);
        setSize(850,550);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
      if (e.getSource()==add){
          Connect C=new Connect();
          String radioBTn=null;
          if (r1.isSelected()){
              radioBTn="Male";

          } else if (r2.isSelected()) {
              radioBTn="Female";
          }
             String S1=(String)comboBox.getSelectedItem();
             String S2=textFieldNumber.getText();
             String S3= TextName.getText();
             String S4= radioBTn;
             String S5=TextCountry.getText();
             String S6=c1.getSelectedItem();
             String S7=date.getText();
             String S8=TextDeposite.getText();

          try {
              String q="insert into customer values('"+S1+"','"+S2+"','"+S3+"','"+S4+"','"+S5+"','"+S6+"','"+S7+"','"+S8+"')";
              String q1="update room set availability= 'Occupied' where roomnumber="+S6;
              C.statement.executeUpdate(q);
              C.statement.executeUpdate(q1);
              JOptionPane.showMessageDialog(null,"added Successfully");
              setVisible(false);
          }catch (Exception E){
              E.printStackTrace();
          }
      }else{
          setVisible(false);
      }
    }

    public  static void main(String[] args){
        new NewCustomer();
    }
}
