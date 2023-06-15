package bank_management_system;


import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Signup2 extends JFrame implements ActionListener {  //this jframe will take us to the next page whenever we click on next

    JComboBox comboBox,comboBox2,comboBox3,comboBox4,comboBox5;
    JTextField textPan,textAadhar;
    JRadioButton r1,r2,r3,r4;
    JButton next;
    String formno;

    Signup2(String formno){

        super("APPLICATION FORM");

        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("icon/bank.png"));
        Image i2 = i1.getImage().getScaledInstance(100,100, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(25,10,100,100);
        add(image);

        this.formno = formno;

        JLabel l1 = new JLabel("Page 2:-");
        l1.setFont(new Font("Raleway",Font.BOLD,22));
        l1.setBounds(300,20,600,40);
        add(l1);

        JLabel l2 = new JLabel("Additional Details");
        l2.setFont(new Font("Raleway",Font.BOLD,22));
        l2.setBounds(300,50,600,40);
        add(l2);

        JLabel l3 = new JLabel("Religion:");
        l3.setFont(new Font("Raleway",Font.BOLD,19));
        l3.setBounds(100,120,100,30);
        add(l3);

        String religion[] = {"Hindu","Muslim","Sikh","Christain","Others"};
        comboBox = new JComboBox(religion);
        comboBox.setBackground(new Color(252,208,76));
        comboBox.setBounds(350,120,320,30);
        comboBox.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox);

        JLabel l4 = new JLabel("Category:");
        l4.setFont(new Font("Raleway",Font.BOLD,19));
        l4.setBounds(100,170,100,30);
        add(l4);

        String category[] = {"General","OBC","SC","ST","Others"};
        comboBox2 = new JComboBox(category);
        comboBox2.setBackground(new Color(252,208,76));
        comboBox2.setBounds(350,170,320,30);
        comboBox2.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox2);

        JLabel l5 = new JLabel("Income:");
        l5.setFont(new Font("Raleway",Font.BOLD,19));
        l5.setBounds(100,220,100,30);
        add(l5);

        String income[] = {"Null","<1,50,000","<2,50,000","<5,00,000","more than 10,00,000"};
        comboBox3 = new JComboBox(income);
        comboBox3.setBackground(new Color(252,208,76));
        comboBox3.setBounds(350,220,320,30);
        comboBox3.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox3);

        JLabel l6 = new JLabel("Education:");
        l6.setFont(new Font("Raleway",Font.BOLD,19));
        l6.setBounds(100,270,150,30);
        add(l6);

        String education[] = {"Non-Graduate","Graduate","Post-Graduate","Doctrate","Others"};
        comboBox4 = new JComboBox(education);
        comboBox4.setBackground(new Color(252,208,76));
        comboBox4.setBounds(350,270,320,30);
        comboBox4.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox4);

        JLabel l7= new JLabel("Occupation:");
        l7.setFont(new Font("Raleway",Font.BOLD,19));
        l7.setBounds(100,320,150,30);
        add(l7);

        String occupation[] = {"Salaried","Self-Employeed","Business","Student","Retired","Others"};
        comboBox5 = new JComboBox(occupation);
        comboBox5.setBackground(new Color(252,208,76));
        comboBox5.setBounds(350,320,320,30);
        comboBox5.setFont(new Font("Raleway",Font.BOLD,14));
        add(comboBox5);

        JLabel l8= new JLabel("PAN Number:");
        l8.setFont(new Font("Raleway",Font.BOLD,19));
        l8.setBounds(100,370,150,30);
        add(l8);

        textPan = new JTextField();
        textPan.setBounds(350,370,320,30);
        textPan.setFont(new Font("Raleway",Font.BOLD,18));
        add(textPan);

        JLabel l9= new JLabel("Aadhar Number:");
        l9.setFont(new Font("Raleway",Font.BOLD,19));
        l9.setBounds(100,420,190,30);
        add(l9);

        textAadhar = new JTextField();
        textAadhar.setBounds(350,420,320,30);
        textAadhar.setFont(new Font("Raleway",Font.BOLD,18));
        add(textAadhar);

        JLabel l10= new JLabel("Senior Citizen:");
        l10.setFont(new Font("Raleway",Font.BOLD,19));
        l10.setBounds(100,470,190,30);
        add(l10);

        r1 = new JRadioButton("Yes");
        r1.setBackground(new Color(252,208,76));
        r1.setFont(new Font("Raleway",Font.BOLD,19));
        r1.setBounds(350,470,100,30);
        add(r1);

        r2 = new JRadioButton("No");
        r2.setBackground(new Color(252,208,76));
        r2.setFont(new Font("Raleway",Font.BOLD,19));
        r2.setBounds(450,470,100,30);
        add(r2);

        ButtonGroup buttonGroup = new ButtonGroup();  //this is used to select only one radio button at a time
        buttonGroup.add(r1);
        buttonGroup.add(r2);

        JLabel l11= new JLabel("Existing Acc:");
        l11.setFont(new Font("Raleway",Font.BOLD,19));
        l11.setBounds(100,520,190,30);
        add(l11);

        r3 = new JRadioButton("Yes");
        r3.setBackground(new Color(252,208,76));
        r3.setFont(new Font("Raleway",Font.BOLD,19));
        r3.setBounds(350,520,100,30);
        add(r3);

        r4 = new JRadioButton("No");
        r4.setBackground(new Color(252,208,76));
        r4.setFont(new Font("Raleway",Font.BOLD,19));
        r4.setBounds(450,520,100,30);
        add(r4);

        ButtonGroup buttonGroup2 = new ButtonGroup();  //this is used to select only one radio button at a time
        buttonGroup2.add(r3);
        buttonGroup2.add(r4);

        JLabel l12= new JLabel("Form no:");
        l12.setFont(new Font("Raleway",Font.BOLD,19));
        l12.setBounds(650,10,100,30);
        add(l12);

        JLabel l13= new JLabel(formno);
        l13.setFont(new Font("Raleway",Font.BOLD,19));
        l13.setBounds(760,10,100,30);
        add(l13);

        next = new JButton("Next");
        next.setFont(new Font("Raleway",Font.BOLD,13));
        next.setBounds(570,640,100,30);
        next.setBackground(Color.WHITE);
        next.setForeground(Color.black);
        next.addActionListener(this);
        add(next);




        setSize(850,750);
        setLocation(450,80);
        setLayout(null);
        setVisible(true);
        getContentPane().setBackground(new Color(252,208,76));
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        String rel = (String)comboBox.getSelectedItem();
        String cate  = (String)comboBox2.getSelectedItem();
        String inc = (String)comboBox3.getSelectedItem();
        String edu = (String)comboBox4.getSelectedItem();
        String occ = (String)comboBox5.getSelectedItem();

        String pan = textPan.getText();
        String aadhar = textAadhar.getText();
        String scitizen = null;  //or the value can be taken as ""
        if ((r1.isSelected())){
            scitizen = "Yes";
        }else if (r2.isSelected()){
            scitizen = "No";
        }
          String eAccount = null;
        if((r3.isSelected())){
            eAccount = "Yes";
        }else if (r4.isSelected()){
            eAccount = "No";
        }

        try{
        //here we have made an assumption or we have made the pan and addhr filling compulsory for the user to go to the next page
            if (textPan.getText().equals("") || textAadhar.getText().equals("")){  //this s made if the value f pan adhar is null
                JOptionPane.showMessageDialog(null,"Fill all the fields");
            }else{
                Con c1 = new Con();
                String q = "insert into signup2 values('"+formno+"','"+rel+"','"+cate+"','"+inc+"','"+edu+"','"+occ+"','"+pan+"','"+aadhar+"','"+scitizen+"','"+eAccount+"')";
                c1.statement.executeUpdate(q);  //executeUpdate is used to insert any data in the table
                new Signup3(formno);
                setVisible(false);
            }

        }catch (Exception E){
            E.printStackTrace();
        }
    }

    public static void main(String[] args) {
        new Signup2("");    //here the constructor Signup is being called here
    }
}
