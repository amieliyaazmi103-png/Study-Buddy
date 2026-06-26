package view;

import javax.swing.*;
import java.awt.event.*;
import java.awt.Font;
public class WelcomeView extends JFrame {

    JButton btnLogin;
    JButton btnRegister;

    public WelcomeView() {

        setTitle("StudyBuddy");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("StudyBuddy");
        title.setBounds(125, 40, 135, 30);
        title.setFont(new Font("Arial", Font.BOLD, 22));
        add(title);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(125, 100, 120, 35);
        add(btnLogin);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(125, 150, 120, 35);
        add(btnRegister);

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new LoginView();
                dispose();
            }
        });

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new RegisterView();
                dispose();
            }
        });

        setVisible(true);
    }
}