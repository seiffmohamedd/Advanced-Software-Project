package Form.Fields;

import java.util.Scanner;

public class TextField extends Field {
    String content;
    public TextField(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}
	public void setTitle(String title){
        Title=title;
    }
    public void editContent(){
        Scanner n = new Scanner(System.in);
        content=n.nextLine();
    }
    public String display(){
        return Title;
    }

    public String getContent() {
        return content;
    }
}
