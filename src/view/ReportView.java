package view;

import dao.GroupDAO;
import model.Group;
import dao.TaskDAO;
import model.Task;
import java.util.List;
import java.io.FileOutputStream;
import com.itextpdf.text.Document;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
import javax.swing.*;
import java.util.List;

public class ReportView extends JFrame {

    private JComboBox<Group> groupCombo;

    public ReportView() {

        setTitle("StudyBuddy Reports");
        setSize(450,320);
        setLocationRelativeTo(null);
        setLayout(null);

        JLabel title = new JLabel("StudyBuddy Reports");
        
        title.setBounds(130,20,200,30);
        add(title);

        JLabel lblGroup = new JLabel("Select Group");
        lblGroup.setBounds(50,70,100,25);
        add(lblGroup);

        groupCombo = new JComboBox<>();
        groupCombo.setBounds(150,70,200,25);
        add(groupCombo);

        loadGroups();

        JButton btnPDF = new JButton("Export PDF");
        btnPDF.setBounds(120,120,180,35);
        add(btnPDF);
        btnPDF.addActionListener(e -> {

            try {

                Group selectedGroup = (Group) groupCombo.getSelectedItem();

                if(selectedGroup == null){
                    JOptionPane.showMessageDialog(null,"Please select a group.");
                    return;
                }

                Document document = new Document();

                PdfWriter.getInstance(document,
                        new FileOutputStream(selectedGroup.getGroupName() + "_Report.pdf"));

                document.open();

                document.add(new Paragraph("StudyBuddy Report"));
                document.add(new Paragraph(" "));
                document.add(new Paragraph("Group : " + selectedGroup.getGroupName()));
                document.add(new Paragraph(" "));

                TaskDAO dao = new TaskDAO();

                List<Task> tasks =
                        dao.getTasksByGroup(selectedGroup.getGroupId());

                for(Task t : tasks){

                    document.add(new Paragraph("Task : " + t.getTaskName()));
                    document.add(new Paragraph("Assigned To : " + t.getAssignedUserName()));
                    document.add(new Paragraph("Deadline : " + t.getDeadline()));
                    document.add(new Paragraph("Status : " + t.getStatus()));
                    document.add(new Paragraph("----------------------------------"));

                }

                document.add(new Paragraph(" "));
                document.add(new Paragraph("Overall Progress : "
                        + dao.getProgress(selectedGroup.getGroupId()) + "%"));

                document.add(new Paragraph("Deadline Risk : "
                        + dao.getDeadlineRisk(selectedGroup.getGroupId())));

                document.close();

                JOptionPane.showMessageDialog(null,
                        "PDF exported successfully!");

            } catch (Exception ex) {

                ex.printStackTrace();

                JOptionPane.showMessageDialog(null,
                        "Failed to export PDF.");

            }

        });
        JButton btnBack = new JButton("Back");
        btnBack.setBounds(120,170,180,35);
        add(btnBack);


        btnBack.addActionListener(e -> {

            new DashboardView();
            dispose();

        });

        setVisible(true);
    }

    private void loadGroups(){

        GroupDAO dao = new GroupDAO();

        List<Group> groups = dao.getAllGroups();

        for(Group g : groups){

            groupCombo.addItem(g);

        }

    }

}