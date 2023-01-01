package Admination;


import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class Admin {
    List<Refund> Refunds= new ArrayList();
    Discounter D ;
    public void showRefundList(){
        for (Refund x : Refunds){
            x.refundInfo();
        }
    }
    public void acceptRefund(Refund r){
        r.setRefundStatus("accepted");
    }
    public void rejectRefund(Refund r){
        r.setRefundStatus("rejected");
    }
}
