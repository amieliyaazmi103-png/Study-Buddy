package view;

import dao.UserDAO;
import model.User;

import javax.swing.*;
import java.awt.event.*;

public class RegisterView extends JFrame {

    JLabel lblName, lblEmail, lblPassword;
    JTextField txtName, txtEmail;
    JPasswordField txtPassword;
    JButton btnRegister, btnLogin;

    public RegisterView() {

        setTitle("StudyBuddy Register");
        setSize(400, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(null);

        lblName = new JLabel("Name:");
        lblName.setBounds(50, 50, 100, 25);
        add(lblName);

        txtName = new JTextField();
        txtName.setBounds(150, 50, 180, 25);
        add(txtName);

        lblEmail = new JLabel("Email:");
        lblEmail.setBounds(50, 100, 100, 25);
        add(lblEmail);

        txtEmail = new JTextField();
        txtEmail.setBounds(150, 100, 180, 25);
        add(txtEmail);

        lblPassword = new JLabel("Password:");
        lblPassword.setBounds(50, 150, 100, 25);
        add(lblPassword);

        txtPassword = new JPasswordField();
        txtPassword.setBounds(150, 150, 180, 25);
        add(txtPassword);

        btnRegister = new JButton("Register");
        btnRegister.setBounds(130, 210, 120, 35);
        add(btnRegister);

        btnLogin = new JButton("Already have an account?");
        btnLogin.setBounds(95, 260, 200, 25);
        add(btnLogin);

        btnRegister.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                User user = new User();

                user.setName(txtName.getText());
                user.setEmail(txtEmail.getText());
                user.setPassword(
                        String.valueOf(txtPassword.getPassword()));

                UserDAO dao = new UserDAO();

                if (dao.addUser(user)) {

                    JOptionPane.showMessageDialog(null,
                            "Registration Successful!");

                    new LoginView();
                    dispose();

                } else {

                    JOptionPane.showMessageDialog(null,
                            "Registration Failed!");
                }
            }
        });

        btnLogin.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                new LoginView();
                dispose();
            }
        });

        setVisible(true);
    }
}