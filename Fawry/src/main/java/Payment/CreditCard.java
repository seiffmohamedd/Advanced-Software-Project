package Payment;

import Services.Service;

public class CreditCard extends payment{
    double balance ;
    long creditNumber ;
    int creditPassword ;
    
    public CreditCard() {
		super();
	}
	public CreditCard(int paymentNumber, Service s) {
		super(paymentNumber, s);
	}
	public void setCreditNumber(long creditNumber) {
        this.creditNumber = creditNumber;
    }
    public long getCreditNumber() {
        return creditNumber;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setCreditPassword(int creditPassword) {
        this.creditPassword = creditPassword;
    }

    public int getCreditPassword() {
        return creditPassword;
    }
    public boolean validAmount(){
        if(s.getTotalCost()>balance){
            return false;
        }
        return true;
    }
}
