package Services.children;


import Services.Service;
import Services.observer;
public class Landline extends Service implements observer {
	private static Landline instance;

    private Landline(){
    	this.name = "Landline";
    	this.acceptCash = false;
    	
    }

    public static Landline getInstance() {
        if (instance == null) {
            instance = new Landline();
        }
        return instance;
    }

	public void update(){}
	
    
}
