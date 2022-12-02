package Form.Fields;

import Form.Fields.Field;

import java.awt.*;
import java.util.ArrayList;
import java.util.List;

public class DropDownField extends Field {
    List<String> contents=new ArrayList<>();
    public void setTitle(String title){
        Title=title;
    }
    public void editContent(){}
    public void addContent(String c){
        contents.add(c);
    }
}
