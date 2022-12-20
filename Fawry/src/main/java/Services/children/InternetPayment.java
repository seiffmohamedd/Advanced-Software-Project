package Services.children;

import Services.Service;
import Services.observer;
public class InternetPayment extends Service implements observer {
	
	private static InternetPayment instance;

    private InternetPayment(){}

    public static InternetPayment getInstance() {
        if (instance == null) {
            instance = new InternetPayment();
        }
        return instance;
    }

	public void update(){}
}
