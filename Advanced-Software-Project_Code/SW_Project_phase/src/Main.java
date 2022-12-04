import UsersData.Authentication;
import UsersData.SignIn;
import UsersData.SignUp;
import UsersData.usersData;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("enter the number of Authentications");
        int numberOfAuthentication = input.nextInt();
        String Operation;
        usersData Data =new usersData();
        Authentication A = null;
        while (numberOfAuthentication>0) {
            System.out.println("signin  or  signup");
            Operation=input.next();
            if(Operation.equals("signup")) {
                A = new SignUp();
                A.setData(Data);
                System.out.println("enter your Email");
                A.setEmail(input.next());
                System.out.println("enter your User Name");
                A.setUserName(input.next());
                System.out.println("enter your Password");
                A.setPassword(input.next());
                A.Join();
            }else if(Operation.equals("signin")) {
                A = new SignIn();
                A.setData(Data);
                System.out.println("enter your Email");
                A.setEmail(input.next());
                System.out.println("enter your Password");
                A.setPassword(input.next());
                A.Join();
            }else
                System.out.println("please enter correct operation");
            numberOfAuthentication--;
        }
        A.display();
    }
}
