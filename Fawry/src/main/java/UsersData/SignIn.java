package UsersData;

import User.userInfo;

public class SignIn extends Authentication {
    @Override
    public boolean checkValidation() {
        return Data.searchForEmailAndPassword(getEmail(),getPassword());
    }
    public userInfo Join(){
        if(checkValidation()){
            return Data.GetUserByUserEmail(getEmail());
        }
        return null;
    }
}
