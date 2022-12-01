package Services;

public class Donations extends Service{
    Service category;

    public void setCategory(Service category) {
        this.category = category;
    }

    public Service getCategory() {
        return category;
    }
}
