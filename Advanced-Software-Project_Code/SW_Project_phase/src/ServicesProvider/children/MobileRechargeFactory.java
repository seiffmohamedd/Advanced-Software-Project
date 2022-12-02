package ServicesProvider.children;

import Services.Service;
import Services.children.MobileRecharge;
import ServicesProvider.ServiceProviderFactory;

public class MobileRechargeFactory implements ServiceProviderFactory {
    Service mobile ;
    public Service CreateService(){
        mobile = new MobileRecharge();
        return mobile;
    }
}
