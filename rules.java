
package quizapplication;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class rules extends JFrame implements ActionListener{
    String name;
    JButton start,back;
    
    rules(String name){
        this.name=name;
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading=new JLabel("WELCOME  "+name+" to the quiz for JAVA");
       
        heading.setBounds(150, 60, 700,45);
        heading.setFont(new Font("Sans-serif",Font.BOLD,30));
        heading.setForeground(new Color(78,24,20));
        add(heading);
        
        JLabel lim=new JLabel("Here are the rules for the quiz:");
        lim.setBounds(15,150,700,45);
        lim.setFont(new Font("Dialog",Font.PLAIN,26));
        lim.setForeground(new Color(100,74,90));
        add(lim);
        
        JLabel rule=new JLabel();
        rule.setBounds(20, 190, 700,350);
        rule.setFont(new Font("Times New Roman",Font.PLAIN,16));
        rule.setForeground(new Color(8,34,200));
        rule.setText(
             "<html>"+ 
                "1. There are total 10 questions, attempt each one of them." + "<br><br>" +
                "2. Each question consists of four option, select the correct answer." + "<br><br>" +
                "3. The answer should be submitted before the timer runs out." + "<br><br>" +
                "4. The score for the quiz will be generated  in the end." + "<br><br>" +
                "5. Select the right option and click next." + "<br><br>" +
                "6. There is a hint available for any one of the question." + "<br><br>" +
                "7. Read each question carefully, and answer wisely. GOOD LUCK!!" + "<br><br>" +
            "<html>"
        );
        add(rule);
        
        start=new JButton("Start");
        start.setBounds(470, 550, 150, 50);
        start.setForeground(Color.BLACK);
        start.setBackground(Color.LIGHT_GRAY);
        start.addActionListener(this);
        add(start);
       
        back=new JButton("Back");
        back.setBounds(250, 550, 150, 50);
        back.setForeground(Color.BLACK);
        back.setBackground(Color.LIGHT_GRAY);
        back.addActionListener(this);
        add(back); 
        setSize(1500,1000);
        setLocation(0,10);
        setVisible(true);
       
    }
   
    
    @Override
    public void actionPerformed(ActionEvent e){
        if(e.getSource()==start){
            
            setVisible(false);
            new quiz(name);
            
        }
        else{
            setVisible(false);
            new Login();
        }
         
     }
     public static void main(String[] args){
        new rules("User");
    }
}
