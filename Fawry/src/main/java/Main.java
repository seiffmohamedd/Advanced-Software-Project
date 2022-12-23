//import Payment.CreditCard;
//import Payment.Wallet;
//import Payment.creditInfo;
//import Payment.payment;
//import Services.Service;
//import Services.children.Donations;
//import Services.children.InternetPayment;
//import Services.children.Landline;
//import Services.children.MobileRecharge;
//import ServicesProvider.ServiceProvider;
//import UsersData.Authentication;
//import UsersData.SignIn;
//import UsersData.SignUp;
//import UsersData.usersData;
//
//import java.util.Scanner;
//
//public class Main {
//    //    Authentications
//    public static void main(String[] args) {
////        Authentication and signin and signup
//        Scanner input = new Scanner(System.in);
//        System.out.println("enter the number of Authentications");
//        int numberOfAuthentication = input.nextInt();
//        String Operation;
//        usersData Data = new usersData();
//        Authentication A = null;
//        while (numberOfAuthentication > 0) {
//            System.out.println("signin  or  signup");
//            Operation = input.next();
//            if (Operation.equals("signup")) {
//                A = new SignUp();
//                A.setData(Data);
//                System.out.println("enter your Email");
//                A.setEmail(input.next());
//                System.out.println("enter your User Name");
//                A.setUserName(input.next());
//                System.out.println("enter your Password");
//                A.setPassword(input.next());
//                A.Join();
//            } else if (Operation.equals("signin")) {
//                A = new SignIn();
//                A.setData(Data);
//                System.out.println("enter your Email");
//                A.setEmail(input.next());
//                System.out.println("enter your Password");
//                A.setPassword(input.next());
//                A.Join();
//            } else
//                System.out.println("please enter correct operation");
//            numberOfAuthentication--;
//        }
//        try {
//            A.display();
//        } catch (Exception e) {
//            System.out.println("error happened");
//        }
////        service and service provider
//        Service service1 = null;
//        String choice;
//        while (service1 == null) {
//            System.out.println("enter the service what you went internet , mobileRecharge , Landline , or Donation");
//            choice = input.next();
//            switch (choice) {
//                case "internet" -> service1 = new InternetPayment();
//                case "mobileRecharge" -> service1 = new MobileRecharge();
//                case "Landline" -> service1 = new Landline();
//                case "Donation" -> service1 = new Donations();
//                default -> System.out.println("please enter correct choice");
//            }
//        }
//        System.out.println("enter your service description");
//        service1.setDescription(input.next());
//        ServiceProvider serviceProvider1 = new ServiceProvider();
//        serviceProvider1.setService(service1);
//        System.out.println("enter your service provider name");
//        serviceProvider1.setName(input.next());
//        System.out.println("enter your service provider number");
//        serviceProvider1.setNumber(input.nextLong());
//        System.out.println("enter cost for " + serviceProvider1.getName());
//        serviceProvider1.s.setTotalCost(input.nextInt());
//        service1.addServiceProvider(serviceProvider1);
//        System.out.println("search for The amount payable for a service by service provider number");
//        System.out.println(service1.getServiceProviderByNumber(input.nextLong()).s.getTotalCost());
//
////        Credit card and Wallet
//        System.out.println("enter the number of your credit cards and its data");
//        int choice2 = input.nextInt();
//        creditInfo CInfo = new creditInfo();
//        while (choice2-- > 0) {
//            CreditCard C = new CreditCard();
//            System.out.println("please enter your credit card number");
//            C.setCreditNumber(input.nextLong());
//            System.out.println("please enter your credit card password");
//            C.setCreditPassword(input.nextInt());
//            System.out.println("please enter your credit card balance");
//            C.setBalance(input.nextDouble());
//            CInfo.addCredit(C);
//        }
//        Wallet W = new Wallet();
//        CInfo.setWallet(W);
//        System.out.println("you want to recharge you wallet ?");
//        if (input.next().equals("yes")) {
//            System.out.println("please enter your credit card number and its password and the amount for recharge");
//            try {
//                CInfo.chargeWallet(CInfo.veiledCredit(input.nextLong(), input.nextInt()), input.nextDouble());
//            } catch (Exception e) {
//                System.out.println("error happened");
//            }
//        }
//        CInfo.printCreditsInfo();
////        payment
//        System.out.println("do you want to pay for your service ?");
//        if (input.next().equals("yes")) {
//            payment p = new CreditCard();
//            if (p.pay(service1, CInfo)) {
//                CInfo.addPayments(p);
//            }
//        }
//    }
//}