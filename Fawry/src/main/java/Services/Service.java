package Services;

import ServicesProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class Service {
    public String Description;
    double totalCost;
    long number;
    List <ServiceProvider> SPs=new ArrayList<>();
    public String getDescription(){
        return Description;
    }

    public double getTotalCost(){
        return totalCost;
    }

    public void setDescription(String description) {
        Description = description;
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

}
