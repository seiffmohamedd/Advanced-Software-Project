package ServicesProvider.children;

import Services.Service;
import Services.children.InternetPayment;
import ServicesProvider.ServiceProviderFactory;

public class InternetPaymentFactory implements ServiceProviderFactory {
    Service internet;
    public Service CreateService(){
        internet  =new InternetPayment();
        return internet;
    }
}
