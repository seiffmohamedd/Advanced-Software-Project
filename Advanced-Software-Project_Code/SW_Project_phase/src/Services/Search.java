package Services;

import java.util.ArrayList;
import java.util.List;

public class Search {
    List<Service> serviceList = new ArrayList();
    public List<Service> searchByName(String searchedService){
        List<Service> serviceList2 = new ArrayList();
        for (Service sss : serviceList){
            if(searchedService == sss.getNumber()){
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
}
