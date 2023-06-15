package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Date;

public class Deposit extends JFrame implements ActionListener {

    String pin;  //this will be the second step to initialize the pin globally

    TextField textField;

    JButton b1,b2;
    Deposit(String pin){  //for receiving the pin here is the first step of adding string pin
        this.pin = pin;   //third step

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("ENTER AMOUNT YOU WANT TO DEPOSIT");
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(460,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);  //this is used here because we have to print our label on an image so here only add() will not work

        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,230,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("DEPOSIT");
        b1.setBounds(700,362,150,35);
        b1.setBackground(new Color(65,125,128));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        l3.add(b1);

        b2 = new JButton("BACK");
        b2.setBounds(700,406,150,35);
        b2.setBackground(new Color(65,125,128));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        l3.add(b2);




        setSize(1550,1080);
        setLocation(0,0); //ths is taken when we want to put the page on entire screen
        setLayout(null);
        setVisible(true);  //sp that the frame can be visible to us


    }

    @Override
    public void actionPerformed(ActionEvent e) {

        try {
            String amount = textField.getText();  //this is used to get the amount and it is per the mysql
            Date date = new Date();
            if (e.getSource()==b1){
                if(textField.getText().equals("")){
                    JOptionPane.showMessageDialog(null,"Please enter the amount ou want to deposite ");
                }else{
                    Con c =  new Con();
                    c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Deposit','"+amount+"')");  //we have used here deposit which will be stored in the type
                    JOptionPane.showMessageDialog(null,"Rs."+amount+" Deposited Successfully");
                    setVisible(false);
                    new main_class(pin);
                }

            } else if (e.getSource()==b2) {  //if the deposite is done then this will work
                setVisible(false);
                new main_class(pin);
            }
        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Deposit("");   // the last step i to pass the empty string in the object
    }
}
