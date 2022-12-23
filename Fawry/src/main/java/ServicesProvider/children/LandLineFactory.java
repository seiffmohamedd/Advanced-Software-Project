package ServicesProvider.children;

import Services.Service;
import Services.children.Landline;
import ServicesProvider.ServiceProviderFactory;

public class LandLineFactory implements ServiceProviderFactory {
    Service LL ;
    public Service CreateService(){
        LL= new Landline();
        return LL;
    }
}
