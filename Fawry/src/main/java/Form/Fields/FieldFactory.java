package Form.Fields;

public class FieldFactory {
	Field field ;
	
	public Field createField(char type,String description) {
		if(type == '0') {
			field = new DropDownField(description);
		}
		else{
			field = new TextField(description);
		}
		return field;
	}
}
