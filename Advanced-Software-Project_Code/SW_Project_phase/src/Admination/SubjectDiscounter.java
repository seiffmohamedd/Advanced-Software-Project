package Admination;
import Services.Service;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;
public interface SubjectDiscounter {
    List<Service> Services= new ArrayList();
    void addService(Service s);
}
