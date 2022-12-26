package Payment;

import java.util.ArrayList;
import java.util.List;
import Admination.*;
import User.*;


public class creditInfo {
    List<payment> historyPayments = new ArrayList();
    Wallet wallet = new Wallet();
    List<payment> wall = new ArrayList<>();
    List<CreditCard> credits = new ArrayList();
    List<Refund> historyRefunds = new ArrayList<>();

    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public payment getWallet() {
        return wallet;
    }

    public String addPayments(payment P) {
//        for (payment PP : historyPayments){
//            if(PP.getPaymentNumber()== P.getPaymentNumber()){
//                P.setPaymentNumber(P.getPaymentNumber()+1);
//            }
//            
//    
//        }
    	
        historyPayments.add(P);
        
//        for(payment pay : historyPayments) {
//        	System.out.println("Payment ID: " + pay.getPaymentNumber());
//        }
        
        if(P instanceof Wallet)
        {
        	wall.add(P);
        	
        	for(payment pay : wall) {
            	System.out.println("Payment ID: " + pay.getPaymentNumber());
            }
        	System.out.println("Wallet Payment!");
        }

        return "Payment Done Successfully!";
    }
   
    
    
	public List<payment> getWall() {
		return wall;
	}
	public void setWall(List<payment> wall) {
		this.wall = wall;
	}
	public boolean getPayments(int PN) {
        for(payment P : historyPayments){
            if(P.getPaymentNumber()==PN){
                return true;
            }
        }
        return false;
    }
    
//    public payment listPayments()
//    {
//    	return historyPayments;
//    }
    
    public String addRefund(int payid, userInfo user) {
    	
    	Refund refund = new Refund(user, payid,"pending");  	
    	historyRefunds.add(refund);
    	for(Refund r : historyRefunds) {
    		System.out.println(r.getUserinfo().getUserName() + " " + r.getPaymentID() + " " + r.getRefundStatus());
    	}
    	return "Refund Request has been recorded";
    }

    public List<payment> getHistoryPayments() {
		return historyPayments;
	}
    
	public void setHistoryPayments(List<payment> historyPayments) {
		this.historyPayments = historyPayments;
	}
	
	public List<Refund> getHistoryRefunds() {
		return historyRefunds;
	}
	
	public void setHistoryRefunds(List<Refund> historyRefunds) {
		this.historyRefunds = historyRefunds;
	}
	public boolean searchByCreditNumber(long n){
        for (CreditCard C : credits){
            if(C.getCreditNumber()== n){
                return true;
            }
        }
        return false;
    }
    public CreditCard veiledCredit(long n , int p){
        for (CreditCard c : credits){
            if(c.getCreditNumber()==n){
                if(c.getCreditPassword()==p){
                    return c;
                }
                System.out.println("password is wrong");
                return null;
            }
        }
        System.out.println("credit card number is not exist");
        return null;
    }
    public void addCredit(CreditCard C){
        if(!searchByCreditNumber(C.getCreditNumber())){
            credits.add(C);
            System.out.println("credit card added successfully");
        }
        else {
            System.out.println("the credit card already exist");
        }
    }
    public String chargeWallet(int paymentID,int amount){
    	int newBalance = wallet.getBalance()+amount;
    	payment walletrecharge = new Wallet(paymentID,newBalance);
    	Wallet wal = new Wallet(paymentID,newBalance);
    	wall.add(walletrecharge);
    	wallet=wal;
    	
    	return "amount added successfully";
    }
    public void printCreditsInfo(){
        for (CreditCard C : credits){
            System.out.println(C.getCreditNumber()+" "+C.getCreditPassword()+" "+C.getBalance());
        }
        System.out.println("your wallet balance :"+wallet.getBalance());
    }
    public void printPayment(){
        for (payment p : historyPayments){
            System.out.println(p.getPaymentNumber());
        }
    }
    public void printhistoryRefunds(){
        for (Refund p : historyRefunds){
            System.out.println(p.refundInfo());
        }
    }
}
