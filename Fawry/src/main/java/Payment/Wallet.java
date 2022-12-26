package Payment;

import Services.Service;

public class Wallet extends payment{
    int balance =0;
    
    
    public Wallet(int paymentNumber, Service s) {
		super(paymentNumber, s);
	}
    
    public Wallet(int paymentNumber,int balance) {
		super(paymentNumber);
    	this.balance = balance;
	}
    
    public Wallet() {}
    
	public boolean validAmount(){
        if(s.getTotalCost()>balance){
            return false;
        }
        return true;
    }
    public void setBalance(int balance) {
        this.balance = balance;
    }
    public int getBalance() {
        return balance;
    }
    @Override
    public String display() {
    	String response = "";
    	response += "Payment Number: " + String.valueOf(this.paymentNumber) + " Payment Category: ";
    	if(this.s == null) {
    		response += "Recharge Wallet ";
    		response += "Balance: " + balance;
    	}
    	else {
    		response += s.getName() + " ";
    	}
    	
    	return response;
    }
}
