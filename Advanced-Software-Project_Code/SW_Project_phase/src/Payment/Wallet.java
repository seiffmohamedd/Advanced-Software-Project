package Payment;

import Services.Service;

public class Wallet extends payment{
    double balance =0;
    public boolean validAmount(){
        if(s.getTotalCost()>balance){
            return false;
        }
        return true;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public double getBalance() {
        return balance;
    }
}
