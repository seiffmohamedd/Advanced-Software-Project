package Admination;

import User.userInfo;

public class Refund {
    userInfo u;
    int paymentID;
    String refundStatus;

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }

    public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setU(userInfo u) {
        this.u = u;
    }
    public void refundInfo(){
        System.out.println(paymentID + refundStatus );
    }
}
