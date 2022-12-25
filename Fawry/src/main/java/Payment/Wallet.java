package Payment;

import Services.Service;

public class Wallet extends payment{
    int balance =0;
    
    
    public Wallet(int paymentNumber, Service s) {
		super(paymentNumber, s);
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
}
