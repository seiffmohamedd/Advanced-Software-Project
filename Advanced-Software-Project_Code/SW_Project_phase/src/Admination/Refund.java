package Admination;

import User.user;

public class Refund {
    user u;
    int paymentID;
    String refundStatus;

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setU(user u) {
        this.u = u;
    }
    public void refundInfo(){
        System.out.println(paymentID + refundStatus );
    }
}
