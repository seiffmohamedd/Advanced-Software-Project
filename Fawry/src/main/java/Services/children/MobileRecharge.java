package Services.children;

import Services.Service;
import Services.observer;
public class MobileRecharge extends Service implements observer {
	private static MobileRecharge instance;

    private MobileRecharge(){
    	this.name = "Mobile recharge";
    	this.acceptCash = true;
    }

    public static MobileRecharge getInstance() {
        if (instance == null) {
            instance = new MobileRecharge();
        }
        return instance;
    }

	public void update(){}
    
}
