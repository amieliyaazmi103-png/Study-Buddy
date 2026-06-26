package view;

import javax.swing.*;
import dao.TaskDAO;
import model.Task;

public class TaskView extends JFrame {

    JTextField txtTask;
    JTextField txtDeadline;
    JButton btnAdd;
    JButton btnBack;

    public TaskView() {

        setTitle("Task Management");
        setSize(400,300);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel lblTask = new JLabel("Task Name");
        lblTask.setBounds(30,50,100,25);
        add(lblTask);

        txtTask = new JTextField();
        txtTask.setBounds(140,50,180,25);
        add(txtTask);

        JLabel lblDeadline = new JLabel("Deadline");
        lblDeadline.setBounds(30,100,100,25);
        add(lblDeadline);

        txtDeadline = new JTextField();
        txtDeadline.setBounds(140,100,180,25);
        add(txtDeadline);

        btnAdd = new JButton("Add Task");
        btnAdd.setBounds(120,150,120,30);
        add(btnAdd);

        btnBack = new JButton("Back");
        btnBack.setBounds(120,200,120,30);
        add(btnBack);

        btnAdd.addActionListener(e -> {

            Task task = new Task();

            task.setGroupId(1);
            task.setAssignedUser(1);

            task.setTaskName(txtTask.getText());
            task.setDescription("Assignment Task");
            task.setDeadline(txtDeadline.getText());
            task.setStatus("Pending");

            TaskDAO dao = new TaskDAO();

            if(dao.addTask(task)) {

                JOptionPane.showMessageDialog(null,
                        "Task Added!");

                txtTask.setText("");
                txtDeadline.setText("");

            } else {

                JOptionPane.showMessageDialog(null,
                        "Failed!");
            }

        });

        btnBack.addActionListener(e -> {

            new DashboardView();
            dispose();

        });

        setVisible(true);
    }
}