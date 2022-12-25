package Admination;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import User.userInfo;

public class Admin {
    List<Refund> Refunds= new ArrayList();
    Discounter D ;
    public void showRefundList(){
        for (Refund x : Refunds){
            x.refundInfo();
        }
    }
   public void addRefund(int payid, userInfo user) {
    	
    	Refund refund = new Refund(user, payid,"pending");  	
    	Refunds.add(refund);
    }
    public void acceptRefund(Refund r){
        r.setRefundStatus("accepted");
    }
    public void rejectRefund(Refund r){
        r.setRefundStatus("rejected");
    }
}
