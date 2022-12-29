package employee.management.system;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Home extends JFrame implements ActionListener {

    JButton view, add, update, remove;

    Home() {
        super("Home Page");
        setLayout(null);

        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("icons/home.jpg"));
        //Image i2 = i1.getImage().getScaledInstance(1120, 630, Image.SCALE_DEFAULT);
        Image i2 = i1.getImage().getScaledInstance(800, 550, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        //image.setBounds(0, 0, 1120, 630);
        image.setBounds(0, 0, 800, 550);
        add(image);

//        JLabel heading = new JLabel("Employee Management System");
//        heading.setBounds(620, 20, 400, 40);
//        heading.setFont(new Font("Raleway", Font.BOLD, 25));
//        image.add(heading);
        add = new JButton("Add Employee");
//      add.setBounds(650, 80, 150, 40);
        add.setBounds(70, 450, 140, 30);
        add.addActionListener(this);
        add.setBackground(Color.decode("#A1C45A"));
        image.add(add);

        view = new JButton("View Employees");
        view.setBounds(240, 450, 140, 30);
        view.addActionListener(this);
        view.setBackground(Color.decode("#A1C45A"));
        image.add(view);

        update = new JButton("Update Employee");
        update.setBounds(410, 450, 140, 30);
        update.addActionListener(this);
        update.setBackground(Color.decode("#A1C45A"));
        image.add(update);

        remove = new JButton("Remove Employee");
        remove.setBounds(580, 450, 140, 30);
        remove.addActionListener(this);
        remove.setBackground(Color.decode("#A1C45A"));
        image.add(remove);

        //setSize(1120, 630);
        setSize(800, 550);
        setLocation(280, 100);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == add) {
            setVisible(false);
            new AddEmployee();
        } else if (ae.getSource() == view) {
            setVisible(false);
            new ViewEmployee();
        } else if (ae.getSource() == update) {
            setVisible(false);
            new ViewEmployee();
        } else {
            setVisible(false);
            new RemoveEmployee();
        }
    }

    public static void main(String[] args) {
        new Home();
    }
}
