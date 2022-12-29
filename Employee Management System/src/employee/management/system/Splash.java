
package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
public class Splash extends JFrame implements ActionListener{
    Splash()
    {
        super("Starting ..................................................................");
        getContentPane().setBackground(Color.decode("#A1C45A"));
        setLayout(null);
        
        JLabel heading = new JLabel("EMPLOYEE MANAGEMENT SYSTEM");
        heading.setBounds(80, 30, 1200, 50);
        heading.setFont(new Font("serif", Font.PLAIN, 60));
        heading.setForeground(Color.DARK_GRAY);
        add(heading);
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons\\front.jpg"));
        Image i2 = i1.getImage().getScaledInstance(1100, 700, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(50, 100, 1050, 500);
        add(image);
        
        JButton clickhere = new JButton("CLICK HERE TO CONTINUE");
        clickhere.setBounds(400, 400, 200, 40);
        clickhere.setBackground(Color.decode("#A1C45A"));
        clickhere.setForeground(Color.BLACK);
        clickhere.addActionListener(this);
        image.add(clickhere);
        
        
        setSize(1170, 650);
        setLocation(100, 30);
        setVisible(true);
        
        while(true) {
            heading.setVisible(false);
            try {
                Thread.sleep(600);
            } catch (Exception e){
                
            }
            
            heading.setVisible(true);
            try {
                Thread.sleep(600);
            } catch (Exception e){
                
            }
        }
    }
    public void actionPerformed(ActionEvent ae) {
        setVisible(false);
        new Login();
    }
    public static void main(String args[])
    {
        new Splash();
    }
}
