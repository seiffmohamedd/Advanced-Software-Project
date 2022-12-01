package Payment;

import Services.Service;

public class Wallet extends payment{
    double credit;
    public void pay(Service s){

    }
    public boolean validAmount(){
        boolean x = true;
        return x;
    }

    public void setCredit(double credit) {
        this.credit = credit;
    }

    public double getCredit() {
        return credit;
    }
}
