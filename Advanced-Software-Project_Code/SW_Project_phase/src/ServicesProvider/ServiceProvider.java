package ServicesProvider;

import Form.FormComponent;
import Services.Service;

public class ServiceProvider {
    Service s ;
    FormComponent f ;
    public Service providedService(){
        return s ;
    }
    public FormComponent serviceForm (){
        return f ;
    }
}
