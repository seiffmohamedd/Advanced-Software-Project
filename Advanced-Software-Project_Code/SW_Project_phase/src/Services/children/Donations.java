package Services.children;

import Services.Service;
import Services.observer;

public class Donations extends Service implements observer {
    Service category;

    public void setCategory(Service category) {
        this.category = category;
    }

    public Service getCategory() {
        return category;
    }
    public void update(){
    }
}
