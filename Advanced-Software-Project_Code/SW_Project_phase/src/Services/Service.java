package Services;

import Discounts.Discount;

public class Service {
    String Description;
    double totalCost;
    String number;
    public void update(){

    }
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
