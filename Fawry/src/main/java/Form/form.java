package Form;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import Form.Fields.*;
public class form implements FormComponent{
    List <FormComponent> componentList = new ArrayList<>();
    String name ;
    public void setName(String n){
        name = n;
    }
    public void addComponent(FormComponent C){
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
