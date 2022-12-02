package Admination;

import Services.Service;
import Services.observer;

import java.util.ArrayList;
import java.util.List;

public class Discounter implements SubjectDiscounter{
    List<Service> Services= new ArrayList();
    public void addService(Service s){
        Services.add(s);
        notification();
    }
    public void notification(){
        for (observer o : observers){
            o.update();
        }
    }
}
