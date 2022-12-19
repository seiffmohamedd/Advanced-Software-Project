package ServicesProvider.children;

import Services.Service;
import Services.children.Donations;
import ServicesProvider.ServiceProviderFactory;

public class DonationsFactory implements ServiceProviderFactory {
    Service Don;
    public Service CreateService(){
        Don = new Donations() ;
        return Don ;
    }
}
