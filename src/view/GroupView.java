package view;

import dao.GroupDAO;
import model.Group;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;

import java.time.LocalDate;
import java.util.List;

public class GroupView extends JFrame {

    JTable table;
    DefaultTableModel model;

    JButton btnAdd;
    JButton btnEdit;
    JButton btnDelete;
    JButton btnBack;
    JButton btnOpen;

    public GroupView() {

        setTitle("My Groups");
        setSize(700,450);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title =
                new JLabel("MY GROUPS");

        title.setBounds(300,20,200,30);
        add(title);

        model = new DefaultTableModel();

        model.addColumn("ID");
        model.addColumn("Group Name");
        model.addColumn("Created Date");

        table = new JTable(model);

        JScrollPane scroll =
                new JScrollPane(table);

        scroll.setBounds(30,60,620,220);

        add(scroll);
        
        btnOpen = new JButton("Open Group");
        btnOpen.setBounds(30, 320, 120, 30);
        add(btnOpen);

        btnAdd = new JButton("Add Group");
        btnAdd.setBounds(30,360,120,30);
        add(btnAdd);

        btnEdit = new JButton("Edit");
        btnEdit.setBounds(180,320,120,30);
        add(btnEdit);

        btnDelete = new JButton("Delete");
        btnDelete.setBounds(180,360,120,30);
        add(btnDelete);

        btnBack = new JButton("Back");
        btnBack.setBounds(330,320,120,30);
        add(btnBack);
        
        

        loadGroups();
        
        btnOpen.addActionListener(e -> {

            int row = table.getSelectedRow();

            if(row == -1) {

                JOptionPane.showMessageDialog(null,
                        "Select a group first");

                return;
            }

            int groupId =
                    (int) model.getValueAt(row, 0);

            String groupName =
                    model.getValueAt(row,1).toString();

            new GroupDetailsView(
                    groupId,
                    groupName);

            dispose();

        });

        btnAdd.addActionListener(e -> {

            String groupName =
                    JOptionPane.showInputDialog(
                            "Enter Group Name");

            if(groupName != null &&
                    !groupName.isEmpty()) {

                Group group = new Group();

                group.setGroupName(groupName);

                group.setCreatedDate(
                        LocalDate.now().toString());

                GroupDAO dao =
                        new GroupDAO();

                dao.addGroup(group);

                loadGroups();
            }
        });
        
        btnEdit.addActionListener(e -> {

            int row = table.getSelectedRow();

            if(row == -1) {

                JOptionPane.showMessageDialog(null,
                        "Select a group first");
                return;
            }

            int id = (int) model.getValueAt(row, 0);

            String currentName =
                    model.getValueAt(row,1).toString();

            String newName =
                    JOptionPane.showInputDialog(
                            "Edit Group Name",
                            currentName);

            if(newName != null &&
                    !newName.trim().isEmpty()) {

                GroupDAO dao = new GroupDAO();

                dao.updateGroup(id,newName);

                loadGroups();
            }
        });
        
        btnDelete.addActionListener(e -> {

            int row = table.getSelectedRow();

            if(row == -1) {

                JOptionPane.showMessageDialog(null,
                        "Select a group first");
                return;
            }

            int id = (int) model.getValueAt(row,0);

            int confirm =
                    JOptionPane.showConfirmDialog(
                            null,
                            "Delete this group?");

            if(confirm == JOptionPane.YES_OPTION) {

                GroupDAO dao = new GroupDAO();

                dao.softDeleteGroup(id);

                loadGroups();
            }
        });

        btnBack.addActionListener(e -> {

            new DashboardView();
            dispose();

        });

        setVisible(true);
    }

    private void loadGroups() {

        model.setRowCount(0);

        GroupDAO dao = new GroupDAO();

        List<Group> groups =
                dao.getAllGroups();

        for(Group g : groups) {

            model.addRow(new Object[] {

                    g.getGroupId(),
                    g.getGroupName(),
                    g.getCreatedDate()

            });
        }
    }
}