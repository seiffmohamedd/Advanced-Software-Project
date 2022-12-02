package Admination;
import Services.Service;
import Services.children.Donations;
import Services.observer;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public interface SubjectDiscounter {
    List<observer> observers = new ArrayList<observer>();
    void addService(Service s);
    void notification();
}
