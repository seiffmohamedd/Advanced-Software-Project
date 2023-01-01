package Form.Fields;

import Form.FormComponent;

public abstract class Field implements FormComponent {
    String Title ;
    String name ;
    Field(String title){
    	Title = title;
    }
    public void setTitle(String title){}

    public void setName(String n) {
        name = n;
    }

    public void editContent(){}
    public String display(){return null;}
}
