package Payment;

import Services.*;
import ServicesProvider.*;

import java.util.Scanner;

public abstract class payment {
    int paymentNumber=0;
    Service s = new Service();
    
    
//    public boolean pay(Service s , creditInfo  C){
//        Scanner input = new Scanner(System.in);
//        String choice;
//        ServiceProvider SP =new ServiceProvider();
//        System.out.println("enter your service provider number");
//        SP =s.getServiceProviderByNumber(input.nextLong());
//        System.out.println("select payment method either wallet or CreditCard");
//        choice=input.next();
//        if(choice.equals("wallet")){
//            if(C.wallet.getBalance()>=SP.s.getTotalCost()){
//                C.wallet.setBalance(C.wallet.getBalance()-SP.s.getTotalCost());
//                SP.s.setTotalCost(0);
//                C.addPayments(this);
//                System.out.println("payment done successfully");
//                return true;
//            }
//            else{
//                System.out.println("your payment balance is lower than you service cost");
//                return false;
//            }
//        } else if (choice.equals("CreditCard")) {
//            CreditCard CD =new CreditCard();
//            System.out.println("please enter your credit card number and password");
//            CD = C.veiledCredit(input.nextLong() , input.nextInt());
//            if(CD.getBalance()>=SP.s.getTotalCost()){
//                CD.setBalance(C.wallet.getBalance()-SP.s.getTotalCost());
//                SP.s.setTotalCost(0);
//                C.addPayments(this);
//                System.out.println("payment done successfully");
//                return true;
//            }
//            else{
//                System.out.println("your payment balance is lower than you service cost");
//                return false;
//            }
//        }else {
//            System.out.println("please enter valid choice");
//            return false;
//        }
//
//    }


    
    public payment() {}
    
	public payment(int paymentNumber, Service s) {
	super();
	this.paymentNumber = paymentNumber;
	this.s = s;
}

	public void setS(Service s) {
        this.s = s;
    }
    public Service getS() {
        return s;
    }

    public void setPaymentNumber(int paymentNumber) {
        this.paymentNumber = paymentNumber;
    }

    public int getPaymentNumber() {
        return paymentNumber;
    }
    
    public String display(){return "Normal Payment";}
    
}
