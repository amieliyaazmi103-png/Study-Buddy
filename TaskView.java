
package main;

import dao.UserDAO;
import model.User;

public class TestUser {

    public static void main(String[] args) {

        User user = new User();
        

        UserDAO dao = new UserDAO();
      

if(dao.login("alia@gmail.com", "123"))
{
    System.out.println("Login Success");
}
else
{
    System.out.println("Login Failed");
}

      
    }
}