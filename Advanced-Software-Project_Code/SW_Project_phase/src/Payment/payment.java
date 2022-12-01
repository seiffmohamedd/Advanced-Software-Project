package Payment;

import Services.Service;

public abstract class payment {
    Service s = new Service();
    double cost = 0;
    public void pay(Service s){}

    public void setS(Service s) {
        this.s = s;
    }

    public void setCost(double cost) {
        this.cost = cost;
    }

    public Service getS() {
        return s;
    }

    public double getCost() {
        return cost;
    }
}
