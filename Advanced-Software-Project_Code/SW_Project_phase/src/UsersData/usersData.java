package UsersData;

import User.user;

import java.util.ArrayList;
import java.util.List;

public class usersData {
    List<user> users=new ArrayList<user>();
    public void addUser(user U){
        users.add(U);
    }
    public void removeUser(String userName){
        for (user u : users){
            if(userName == u.getUserName()){
                users.remove(u);
            }
        }
    }

}
