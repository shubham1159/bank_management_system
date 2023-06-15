package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.util.Date;

public class Withdrawl extends JFrame implements ActionListener {

    String pin;  //this will be the second step to initialize the pin globally

    TextField textField;

    JButton b1,b2;


    Withdrawl(String pin){
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("MAXIMUM WITHDRAWL IS 10000");
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(460,180,700,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);  //this is used here because we have to print our label on an image so here only add() will not work

        JLabel label2 = new JLabel("PLEASE ENTER YOUR AMOUNT");
        label2.setFont(new Font("Raleway",Font.BOLD,16));
        label2.setBounds(460,220,400,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);  //this is used here because we have to print our label on an image so here only add() will not work


        textField = new TextField();
        textField.setBackground(new Color(65,125,128));
        textField.setForeground(Color.WHITE);
        textField.setBounds(460,260,320,25);
        textField.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(textField);

        b1 = new JButton("WITHDRAWL");
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
        if(e.getSource()==b1){
        try{
            String amount = textField.getText();
            Date date = new Date();
            if(textField.getText().equals("")){  //if the user left the text field empty
                JOptionPane.showMessageDialog(null,"Please enter the amount you want to withdraw");
            }else{
                Con c = new Con();  //if he entered the required field correct then the amount wil be checked according to the database
                ResultSet resultSet = c.statement.executeQuery("select * from bank where pin = '"+pin+"'");   //this the query which is used to store the data in the database where pin matches
                int balance = 0;
                while (resultSet.next()){   // this is ued to check whether the data is being stored in the table or not
                    if (resultSet.getString("type").equals("Deposit")){  //when the type is deposite then the first query will be executed else the other one for withdrawl will be executed
                        balance += Integer.parseInt(resultSet.getString("amount"));
                    }else{
                        balance -= Integer.parseInt(resultSet.getString("amount"));
                    }

                }
                if (balance < Integer.parseInt(amount)){
                    JOptionPane.showMessageDialog(null,"Insufficient Balance");
                    return;
                }
                c.statement.executeUpdate("insert into bank values('"+pin+"','"+date+"','Withdrawl','"+amount+"')"); //this query is used to update the value of the table after withdrawl
                JOptionPane.showMessageDialog(null,"Rs. "+amount+" Debited Successfull");
                setVisible(false);  //frame will be closed here
                new main_class(pin);//and the main screen will be visible
            }

        }catch(Exception E) {
        }
        } else if (e.getSource()==b2) {
            setVisible(false);
            new main_class(pin);
        }
    }

    public static void main(String[] args) {
        new Withdrawl("");

    }
}

