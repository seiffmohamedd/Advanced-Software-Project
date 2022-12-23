package ServicesProvider;

import Form.*;
import Services.Service;

public class ServiceProviderFactory {
    public ServiceProvider createServiceProvider(String name,Service service,long number,form formComponent) {
    	ServiceProvider serviceProvider = new ServiceProvider(name,service,number,formComponent);
    	return serviceProvider;
    }
}
