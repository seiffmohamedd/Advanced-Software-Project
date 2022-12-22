package Services;

import Services.children.*;

public class ServiceFactory {
	Service service;
	
	public Service createService(String type) {
		if(type == "Donations") {
			this.service = Donations.getInstance();
		}
		else if(type == "Landline") {
			this.service = Landline.getInstance();
		}
		else if (type == "Mobile recharge"){
			this.service = MobileRecharge.getInstance();
		}
		else {
			this.service = InternetPayment.getInstance();
		}
		return this.service;
	}
}
