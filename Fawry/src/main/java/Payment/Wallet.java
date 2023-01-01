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
    
    @Override
	public boolean validAmount(int totalcost){
       if(totalcost<=balance)
       {
    		balance-=totalcost;
    		System.out.println(balance);
    		
        	return true;
       }
        else
        {
    		System.out.println(balance);

        	return false;
        }
     
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
    		response += s.getName() + " " ;
    		response += "Balance: " + balance;
    	}
		
    	return response;
    }
}
