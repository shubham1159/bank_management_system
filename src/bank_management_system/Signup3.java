package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

public class Signup3 extends JFrame implements ActionListener {

    JRadioButton r1,r2,r3,r4;

    JCheckBox c1,c2,c3,c4,c5,c6;

    String formno;

    JButton s,c;
    Signup3(String formno){
        this.formno = formno;

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(35,10,100,100);
        add(image);

        JLabel l1 = new JLabel("Page 3:");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(310,40,400,40);
        add(l1);

        JLabel l2 = new JLabel("Account Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(280,70,400,40);
        add(l2);

        JLabel l3 = new JLabel("Account Type:");
        l3.setFont(new Font("Raleway",Font.BOLD,18));
        l3.setBounds(100,140,200,30);
        add(l3);

        r1 = new JRadioButton("Saving account");
        r1.setFont(new Font("Raleway",Font.BOLD,16));
        r1.setBackground(new Color(215,252,252));
        r1.setBounds(100,180,250,30);
        add(r1);

        r2 = new JRadioButton("Fixed Deposite Account");
        r2.setFont(new Font("Raleway",Font.BOLD,16));
        r2.setBackground(new Color(215,252,252));
        r2.setBounds(350,180,300,30);
        add(r2);

        r3 = new JRadioButton("Current Account");
        r3.setFont(new Font("Raleway",Font.BOLD,16));
        r3.setBackground(new Color(215,252,252));
        r3.setBounds(100,220,250,30);
        add(r3);

        r4 = new JRadioButton("Recurring Deposite Account");
        r4.setFont(new Font("Raleway",Font.BOLD,16));
        r4.setBackground(new Color(215,252,252));
        r4.setBounds(350,220,250,30);
        add(r4);

        ButtonGroup buttonGroup = new ButtonGroup();  //this is used to select only one radio button at a time
        buttonGroup.add(r1);
        buttonGroup.add(r2);
        buttonGroup.add(r3);
        buttonGroup.add(r4);

        JLabel l4 = new JLabel("Card Number:");
        l4.setFont(new Font("Raleway",Font.BOLD,18));
        l4.setBounds(100,300,200,30);
        add(l4);

        JLabel l5 = new JLabel("(Your 16-Digit Card Number)");
        l5.setFont(new Font("Raleway",Font.BOLD,12));
        l5.setBounds(100,330,200,20);
        add(l5);

        JLabel l6 = new JLabel("XXXX-XXXX-XXXX-1159");
        l6.setFont(new Font("Raleway",Font.BOLD,18));
        l6.setBounds(350,300,250,30);
        add(l6);

        JLabel l7= new JLabel("It would appear on the ATM card/cheque book and statement");
        l7.setFont(new Font("Raleway",Font.BOLD,12));
        l7.setBounds(330,330,500,20);
        add(l7);

        JLabel l8 = new JLabel("PIN:");
        l8.setFont(new Font("Raleway",Font.BOLD,18));
        l8.setBounds(100,370,200,30);
        add(l8);

        JLabel l9 = new JLabel("XXXX");
        l9.setFont(new Font("Raleway",Font.BOLD,18));
        l9.setBounds(350,370,200,30);
        add(l9);

        JLabel l10 = new JLabel("(Your 4-Digit Pin)");
        l10.setFont(new Font("Raleway",Font.BOLD,12));
        l10.setBounds(100,400,200,20);
        add(l10);

        JLabel l11 = new JLabel("Services Required");
        l11.setFont(new Font("Raleway",Font.BOLD,18));
        l11.setBounds(100,460,200,30);
        add(l11);

        c1=new JCheckBox("ATM Card");
        c1.setBackground(new Color(215,252,252));
        c1.setFont(new Font("Raleway",Font.BOLD,16));
        c1.setBounds(100,500,200,30);
        add(c1);

        c2=new JCheckBox("Internet Banking");
        c2.setBackground(new Color(215,252,252));
        c2.setFont(new Font("Raleway",Font.BOLD,16));
        c2.setBounds(350,500,200,30);
        add(c2);

        c3=new JCheckBox("Mobile Banking");
        c3.setBackground(new Color(215,252,252));
        c3.setFont(new Font("Raleway",Font.BOLD,16));
        c3.setBounds(100,550,200,30);
        add(c3);

        c4=new JCheckBox("Email Alerts");
        c4.setBackground(new Color(215,252,252));
        c4.setFont(new Font("Raleway",Font.BOLD,16));
        c4.setBounds(350,550,200,30);
        add(c4);

        c5=new JCheckBox("Cheque Book");
        c5.setBackground(new Color(215,252,252));
        c5.setFont(new Font("Raleway",Font.BOLD,16));
        c5.setBounds(100,600,200,30);
        add(c5);

        c6=new JCheckBox("E-Statement");
        c6.setBackground(new Color(215,252,252));
        c6.setFont(new Font("Raleway",Font.BOLD,16));
        c6.setBounds(350,600,200,30);
        add(c6);

        JCheckBox c7 = new JCheckBox("I declare that the above entered details are correct to the best of my knowledge",true);
        // the TRUE in the check box will make sure that the chchbx will be checked always
        c7.setBackground(new Color(215,252,252));
        c7.setFont(new Font("Raleway",Font.BOLD,16));
        c7.setBounds(100,650,700,20);
        add(c7);

        JLabel l12 = new JLabel("Form N0:-");
        l12.setFont(new Font("Raleway",Font.BOLD,14));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13 = new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,14));
        l13.setBounds(760,10,100,30);
        add(l13);

