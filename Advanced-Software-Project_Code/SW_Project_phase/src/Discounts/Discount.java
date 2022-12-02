package Discounts;

import Services.Service;
import Services.children.Donations;

public abstract class  Discount  extends Service {
    float cost ;
    Service s = new Service();
    public void setService(Service ss){
        this.s = ss ;
    }
    public Service getService() {
        return s;
    }
    public void setCost(float cost) {
        this.cost = cost;
    }
    @Override
    public double getTotalCost() {
        return s.getTotalCost()*cost;
    }
}
