
package quizapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements  ActionListener{
     Score(String name, int score) {
        setBounds(0, 10, 1500, 1000);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(20, 100, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thankyou " + name + " for participating.");
        heading.setBounds(320, 30, 700, 90);
        heading.setFont(new Font("Tahoma", Font.BOLD, 35));
        add(heading);
        JLabel h2 = new JLabel(" Hope this quiz was informative.");
        h2.setForeground(Color.BLUE);
        h2.setBounds(400, 90, 700, 90);
        h2.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(h2);
        
        JLabel lblscore = new JLabel("Your score is " + score+".");
        lblscore.setBounds(520, 200, 300, 50);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 30));
        add(lblscore);
        
        JButton submit = new JButton("Play Again");
        submit.setFont(new Font("Dialog", Font.PLAIN, 25));
        submit.setBounds(510, 270, 250, 50);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.BLACK);
        submit.addActionListener(this);
        add(submit);
        
        setVisible(true);
    }
     @Override
     public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}
