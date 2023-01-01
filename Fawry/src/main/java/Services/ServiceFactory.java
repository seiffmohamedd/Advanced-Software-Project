package Services;

import Services.children.*;

public class ServiceFactory {
	Service service;
	
	public Service createService(String type) {
		if(type.equals("Donations")) {
			this.service = Donations.getInstance();
		}
		else if(type.equals("Landline")) {
			this.service = Landline.getInstance();
		}
		else if (type.equals("Mobile recharge")){
			this.service = MobileRecharge.getInstance();
		}
		else {
			this.service = InternetPayment.getInstance();
		}
		return this.service;
	}
}
