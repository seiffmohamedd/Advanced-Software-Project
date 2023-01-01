package User;

import Payment.creditInfo;
import Payment.payment;

public class userInfo {
    creditInfo credits ;
    String userName ;
    String password ;
    String Email ;
    public void getInfo(){
        System.out.println(userName + password + Email);
    }
    public void requestRefund(payment p){

    }
    public void setCredits(creditInfo credits) {
        this.credits = credits;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public creditInfo getCredits() {
        return credits;
    }

    public String getEmail() {
        return Email;
    }

    public String getPassword() {
        return password;
    }

    public String getUserName() {
        return userName;
    }

}
