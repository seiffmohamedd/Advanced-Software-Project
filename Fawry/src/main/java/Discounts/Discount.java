package Discounts;

import Services.Service;

public abstract class  Discount  extends Service {
    float discountAmount;
    Service s;
    public void setService(Service ss){
        this.s = ss ;
    }
    public Service getService() {
        return s;
    }
    public void setDiscountAmount(float discountAmount) {
        this.discountAmount = discountAmount;
    }
    @Override
    public double getTotalCost() {
        return s.getTotalCost()* 0.8;
    }

    @Override
    public String getName() {
        return s.getName()+" with discount"+discountAmount;
    }
}
