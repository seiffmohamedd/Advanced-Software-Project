package Services;

import java.util.ArrayList;
import java.util.List;

public class Search {
    List<Service> serviceList = new ArrayList();
    public List<Service> searchByDescription(String searchedService){
        List<Service> serviceList2 = new ArrayList();
        for (Service sss : serviceList){
            if(searchedService == sss.getDescription()){
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
            System.out.println(s.getDescription());
        }
    }
}