        s = new JButton("Submit");
        s.setFont(new Font("Raleway",Font.BOLD,14));
        s.setBackground(Color.black);
        s.setForeground(Color.white);
        s.setBounds(250,700,100,30);
        s.addActionListener(this);
        add(s);

        c = new JButton("Cancel");
        c.setFont(new Font("Raleway",Font.BOLD,14));
        c.setBackground(Color.black);
        c.setForeground(Color.white);
        c.setBounds(420,700,100,30);
        c.addActionListener(this);
        add(c);



        setSize(850,800);
        setLayout(null);
        setLocation(400,20);
        setVisible(true);
        getContentPane().setBackground(new Color(215,252,252));
    }

    @Override
    public void actionPerformed(ActionEvent e) {
       String atype = null;
       if (r1.isSelected()){
           atype = "Saving Account";
       }else if(r2.isSelected()){
           atype = "Fixed Deposite Account";
       }else if(r3.isSelected()) {
           atype = "Curret Account";
       }else if(r2.isSelected()) {
           atype = "Recuring Deposite Account";
       }
       Random ran = new Random();  //this is taken to generate the random card number which should be taken very carefully
       long first7 = (ran.nextLong() % 90000000L) + 1409963000000000L;  //the number starting with 1409 will e the startng of the card number
       String cardno = ""+ Math.abs(first7);  //this is used generate he randm form no

       long first3 = (ran.nextLong() % 9000L)+ 1000L;
       String pin = "" + Math.abs(first3);  //this is ued to generate the random pin number

       String fac ="";
       if (c1.isSelected()){
           fac = "ATM Card";
       } else if (c2.isSelected()) {
           fac = "Internet Banking";
       } else if (c3.isSelected()) {
           fac = "Mobile Banking";
       } else if (c4.isSelected()) {
           fac = "Email Alerts";
       } else if (c5.isSelected()) {
           fac = "Cheque Book";
       } else if (c6.isSelected()) {
           fac = "E-Statement";
       }

       try{          //this try ad catch is usd to store input from the user
           if(e.getSource()==s){  //from here the work f submit button starts
               if(atype.equals("")){   //if our atype is  empty then
                   JOptionPane.showMessageDialog(null,"Fill all the fields");
               }else {
                   Con c1 = new Con();
                   String q1 = "insert into signup3 values('"+formno+"','"+atype+"','"+cardno+"','"+pin+"','"+fac+"')";
                   String q2 = "insert into login values('"+formno+"','"+cardno+"','"+pin+"')";
                   c1.statement.executeUpdate(q1);
                   c1.statement.executeUpdate(q2);
                   JOptionPane.showMessageDialog(null, "Card number:"+cardno+"\n Pin :" +pin);
                   setVisible(false);  //this whole part is for the submit button
                   new Deposit(pin); //here we have send the pin to the deposit class
               }
           } else if (e.getSource()==c) {
            System.exit(0);
           }

       }catch (Exception E){
           E.printStackTrace();
       }


    }

    public static void main(String[] args) {
        new Signup3("");
    }
}
