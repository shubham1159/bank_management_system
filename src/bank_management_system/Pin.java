package bank_management_system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Pin extends JFrame implements ActionListener {

    JButton b1,b2;
    JPasswordField p1,p2;

    String pin;
    Pin(String pin){ //here pin has been received
        this.pin = pin;

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icon/atm2.png"));
        Image i2 = i1.getImage().getScaledInstance(1500,830, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel l3 = new JLabel(i3);
        l3.setBounds(0,0,1550,830);
        add(l3);

        JLabel label1 = new JLabel("CHANGE YOUR PIN");
        label1.setFont(new Font("Raleway",Font.BOLD,16));
        label1.setBounds(430,180,400,35);
        label1.setForeground(Color.WHITE);
        l3.add(label1);  //this is used here because we have to print our label on an image so here only add() will not work

        JLabel label2 = new JLabel("New PIN:");
        label2.setFont(new Font("Raleway",Font.BOLD,16));
        label2.setBounds(430,220,150,35);
        label2.setForeground(Color.WHITE);
        l3.add(label2);  //this is used here because we have to print our label on an image so here only add() will not work

        p1 = new JPasswordField();
        p1.setBackground(new Color(65,125,128));
        p1.setForeground(Color.WHITE);
        p1.setBounds(600,220,180,25);
        p1.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p1);

        JLabel label3 = new JLabel("Re-Enter New PIN:");
        label3.setFont(new Font("Raleway",Font.BOLD,16));
        label3.setBounds(430,250,400,35);
        label3.setForeground(Color.WHITE);
        l3.add(label3);  //this is used here because we have to print our label on an image so here only add() will not work

        p2 = new JPasswordField();
        p2.setBackground(new Color(65,125,128));
        p2.setForeground(Color.WHITE);
        p2.setBounds(600,255,180,25);
        p2.setFont(new Font("Raleway",Font.BOLD,22));
        l3.add(p2);






        b1 = new JButton("CHANGE");
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
        setLayout(null);
        setLocation(0,0);
        setVisible(true);  //by default the visibility of the frame is null it won't be visible to us so we have to define the visibility here
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if (e.getSource()==b2) {
            setVisible(false);
            new main_class(pin);
        }


            try{

            String pin1 = p1.getText();
            String pin2 = p2.getText();

            if (!pin1.equals(pin2)){  //when the p1 and p2 does not match
                JOptionPane.showMessageDialog(null,"Entered PIN does not match");
                return;
            }
            if (e.getSource()==b1) {
                if (p1.getText().equals("")) {
                    JOptionPane.showMessageDialog(null, "Enter New PIN");
                    return;
                }

                if (p2.getText().equals("")) {
                    JOptionPane.showMessageDialog(null,"Re-Enter New PIN");
                    return;
                }
                Con c = new Con();
                String q1 ="update bank set pin = '"+pin1+"' where pin = '"+pin+"'";  //we will set the new value of pin to the table where pin matches with the pin in the table
                String q2 ="update login set pin = '"+pin1+"' where pin = '"+pin+"'";
                String q3 ="update signup3 set pin = '"+pin1+"' where pin = '"+pin+"'";  //we have stored our pin in three different columns namely above so we have to update it in all he three columns

                c.statement.executeUpdate(q1);
                c.statement.executeUpdate(q2);
                c.statement.executeUpdate(q3);

                JOptionPane.showMessageDialog(null,"PIN changed successfully");
                setVisible(false);  //the dialog box will be removed here and the main screen ill e visible to us
                new main_class(pin);
            }

        }catch (Exception E){
            E.printStackTrace();
        }

    }

    public static void main(String[] args) {
      new Pin("");
    }

}
