package Form;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

import Form.Fields.*;
public class form implements FormComponent{
    List <Field> componentList = new ArrayList<>();
    String name ;
    public void setName(String n){
        name = n;
    }
    public void addComponent(Field C){
        componentList.add(C);
    }
    public String display(){
        String responseMsg = "";
    	for (Field C : componentList){
    		responseMsg+= C.display() + " ";
    	}
    	return responseMsg;
    }
}
