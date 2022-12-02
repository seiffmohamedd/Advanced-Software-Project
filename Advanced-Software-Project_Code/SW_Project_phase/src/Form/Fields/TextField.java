package Form.Fields;

import Form.Fields.Field;

public class TextField extends Field {
    String content;
    public void setTitle(String title){
        Title=title;
    }
    public void editContent(){
    }

    public void setContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
