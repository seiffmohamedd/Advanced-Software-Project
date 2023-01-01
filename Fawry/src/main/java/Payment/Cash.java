package Payment;

import Services.Service;

public class Cash extends payment{
	
	public Cash(int paymentNumber, Service s) {
		super(paymentNumber, s);
	}

	public Cash() {
	}
	
	@Override
    public String display() {
    	String st = "";
    	st += "Payment method: Cash" +" "+"Payment Number: " + String.valueOf(this.paymentNumber)
    	+" "+ "Service Name: " + this.s.getName();
    	return st; 
    }
}
