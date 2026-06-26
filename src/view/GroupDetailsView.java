package view;
import dao.TaskDAO;
import model.Task;
import javax.swing.table.DefaultTableModel;
import java.util.List;
import javax.swing.*;
import dao.UserDAO;

public class GroupDetailsView extends JFrame {

    private int groupId;
    private DefaultTableModel model;
    private String groupName;
    private void loadTasks(
    		
    		
            DefaultTableModel model) {

        model.setRowCount(0);

        TaskDAO dao = new TaskDAO();

        List<Task> tasks =
                dao.getTasksByGroup(groupId);

        for(Task t : tasks) {

            model.addRow(new Object[] {

                    t.getTaskId(),
                    t.getTaskName(),
                    t.getAssignedUserName(),
                    t.getDeadline(),
                    t.getStatus()

            });
        }
    }

    public GroupDetailsView(
            int groupId,
            String groupName) {

        this.groupId = groupId;
        this.groupName = groupName;

        setTitle("Group Details");
        setSize(800,500);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title =
                new JLabel(
                        "Group : " + groupName);

        title.setBounds(30,20,300,30);
        add(title);


        JLabel lblSearch =
                new JLabel("Search Task:");

        lblSearch.setBounds(30,60,100,25);
        add(lblSearch);

        JTextField txtSearch =
                new JTextField();

        txtSearch.setBounds(130,60,180,25);
        add(txtSearch);

        JButton btnSearch =
                new JButton("Search");

        btnSearch.setBounds(320,60,100,25);
        add(btnSearch);
        
        btnSearch.addActionListener(e -> {

            if(txtSearch.getText().trim().isEmpty()){

                loadTasks(model);
                return;

            }

            model.setRowCount(0);

            TaskDAO dao = new TaskDAO();

            List<Task> tasks =
                    dao.searchTasks(groupId, txtSearch.getText());

            for(Task t : tasks){

                model.addRow(new Object[]{

                        t.getTaskId(),
                        t.getTaskName(),
                        t.getAssignedUserName(),
                        t.getDeadline(),
                        t.getStatus()

                });

            }

        });
        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Task Name");
        model.addColumn("Assigned User");
        model.addColumn("Deadline");
        model.addColumn("Status");
        
        loadTasks(model);

        JTable taskTable =
                new JTable(model);

        JScrollPane taskScroll =
                new JScrollPane(taskTable);

        taskScroll.setBounds(
                30,100,730,190);

        add(taskScroll);

        JButton btnAdd =
                new JButton("Add Task");

        btnAdd.setBounds(
                30,320,120,30);

        add(btnAdd);
        
        btnAdd.addActionListener(e -> {

            JTextField taskField =
                    new JTextField();

            UserDAO userDAO =
                    new UserDAO();

            JComboBox<String> userCombo =
                    new JComboBox<>();

            for(String user :
                    userDAO.getAllUserNames()) {

                userCombo.addItem(user);
            }

            JTextField deadlineField =
                    new JTextField();

            Object[] fields = {

                    "Task Name", taskField,
                    "Assigned To", userCombo,
                    "Deadline (DD/MM/YYYY)", deadlineField
            };

            int result =
                    JOptionPane.showConfirmDialog(
                            null,
                            fields,
                            "Add Task",
                            JOptionPane.OK_CANCEL_OPTION);

            if(result == JOptionPane.OK_OPTION) {

                Task task = new Task();

                task.setGroupId(groupId);

                String selectedUser =
                        userCombo
                        .getSelectedItem()
                        .toString();

                int userId =
                        userDAO
                        .getUserIdByName(
                                selectedUser);

                task.setAssignedUser(userId);

                task.setTaskName(
                        taskField.getText());

                task.setDescription(
                        "Assignment Task");

                String inputDate = deadlineField.getText();

                String[] parts = inputDate.split("/");

                String mysqlDate =
                        parts[2] + "-" +
                        parts[1] + "-" +
                        parts[0];

                task.setDeadline(mysqlDate);

                task.setStatus("Pending");

                TaskDAO dao = new TaskDAO();

                dao.addTask(task);

                loadTasks(model);
            }
        });

        JButton btnEdit =
                new JButton("Edit Task");

        btnEdit.setBounds(
                170,320,120,30);

        add(btnEdit);
        
        btnEdit.addActionListener(e -> {

            int row = taskTable.getSelectedRow();

            if(row == -1){

                JOptionPane.showMessageDialog(null,
                        "Please select a task.");

                return;
            }

            int taskId =
                    (int) model.getValueAt(row,0);

            String currentTask =
                    model.getValueAt(row,1).toString();

            String currentDeadline =
                    model.getValueAt(row,3).toString();

            JTextField txtTask =
                    new JTextField(currentTask);

            JTextField txtDescription =
                    new JTextField();

            JTextField txtDeadline =
                    new JTextField(currentDeadline);

            Object[] fields = {

                    "Task Name", txtTask,
                    "Description", txtDescription,
                    "Deadline", txtDeadline

            };

            int option =
                    JOptionPane.showConfirmDialog(
                            null,
                            fields,
                            "Edit Task",
                            JOptionPane.OK_CANCEL_OPTION);

            if(option == JOptionPane.OK_OPTION){

                TaskDAO dao =
                        new TaskDAO();

                dao.updateTask(

                        taskId,
                        txtTask.getText(),
                        txtDescription.getText(),
                        txtDeadline.getText()

                );

                loadTasks(model);

            }

        });

        JButton btnComplete =
                new JButton("Mark Complete");

        btnComplete.setBounds(
                310,320,150,30);

        add(btnComplete);
        
        btnComplete.addActionListener(e -> {

            int row = taskTable.getSelectedRow();

            if(row == -1){

                JOptionPane.showMessageDialog(null,
                        "Please select a task.");

                return;
            }

            int taskId = (int) model.getValueAt(row,0);

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Mark this task as Completed?",
                    "Confirmation",
                    JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                TaskDAO dao = new TaskDAO();

                if(dao.markComplete(taskId)){

                    JOptionPane.showMessageDialog(null,
                            "Task marked as Completed!");

                    loadTasks(model);

                }else{

                    JOptionPane.showMessageDialog(null,
                            "Failed to update task.");
                }
            }

        });

