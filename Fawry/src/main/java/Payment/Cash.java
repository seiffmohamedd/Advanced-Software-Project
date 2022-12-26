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
    	st += "Payment method: Cash" +"\n"+"Payment Number: " + String.valueOf(this.paymentNumber)
    	+"\n"+ "Service Name: " + this.s.getName();
    	return st; 
    }
}
