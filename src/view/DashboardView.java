package view;

import javax.swing.*;
import java.awt.Font;
public class DashboardView extends JFrame {

    public DashboardView() {

        setTitle("StudyBuddy Dashboard");
        setSize(500, 380);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("Welcome to StudyBuddy");
        title.setBounds(175, 30, 250, 30);
       
        add(title);

        JButton btnGroups = new JButton("My Groups");
        btnGroups.setBounds(150, 90, 180, 30);
        add(btnGroups);

       
        JButton btnReport = new JButton("Reports");
        btnReport.setBounds(150, 140, 180, 30);
        add(btnReport);

        JButton btnLogout = new JButton("Logout");
        btnLogout.setBounds(150, 190, 180, 30);
        add(btnLogout);

        
        btnGroups.addActionListener(e -> {

            new GroupView();
            dispose();

        });
       
       
       
        btnReport.addActionListener(e -> {

            new ReportView();

            dispose();

        });

      
        btnLogout.addActionListener(e -> {

            new WelcomeView();
            dispose();

        });

        setVisible(true);
    }
}