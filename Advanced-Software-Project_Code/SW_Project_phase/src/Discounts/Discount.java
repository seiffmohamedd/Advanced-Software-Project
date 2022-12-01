package Discounts;

import Services.Service;

public abstract class  Discount  extends Service {
    float cost ;
    Service s = new Service();
    public double cost(){
        return cost*s.getTotalCost();
    }
    public void setService(Service ss){
        s = ss ;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    public void setS(Service s) {
        this.s = s;
    }

    public float getCost() {
        return cost;
    }

    public Service getS() {
        return s;
    }
    @Override
    public double getTotalCost() {
        return super.getTotalCost();
    }
}
