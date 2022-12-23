package Payment;

import java.util.Map;

public class PaymentView {
	payment payment;
	Map <String,String> layout;
	
	public PaymentView(Payment.payment payment) {
		this.payment = payment;
		layout.put("wallet", "optional");
		layout.put("CreditCard", "default");
		layout.put("cost",String.valueOf(payment.getS().getTotalCost()));
	}
	public Map<String,String> display() {
		if(payment.getS().isAcceptingCash()) {
			layout.put("CashOnDelivery","optional");
		}
		return layout;
	}
}
