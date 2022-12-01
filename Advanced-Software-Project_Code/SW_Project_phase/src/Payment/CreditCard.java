package Payment;

import Services.Service;

public class CreditCard extends payment{
    String creditNumber;
    public void pay(Service s){

    }

    public void setCreditNumber(String creditNumber) {
        this.creditNumber = creditNumber;
    }

    public String getCreditNumber() {
        return creditNumber;
    }
}
