package UsersData;

import User.userInfo;

public abstract class Authentication {
    usersData Data =new usersData();
    String Email ;
    String Password;
    String userName ;
    public boolean checkValidation() {
        return true;
    }
    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return Password;
    }
    public String getUserName(){
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public void setEmail(String email) {
        Email = email;
    }
    public void setPassword(String password) {
        Password = password;
    }

    public void setData(usersData data) {
        Data = data;
    }

    public userInfo Join(){return null;}
    public void display(){
        Data.print();
    }
}
