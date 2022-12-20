package Services;

import java.util.ArrayList;
import java.util.List;

public class Search {
	List<Service> serviceList = new ArrayList <Service>();
	
	public Search() {}
	
	public Search(List<Service> serviceList) {
		this.serviceList = serviceList;
	}
    

	public List<Service> searchByName(String searchedService){
        
		List<Service> serviceList2 = new ArrayList();
        
		for (Service sss : serviceList){
            if(sss.getName().contains(searchedService)){
                serviceList2.add(sss);
            }
        }
        return serviceList2;
    }

    public List<Service> getServiceList() {
        return serviceList;
    }
    
    public void setServiceList(List<Service> serviceList) {
        this.serviceList = serviceList;
    }
    
    public void displayAllSearchedServices(){
        for (Service s : serviceList){
            System.out.println(s.getName());
        }
    }
    
    public void addService(Service service){
    	this.serviceList.add(service);
    }
    
    
}
