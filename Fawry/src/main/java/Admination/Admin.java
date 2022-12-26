package Admination;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import User.userInfo;

public class Admin {
    List<Refund> Refunds= new ArrayList();
    Discounter D ;
    
    public List<String> showRefundList(){
    	List<String> refunds2= new ArrayList<>();
        for (Refund x : Refunds){
            refunds2.add(x.refundInfo());
        }
        return refunds2;
    }
   public void addRefund(int payid, userInfo user) {
    	
    	Refund refund = new Refund(user, payid,"pending");  	
    	Refunds.add(refund);
    	for(Refund refund2 : Refunds) {
    		System.out.println(refund2.getUserinfo().getUserName() + " " + refund2.getPaymentID() + " " + refund2.getRefundStatus());
    	}
    }
    public void acceptRefund(int payid,String username){
    	for(int i=0 ; i< Refunds.size();i++)
    	{
    		if(payid == Refunds.get(i).getPaymentID() && username.equals(Refunds.get(i).getUserinfo().getUserName()))
    		{
    			Refunds.get(i).setRefundStatus("Accepted");
    		}
    		
    	}
//        r.setRefundStatus("accepted");
    }
    public void rejectRefund(int payid,String username){
    	for(int i=0 ; i< Refunds.size();i++)
    	{
    		if(payid == Refunds.get(i).getPaymentID() && username.equals(Refunds.get(i).getUserinfo().getUserName()))
    		{
    			Refunds.get(i).setRefundStatus("Rejected");
    		}
    		
    	}
//        r.setRefundStatus("rejected");
    }
}
