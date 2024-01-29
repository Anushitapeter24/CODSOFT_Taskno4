
package quizapplication;

import javax.swing.*;
import java.awt.*;


import java.awt.event.*;
public class Login extends JFrame implements ActionListener{
    JButton rules, Back;
    JTextField tfname;
    Login(){
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel image=new JLabel(i);
        image.setBounds(-10,-10,600,550);
        add(image);
        JLabel heading=new JLabel("The quiz begins here, Wish you all the best!");
        heading.setBounds(640, 60, 800,80);
        heading.setFont(new Font("Mongolian Baiti",Font.ITALIC,30));
        heading.setForeground(new Color(51,204,255));
        add(heading);
        
        JLabel name=new JLabel("Enter your name");
        name.setBounds(810,100,300,200);
        name.setFont(new Font("Times New Roman",Font.ITALIC,20));
        add(name);
       
        tfname=new JTextField();
        tfname.setBounds(735,250,300,25);
        tfname.setFont(new Font("Mongolian Baiti",Font.PLAIN,20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(735, 300, 150, 50);
        rules.addActionListener(this);
        add(rules);
       
        Back=new JButton("Back");
        Back.setBounds(890, 300, 150, 50);
        Back.addActionListener(this);
        add(Back);
        
        setSize(1500,1000);
        setLocation(0,10);
        setVisible(true);
    }
    public static void main(String[] args){
        new Login(){
            
        };
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==rules){
            String name=tfname.getText();
            setVisible(false);
            new rules(name);
        }
        else if(e.getSource()==Back){
            setVisible(false);
        }
        
    }
}
