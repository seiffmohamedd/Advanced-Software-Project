package Admination;

import Services.Service;

public class Discounter implements SubjectDiscounter{
    public void addService(Service s){
        Services.add(s);
    }

}
