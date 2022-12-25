package UsersData;

import User.userInfo;

import java.util.ArrayList;
import java.util.List;

public class usersData {
    List<userInfo> userInfos =new ArrayList<userInfo>();
    
    public void addUser(userInfo U){
        userInfos.add(U);
    }
    public void removeUser(String userName){
        for (userInfo u : userInfos){
            if(userName == u.getUserName()){
                userInfos.remove(u);
            }
        }
    }
    public boolean searchByUserName(String u){
        for (userInfo userInfo : userInfos){
            if(userInfo.getUserName().equals(u)){
                return true;
            }
        }
        return false;
    }
    
    
   public userInfo getByUserName(String u){
        for (userInfo userInfo : userInfos){
            if(userInfo.getUserName().equals(u)){
                return userInfo;
            }
        }
        return null;
    }
    
    public boolean searchByUserEmail(String E){
        for (userInfo userInfo : userInfos){
            if(userInfo.getEmail().equals(E)){
                return true;
            }
        }
        return false;
    }
    public boolean searchForEmailAndPassword(String E , String P){
        for (userInfo userInfo : userInfos){
            if(userInfo.getEmail().equals(E) && !userInfo.getPassword().equals(P)){
                System.out.println("the password is incorrect");
                return false;
            }
            if(userInfo.getEmail().equals(E)&& userInfo.getPassword().equals(P)){
                return true;
            }
        }
        System.out.println("the email is not exist");
        return false;
    }
    public userInfo GetUserByUserEmail(String E){
        for (userInfo userInfo : userInfos){
            if(userInfo.getEmail().equals(E)){
                return userInfo;
            }
        }
        return null;
    }
    
    public void print(){
        for (userInfo U : userInfos){
            U.getInfo();
        }
    }
}
