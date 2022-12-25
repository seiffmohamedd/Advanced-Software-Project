package Form.Fields;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class DropDownField extends Field {
    List<String> contents=new ArrayList<>();
    
    public DropDownField(String title) {
		super(title);
	}
	public void setTitle(String title){
        Title=title;
    }
    public void editContent(){
        Scanner n = new Scanner(System.in);
        System.out.println("enter the number of contents");
        int numOfContents = n.nextInt();
        for (int i = 0; i < numOfContents; i++) {
            addContent(n.next());
        }

    }
    public void addContent(String c){
        contents.add(c);
    }
    public String display(){
        System.out.println(name);
        for (String content : contents){
            System.out.print(content + " ");
        }
    }
}
