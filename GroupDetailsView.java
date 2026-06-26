package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Task;
import java.util.LinkedHashMap;
import java.util.Map;
public class TaskDAO {

    public boolean addTask(Task task) {

        String sql =
        "INSERT INTO tasks(group_id, assigned_user, task_name, description, deadline, status) VALUES(?,?,?,?,?,?)";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, task.getGroupId());
            ps.setInt(2, task.getAssignedUser());
            ps.setString(3, task.getTaskName());
            ps.setString(4, task.getDescription());
            ps.setString(5, task.getDeadline());
            ps.setString(6, task.getStatus());

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    
    public List<Task> getAllTasks() {

        List<Task> tasks = new ArrayList<>();

        String sql =
        "SELECT * FROM tasks WHERE is_deleted=FALSE";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ){

            while(rs.next()) {

                Task task = new Task();

                task.setTaskId(rs.getInt("task_id"));
                task.setTaskName(rs.getString("task_name"));
                task.setDeadline(rs.getString("deadline"));
                task.setStatus(rs.getString("status"));

                tasks.add(task);
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return tasks;
    }
    
    public boolean updateTask(int id,
            String taskName,
            String deadline) {

String sql =
"UPDATE tasks SET task_name=?, deadline=? WHERE task_id=?";

try(
Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)
){

ps.setString(1, taskName);
ps.setString(2, deadline);
ps.setInt(3, id);

return ps.executeUpdate() > 0;

} catch(Exception e){
e.printStackTrace();
}

return false;
}
    
    public boolean markComplete(int id) {

        String sql =
        "UPDATE tasks SET status='Completed' WHERE task_id=?";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    public boolean softDeleteTask(int id) {

        String sql =
        "UPDATE tasks SET is_deleted=TRUE WHERE task_id=?";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    
    public List<Task> getTasksByGroup(int groupId) {

        List<Task> tasks = new ArrayList<>();

        String sql =
        		"SELECT t.*, u.name " +
        		"FROM tasks t " +
        		"JOIN users u ON t.assigned_user = u.user_id " +
        		"WHERE t.group_id=? AND t.is_deleted=FALSE";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, groupId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                Task task = new Task();
                
               

                task.setTaskId(
                        rs.getInt("task_id"));

                task.setTaskName(
                        rs.getString("task_name"));
                
                task.setAssignedUserName(
                        rs.getString("name"));

                task.setDeadline(
                        rs.getString("deadline"));

                task.setStatus(
                        rs.getString("status"));

                task.setAssignedUser(
                        rs.getInt("assigned_user"));

                tasks.add(task);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return tasks;
    }
    
    public boolean updateTask(int taskId,
            String taskName,
            String description,
            String deadline) {

String sql =
"UPDATE tasks SET task_name=?, description=?, deadline=? WHERE task_id=?";

try(
Connection conn = DBConnection.getConnection();
PreparedStatement ps = conn.prepareStatement(sql)
){

ps.setString(1, taskName);
ps.setString(2, description);
ps.setString(3, deadline);
ps.setInt(4, taskId);

return ps.executeUpdate() > 0;

}catch(Exception e){
e.printStackTrace();
}

return false;
}
    public int getProgress(int groupId) {

        int completed = 0;
        int total = 0;

        String sql =
        "SELECT status FROM tasks WHERE group_id=? AND is_deleted=FALSE";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, groupId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                total++;

                if(rs.getString("status").equalsIgnoreCase("Completed")){

                    completed++;

                }

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        if(total == 0)
            return 0;

        return (completed * 100) / total;

    }
    public Map<String, Integer> getContributionScore(int groupId) {

        Map<String, Integer> contribution = new LinkedHashMap<>();

        String sql =
            "SELECT u.name, COUNT(*) AS score " +
            "FROM tasks t " +
            "JOIN users u ON t.assigned_user = u.user_id " +
            "WHERE t.group_id=? " +
            "AND t.status='Completed' " +
            "AND t.is_deleted=FALSE " +
            "GROUP BY u.name";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, groupId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                contribution.put(
                        rs.getString("name"),
                        rs.getInt("score"));

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return contribution;
    }
    
    public String getDeadlineRisk(int groupId) {

        int pending = 0;

        String sql =
        "SELECT status FROM tasks WHERE group_id=? AND is_deleted=FALSE";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, groupId);

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                if(rs.getString("status").equalsIgnoreCase("Pending")){

                    pending++;

                }

            }

        }catch(Exception e){

            e.printStackTrace();

        }

        if(pending >= 5){

            return "HIGH";

        }else if(pending >= 3){

            return "MEDIUM";

        }else{

            return "LOW";

        }

    }
    
    public List<Task> searchTasks(int groupId, String keyword) {

        List<Task> tasks = new ArrayList<>();

        String sql =
                "SELECT t.*, u.name " +
                "FROM tasks t " +
                "JOIN users u ON t.assigned_user = u.user_id " +
                "WHERE t.group_id=? " +
                "AND t.task_name LIKE ? " +
                "AND t.is_deleted=FALSE";

        try(
                Connection conn = DBConnection.getConnection();
                PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setInt(1, groupId);
            ps.setString(2, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while(rs.next()){

                Task task = new Task();
                System.out.println("Searching: " + keyword);
                task.setTaskId(rs.getInt("task_id"));
                task.setTaskName(rs.getString("task_name"));
                task.setAssignedUserName(rs.getString("name"));
                task.setDeadline(rs.getString("deadline"));
                task.setStatus(rs.getString("status"));

                tasks.add(task);

            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return tasks;
    }
}