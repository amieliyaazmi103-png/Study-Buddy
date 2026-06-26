package dao;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.Group;

public class GroupDAO {

    public boolean addGroup(Group group) {

        String sql =
        "INSERT INTO groups(group_name, created_date) VALUES(?,?)";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setString(1, group.getGroupName());
            ps.setString(2, group.getCreatedDate());

            return ps.executeUpdate() > 0;

        }catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    public List<Group> getAllGroups() {

        List<Group> groups = new ArrayList<>();

        String sql =
        		"SELECT * FROM groups WHERE is_deleted = FALSE";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ){

            while(rs.next()) {

                Group group = new Group();

                group.setGroupId(
                        rs.getInt("group_id"));

                group.setGroupName(
                        rs.getString("group_name"));

                group.setCreatedDate(
                        rs.getString("created_date"));

                groups.add(group);
            }

        } catch(Exception e){
            e.printStackTrace();
        }

        return groups;
    }
    
    public boolean updateGroup(int id, String groupName) {

        String sql =
        "UPDATE groups SET group_name=? WHERE group_id=?";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setString(1, groupName);
            ps.setInt(2, id);

            return ps.executeUpdate() > 0;

        } catch(Exception e){
            e.printStackTrace();
        }

        return false;
    }
    
    public boolean softDeleteGroup(int id) {

        String sql =
        "UPDATE groups SET is_deleted=TRUE WHERE group_id=?";

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
    
    
}