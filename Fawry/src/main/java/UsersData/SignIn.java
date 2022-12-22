package UsersData;

import User.userInfo;

public class SignIn extends Authentication {
    
	
	
	public SignIn(usersData data, String email, String password) {
		super(data, email, password);
		// TODO Auto-generated constructor stub
	}
	@Override
    public boolean checkValidation() {
        return Data.searchForEmailAndPassword(getEmail(),getPassword());
    }
    public boolean Join(){
        if(checkValidation()){
            return true;
        }
        return false;
    }
}
