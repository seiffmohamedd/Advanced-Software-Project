package Services;

import Discounts.Discount;
import ServicesProvider.ServiceProvider;

import java.util.ArrayList;
import java.util.List;

public class Service {
    String Description;
    double totalCost;
    String number;

    List <ServiceProvider> SPs=new ArrayList<>();
    public boolean hasDiscount(Discount d){
        boolean h = true;
        return h;
    }
    public String getDescription(){
        return Description;
    }
    public String getNumber(){
        return number;
    }
    public double getTotalCost(){
        return totalCost;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public void setTotalCost(double totalCost) {
        this.totalCost = totalCost;
    }
}
