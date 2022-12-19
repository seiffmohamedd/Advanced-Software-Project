package Form;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class form implements FormComponent{
    List<FormComponent> componentList = new ArrayList<>();
    String name ;
    void setName(String n){
        name = n;
    }
    void addComponent(FormComponent C){
        componentList.add(C);
    }
    public void display(){
        System.out.println(name);
        for (FormComponent C : componentList){
            C.display();
        }
        System.out.println("----------------");
    }
}
