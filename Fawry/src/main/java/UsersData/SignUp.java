package UsersData;

import User.userInfo;

public class SignUp extends Authentication {
    
	
	public SignUp(usersData data, String email, String password, String userName) {
		super(data, email, password, userName);
		
	}
	@Override
    public boolean checkValidation() {
        if(!Data.searchByUserName(getUserName())){
            if(!Data.searchByUserEmail(getEmail())){
                return true;
            }
            System.out.println("the Email already exist");
            return false;
        }
        System.out.println("the User name is already exist");
        return false;
    }
	
	@Override
    public boolean Join(){
        if(checkValidation()){
            userInfo u = new userInfo();
            u.setEmail(getEmail());
            u.setPassword(getPassword());
            u.setUserName(getUserName());
            Data.addUser(u);
            return true;
        }
        return false;
    }
}
