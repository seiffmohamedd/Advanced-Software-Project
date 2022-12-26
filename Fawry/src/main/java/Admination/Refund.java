package Admination;

import Payment.CreditCard;
import Payment.creditInfo;
import User.userInfo;

public class Refund {
    userInfo userinfo;
    int paymentID;
    String refundStatus;

    public void setPaymentID(int paymentID) {
        this.paymentID = paymentID;
    }
    

	public Refund(userInfo u, int paymentID, String refundStatus) {
		super();
		userinfo = u;
		this.paymentID = paymentID;
		this.refundStatus = refundStatus;
	}


	public void setRefundStatus(String refundStatus) {
        this.refundStatus = refundStatus;
    }

    public void setUserInfo(userInfo c) {
        this.userinfo = c;
    }
    public String refundInfo(){
        String s  = String.valueOf(paymentID) + " " +refundStatus + " " + userinfo.getUserName();
        return s;
    }


	public userInfo getUserinfo() {
		return userinfo;
	}


	public void setUserinfo(userInfo userinfo) {
		this.userinfo = userinfo;
	}


	public int getPaymentID() {
		return paymentID;
	}


	public String getRefundStatus() {
		return refundStatus;
	}
    
}
