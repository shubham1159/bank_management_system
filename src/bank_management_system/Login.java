package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;

public class Login extends JFrame implements ActionListener {  //here actionlisterner is used to use buttons as click

    JLabel label1, label2, label3; //here we have diclared the label globally so that we use it anytime we want
    JTextField textField2;
    JPasswordField passwordField3;

    JButton button1,button2, button3;
    Login(){
        super("BANK MANAGEMENT SYSTEM"); //super is used to set the title of  your page

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));//get system resource is used to take the url of the image
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);  //this helps to bring the background of our page but it can't be taken in directly to the frame so we will have to take the image into label initialize a new variable i3
        JLabel image = new JLabel(i3);
        image.setBounds(350,10,100,100);  //this shows where the image is to be visible and at what angles
        add(image);  //till here we have just done the image of the logo of bank

        ImageIcon ii1 = new ImageIcon(ClassLoader.getSystemResource("icon/card.png"));
        Image ii2 = ii1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon ii3 = new ImageIcon(ii2);
        JLabel iimage = new JLabel(ii3);
        iimage.setBounds(630,350,100,100);
        add(iimage);

        label1 = new JLabel("WELCOME TO ATM");
        label1.setForeground(Color.white);//we can change the color of the text
        label1.setFont(new Font("AvantGarde",Font.BOLD,38));
        label1.setBounds(230,125,450,40);
        add(label1);

        label2 = new JLabel("Card No:");
        label2.setFont(new Font("Ralway", Font.BOLD, 28));
        label2.setForeground(Color.white);
        label2.setBounds(150, 190, 375, 30);
        add(label2);

        textField2 = new JTextField(15);
        textField2.setBounds(325,190,230,30);
        textField2.setFont(new Font("Arial", Font.BOLD, 14));
        add(textField2);

        label3 = new JLabel("PIN:");
        label3.setFont(new Font("Ralway", Font.BOLD, 28));
        label3.setForeground(Color.white);
        label3.setBounds(150, 250, 375, 30);
        add(label3);

        passwordField3 = new JPasswordField(15);
        passwordField3.setBounds(325, 250, 230, 30);
        passwordField3.setFont(new Font("Arial",Font.BOLD, 14));
        add(passwordField3);

        button1 = new JButton("SIGN IN");
        button1.setFont(new Font("Arial",Font.BOLD,14));
        button1.setForeground(Color.white);
        button1.setBackground(Color.black);
        button1.setBounds(300,300,100,30);
        button1.addActionListener(this); //this activelsitener is used to get which button is being hit by the user and that will be stored in the ActionEvent e
        add(button1);

        button2 = new JButton("CLEAR");
        button2.setFont(new Font("Arial",Font.BOLD,14));
        button2.setForeground(Color.white);
        button2.setBackground(Color.black);
        button2.setBounds(430,300,100,30);
        button2.addActionListener(this);
        add(button2);

        button3 = new JButton("SIGN UP");
        button3.setFont(new Font("Arial",Font.BOLD,14));
        button3.setForeground(Color.white);
        button3.setBackground(Color.black);
        button3.setBounds(300,350,230,30);
        button3.addActionListener(this);
        add(button3);





        ImageIcon iii1 = new ImageIcon(ClassLoader.getSystemResource("icon/backbg.png"));
        Image iii2 = iii1.getImage().getScaledInstance(850,480, Image.SCALE_DEFAULT);
        ImageIcon iii3 = new ImageIcon(iii2);
        JLabel iiimage = new JLabel(iii3);
        iiimage.setBounds(0,0,850,480);
        add(iiimage);







        setLayout(null); //it is the way in which the items in the desktop will be visible so we have kept it null because we will be able to change the layout as per our choice
        setSize(850,480);   //here the frame is not visible so we need to set visiblity for that and anything which you want to have on your screen then you must write all the things  before setVisibility
        setLocation(450,200);
        setUndecorated(true); //this is used to remove the cross minimize and maximize sign
        setVisible(true);   //this is used here to show the frame or make the frame visible

    }

    @Override
    public void actionPerformed(ActionEvent e) {  //we have used this because we have used actionlistener so for actionlistener we have to use actionperformed
      try{
       if (e.getSource() ==button1){
           Con c = new Con();
           String cardno = textField2.getText();
           String pin = passwordField3.getText();
           String q ="select * from login where card_number = '"+cardno+"' and pin = '"+pin+"'";
           ResultSet resultSet = c.statement.executeQuery(q);
           if (resultSet.next()){
               setVisible(false);
               new main_class(pin);
           }else {
               JOptionPane.showMessageDialog(null,"Incorrect card number or pin");
           }

       }else if (e.getSource() == button2){
         textField2.setText("");
         passwordField3.setText("");
       }else if (e.getSource() == button3){
          new Signup();  //this is used to make our signup page visible
          setVisible(false);
       }
      }
      catch(Exception E){
          E.printStackTrace(); //this is helpful in showing us the error
        }
    }

    public static void main(String[] args) {
        new Login();
    }
}
