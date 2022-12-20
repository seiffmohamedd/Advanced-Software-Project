package Services.children;

import Services.Service;
import Services.observer;

public class Donations extends Service implements observer {
    
    private static Donations instance;

    private Donations(){}

    public static Donations getInstance() {
        if (instance == null) {
            instance = new Donations();
        }
        return instance;
    }

	public void update(){}
}