        JButton btnDelete =
                new JButton("Delete Task");

        btnDelete.setBounds(
                480,320,120,30);

        add(btnDelete);
        
        btnDelete.addActionListener(e -> {

            int row = taskTable.getSelectedRow();

            if(row == -1){

                JOptionPane.showMessageDialog(null,
                        "Please select a task.");

                return;
            }

            int taskId = (int) model.getValueAt(row,0);

            int confirm = JOptionPane.showConfirmDialog(
                    null,
                    "Are you sure you want to delete this task?",
                    "Delete Task",
                    JOptionPane.YES_NO_OPTION);

            if(confirm == JOptionPane.YES_OPTION){

                TaskDAO dao = new TaskDAO();

                if(dao.softDeleteTask(taskId)){

                    JOptionPane.showMessageDialog(null,
                            "Task deleted successfully!");

                    loadTasks(model);

                }else{

                    JOptionPane.showMessageDialog(null,
                            "Failed to delete task.");

                }

            }

        });

        JButton btnAnalytics =
                new JButton("Analytics");

        btnAnalytics.setBounds(
        		620,320,120,30);

        add(btnAnalytics);
        
        btnAnalytics.addActionListener(e -> {

            new AnalyticsView(groupId,groupName);

            dispose();

        });

        JButton btnBack =
                new JButton("Back");

        btnBack.setBounds(
        		310,370,120,30);

        add(btnBack);

        btnBack.addActionListener(e -> {

            new GroupView();

            dispose();
            
            

        });
        

        setVisible(true);
    }
    
    
}