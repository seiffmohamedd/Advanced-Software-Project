package UsersData;

public abstract class Authentication {
    usersData Data ;
    String Email ;
    String Password;
    String userName ;
    public void checkValidation() {}
    public String getEmail(){
        return Email;
    }
    public String getPassword(){
        return Password;
    }
    public String getUserName(){
        return userName;
    }
}
