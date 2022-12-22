package Services.children;

import Services.Service;
import Services.observer;
public class MobileRecharge extends Service implements observer {
	private static MobileRecharge instance;

    private MobileRecharge(){}

    public static MobileRecharge getInstance() {
        if (instance == null) {
            instance = new MobileRecharge();
        }
        return instance;
    }

	public void update(){}
    
}
