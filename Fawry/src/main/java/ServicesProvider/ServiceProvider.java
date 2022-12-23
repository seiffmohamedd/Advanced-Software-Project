package ServicesProvider;

import Discounts.Discount;
import Discounts.Overall;
import Form.*;
import Services.Service;

public class ServiceProvider {
    
	
    
	String name ;
    public Service s ;
    long number ;
    FormComponent f ;
    
    public ServiceProvider(String name, Service s, long number, form f) {
		this.name = name;
		this.s = s;
		this.number = number;
		this.f = f;
	}
    
    public Service providedService(){
        return s ;
    }
    public FormComponent serviceForm (){
        return f ;
    }
    public void setService(Service s) {
        this.s = s;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void setNumber(long number) {
        this.number = number;
    }
    public long getNumber() {
        return number;
    }
}
