package good.src;

import java.util.ArrayList;
import java.util.List;

public class BusinessController {

    private Business business;

    public BusinessController(Business business) {
        this.business = business;
    }

    public void generateAllEmployees(){
        for (int i = 0; i < 9; i++) {
            business.generateRandomEmployee(i);
        }
    }

    public Business getBusiness() {
        return business;
    }

    public void setBusiness(Business business) {
        this.business = business;
    }
}
