package Payment;

import java.util.ArrayList;
import java.util.List;

public class creditInfo {
    List<payment> historyPayments = new ArrayList();
    Wallet wallet = new Wallet();
    List<CreditCard> credits = new ArrayList();


    public void setWallet(Wallet wallet) {
        this.wallet = wallet;
    }
    public payment getWallet() {
        return wallet;
    }

    public void addPayments(payment P) {
        for (payment PP : historyPayments){
            if(PP.getPaymentNumber()== P.getPaymentNumber()){
                P.setPaymentNumber(P.getPaymentNumber()+1);
            }
            historyPayments.add(P);
        }
    }

    public payment getPayments(int PN) {
        for(payment P : historyPayments){
            if(P.getPaymentNumber()==PN){
                return P;
            }
        }
        return null;
    }

    public boolean searchByCreditNumber(long n){
        for (CreditCard C : credits){
            if(C.getCreditNumber()== n){
                return true;
            }
        }
        return false;
    }
    public CreditCard veiledCredit(long n , int p){
        for (CreditCard c : credits){
            if(c.getCreditNumber()==n){
                if(c.getCreditPassword()==p){
                    return c;
                }
                System.out.println("password is wrong");
                return null;
            }
        }
        System.out.println("credit card number is not exist");
        return null;
    }
    public void addCredit(CreditCard C){
        if(!searchByCreditNumber(C.getCreditNumber())){
            credits.add(C);
            System.out.println("credit card added successfully");
        }
        else {
            System.out.println("the credit card already exist");
        }
    }
    public void chargeWallet(CreditCard c,double amount){
        if(amount>c.getBalance()){
            System.out.println("the amount of recharge is more than your credit card Balance");
        }
        else {
            wallet.setBalance(wallet.getBalance()+amount);
            c.setBalance(c.getBalance()-amount);
        }
    }
    public void printCreditsInfo(){
        for (CreditCard C : credits){
            System.out.println(C.getCreditNumber()+" "+C.getCreditPassword()+" "+C.getBalance());
        }
        System.out.println("your wallet balance :"+wallet.getBalance());
    }
    public void printPayment(){
        for (payment p : historyPayments){
            System.out.println(p.getPaymentNumber());
        }
    }
}
