package dao;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import model.User;
import java.util.List;
import java.util.ArrayList;
import java.sql.ResultSet;
public class UserDAO {

    public boolean addUser(User user) {

        String sql =
            "INSERT INTO users(name,email,password) VALUES(?,?,?)";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public void viewUsers() {

        String sql =
            "SELECT * FROM users WHERE is_deleted = FALSE";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ) {

            while(rs.next()) {

                System.out.println(
                    rs.getInt("user_id") + " | " +
                    rs.getString("name") + " | " +
                    rs.getString("email")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public void searchUser(String keyword) {

        String sql =
            "SELECT * FROM users WHERE name LIKE ? AND is_deleted = FALSE";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, "%" + keyword + "%");

            ResultSet rs = ps.executeQuery();

            while(rs.next()) {

                System.out.println(
                    rs.getString("name") + " | " +
                    rs.getString("email")
                );
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }
    public boolean updateUser(User user) {

        String sql =
            "UPDATE users SET name=?, email=?, password=? WHERE user_id=?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, user.getName());
            ps.setString(2, user.getEmail());
            ps.setString(3, user.getPassword());
            ps.setInt(4, user.getUserId());

            return ps.executeUpdate() > 0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean softDeleteUser(int id) {

        String sql =
            "UPDATE users SET is_deleted = TRUE WHERE user_id=?";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setInt(1, id);

            return ps.executeUpdate() > 0;

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    public boolean login(String email, String password) {

        String sql =
            "SELECT * FROM users WHERE email=? AND password=? AND is_deleted=FALSE";

        try (
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ) {

            ps.setString(1, email);
            ps.setString(2, password);

            ResultSet rs = ps.executeQuery();

            return rs.next();

        } catch(Exception e) {
            e.printStackTrace();
        }

        return false;
    }
    
    public List<String> getAllUserNames() {

        List<String> users = new ArrayList<>();

        String sql = "SELECT name FROM users";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql);
            ResultSet rs = ps.executeQuery()
        ){

            while(rs.next()) {

                users.add(
                    rs.getString("name")
                );
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return users;
    }
    
    public int getUserIdByName(String name) {

        String sql =
            "SELECT user_id FROM users WHERE name=?";

        try(
            Connection conn = DBConnection.getConnection();
            PreparedStatement ps = conn.prepareStatement(sql)
        ){

            ps.setString(1, name);

            ResultSet rs = ps.executeQuery();

            if(rs.next()) {

                return rs.getInt("user_id");
            }

        }catch(Exception e){
            e.printStackTrace();
        }

        return -1;
    }
    
}