package Services;

import ServicesProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public String name;
    double totalCost;
    long number;
    private boolean acceptCash;
    
    List <ServiceProvider> SPs=new ArrayList<>();
    
    public Service(){
    	acceptCash = false;
    }
    
    public Service(String name){
		this.name = name;
		acceptCash = false;
	}
    
    public String getName(){
        return name;
    }

    public double getTotalCost(){
        return totalCost;
    }

    

	public void setDescription(String description) {
        name = description;
    }
    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }

	public void addServiceProvider(ServiceProvider s){
        SPs.add(s);
    }
    public ServiceProvider getServiceProviderByNumber(long n){
        for (ServiceProvider s : SPs){
          if (s.getNumber()==n){
              return s;
          }
        }
        return null;
    }
    public boolean isAcceptingCash() {
		return acceptCash;
	}

	public void setAcceptCash(boolean acceptCash) {
		this.acceptCash = acceptCash;
	}

}
