package hospital.management;

import javax.swing.*;
import javax.swing.text.StyledEditorKit;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Login extends JFrame implements ActionListener {
    JTextField textField;
    JPasswordField passwordField;
    JButton b1,b2;

    Login(){
        // TITLE
        JLabel TITLE=new JLabel("HOSPITAL MANAGEMENT");
        TITLE.setBounds(30,10,300,30);
        TITLE.setFont(new Font("Tahoma",Font.BOLD,18));
        add(TITLE);

        JLabel name=new JLabel("Username");
        name.setBounds(38,75,150,30);
        name.setFont(new Font("Tahoma",Font.BOLD,18));
        add(name);
        //textfield username

        textField=new JTextField();
        textField.setBounds(150,80,150,20);
        textField.setFont(new Font("tamoha",Font.BOLD,15));
        add(textField);

        //passsword field

        JLabel pass=new JLabel("Password");
        pass.setBounds(40,115,150,30);
        pass.setFont(new Font("Tahoma",Font.BOLD,18));
        add(pass);

    //textfield passwpord

        passwordField =new JPasswordField();
        passwordField.setBounds(150,115,150,20);
        passwordField.setFont(new Font("tamoha",Font.PLAIN,18));
        add(passwordField);

        //imageicon add in login
        ImageIcon Icon=new ImageIcon(ClassLoader.getSystemResource("icon/login.png"));
        Image icon1=Icon.getImage().getScaledInstance(260,250,Image.SCALE_DEFAULT);
        ImageIcon icon2=new ImageIcon(icon1);
        JLabel Iconlabel=new JLabel(icon2);
        Iconlabel.setBounds(300,10,500,250);
        add(Iconlabel);
        //button 1
        b1 =new JButton("LOGIN");
        b1.setBounds(40,180,90,30);
        b1.setBackground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);

    //button 2
        b2 =new JButton("CANCEL");
        b2.setBounds(180,180,90,30);
        b2.setBackground(Color.WHITE);
        b2.addActionListener(this);

        add(b2);



    //frame setting
      getContentPane().setBackground(new Color(115,195,230));
        setSize(800,300);
        setLocation(500,250);
        setLayout(null);
        setVisible(true);


    }
    public static void main(String[] args) {
        new Login();
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource()==b1){
            try{
                Connect con=new Connect();
                String user=textField.getText();
                String pass=passwordField.getText();

                String query="select * from login where ID= '"+user+"' and PASS='"+pass+"";
            }
            catch (Exception E){
                E.printStackTrace();
            }
        }
        else {

        }
    }
}
