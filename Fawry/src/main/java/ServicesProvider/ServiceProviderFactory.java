package ServicesProvider;

import Services.Service;

public interface ServiceProviderFactory {
    ServiceProvider SP =new ServiceProvider();
    Service CreateService();
}
