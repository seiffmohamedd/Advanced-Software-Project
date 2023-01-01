package Form.Fields;

import java.util.Scanner;

public class TextField extends Field {
    String content;
    public void setTitle(String title){
        Title=title;
    }
    public void editContent(){
        Scanner n = new Scanner(System.in);
        content=n.nextLine();
    }
    public void display(){
        System.out.println(name);
        System.out.println(content);
    }

    public String getContent() {
        return content;
    }
}
