package view;

import javax.swing.*;
import java.util.Map;
import javax.swing.JTextArea;
import javax.swing.JScrollPane;

import dao.TaskDAO;

public class AnalyticsView extends JFrame {

    public AnalyticsView(int groupId,String groupName){

        setTitle("Analytics");

        setSize(550,500);

        setLocationRelativeTo(null);

        setLayout(null);

        JLabel title =
                new JLabel("Analytics - " + groupName);

        title.setBounds(140,20,250,30);

        add(title);

        TaskDAO dao =
                new TaskDAO();

        int progress =
                dao.getProgress(groupId);
        

        JLabel lblProgress =
                new JLabel("Overall Progress :");

        lblProgress.setBounds(50,80,150,30);

        add(lblProgress);

        JLabel percent =
                new JLabel(progress + "%");

        percent.setBounds(220,80,100,30);

        add(percent);
        
        JLabel lblContribution =
                new JLabel("Contribution Score");

        lblContribution.setBounds(50,130,180,30);

        add(lblContribution);

        JTextArea txtContribution =
                new JTextArea();

        txtContribution.setEditable(false);

        JScrollPane scroll =
                new JScrollPane(txtContribution);

        scroll.setBounds(50,170,380,120);

        add(scroll);
        Map<String,Integer> contribution =
                dao.getContributionScore(groupId);

        for(String name : contribution.keySet()){

            txtContribution.append(
                    name + " : "
                    + contribution.get(name)
                    + " completed task(s)\n");

        }
        
        JLabel lblRisk =
                new JLabel("Deadline Risk");

        lblRisk.setBounds(50,300,150,30);

        add(lblRisk);

        String risk =
                dao.getDeadlineRisk(groupId);

        JLabel lblRiskResult =
                new JLabel(risk);

        lblRiskResult.setBounds(220,300,100,30);

        add(lblRiskResult);
        JButton btnBack =
                new JButton("Back");

        btnBack.setBounds(200,370,100,30);

        add(btnBack);

        btnBack.addActionListener(e->{

            new GroupDetailsView(groupId,groupName);

            dispose();

        });

        setVisible(true);

    }

}