package Payment;

import java.util.ArrayList;
import java.util.List;

public class creditInfo {
    List<payment> payments = new ArrayList();
    payment wallet ;
    List<CreditCard> credits = new ArrayList();
    public creditInfo(){
        wallet =new Wallet();
    }
    public List<payment> historyPayments(){
        return payments;
    }

    public void setWallet(payment wallet) {
        this.wallet = wallet;
    }

    public void setCredits(List<CreditCard> credits) {
        this.credits = credits;
    }

    public void setPayments(List<payment> payments) {
        this.payments = payments;
    }

    public List<CreditCard> getCredits() {
        return credits;
    }

    public List<payment> getPayments() {
        return payments;
    }

    public payment getWallet() {
        return wallet;
    }
}
