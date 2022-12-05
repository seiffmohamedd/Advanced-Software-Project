package Discounts;

import Discounts.Discount;
import Services.Service;

public class Overall extends Discount {
    public Overall(Service service){
        this.setService(service);
    }
}
