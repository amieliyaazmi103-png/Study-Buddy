package view;

import dao.UserDAO;
import javax.swing.*;
import java.awt.event.*;

public class LoginView extends JFrame {

    JLabel lblEmail, lblPassword;
    JTextField txtEmail;
    JPasswordField txtPassword;
    JButton btnLogin;
    JButton btnBack;

    public LoginView() {

        setTitle("StudyBuddy Login");
        setSize(350, 250);
        setLayout(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(30, 40, 80, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(120, 40, 150, 25);
        add(txtEmail);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(30, 80, 80, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(120, 80, 150, 25);
        add(txtPassword);

        btnLogin = new JButton("Login");
        btnLogin.setBounds(120, 130, 100, 30);
        add(btnLogin);
        
        btnBack = new JButton("Back");
        btnBack.setBounds(120, 170, 100, 30);
        add(btnBack);
        
        btnBack.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new WelcomeView();
                dispose();
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                String email = txtEmail.getText();
                String password = String.valueOf(txtPassword.getPassword());

                UserDAO dao = new UserDAO();

                if(dao.login(email, password)) {

                    JOptionPane.showMessageDialog(null,
                            "Login Successful!");

                    new DashboardView();

                    dispose();

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Invalid Email or Password");
                }
            }
        });

        setVisible(true);
    }
}