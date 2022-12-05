package Admination;

import Payment.CreditCard;
import Payment.creditInfo;
import User.userInfo;

public class Refund {
    creditInfo C;
    int paymentID;
    String refundStatus;

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setCreditInfo(creditInfo c) {
        this.C = c;
    }
    public void refundInfo(){
        System.out.println(paymentID + refundStatus );
    }
}
