package Services;

import ServicesProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public String name;
    double totalCost;
    long number;
    protected boolean acceptCash;
    
    private List <ServiceProvider> SPs = new ArrayList<>();
    
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

	public String addServiceProvider(ServiceProvider s){
        SPs.add(s);
        for(ServiceProvider sp : SPs) {
        	System.out.println(sp.getName());
        }
        return "Service Provider added successfully";
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
    
    public String displayAcceptance() {
    	if(acceptCash == true) {
			return "Accept Cash";
		}
    	return "Not Accepting";
    }

	public void setAcceptCash(boolean acceptCash) {
		this.acceptCash = acceptCash;
	}

	public List<ServiceProvider> getSPs() {
		return SPs;
	}

	public void setSPs(List<ServiceProvider> sPs) {
		SPs = sPs;
	}
	//For testing & debug only
//	public void display() {
//		for(ServiceProvider sp : SPs) {
//			System.out.print(sp.);
//		}
//	}
}
