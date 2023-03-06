package good.test;

import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class TestBusinessController {

    BusinessController businessController;
    @Before
    public void init(){
        Business business = new Business();
        businessController = new BusinessController(business);
        businessController.generateAllEmployees();
    }

    @Test
    public void testListEmployeeHasNine(){
        int listSize = 9;
        assertEquals(listSize,businessController.getBusiness().size());
    }

    @Test
    public void testListEmployeeHasRoleAdmin(){
        List<Employee> admins = new ArrayList<>();
        for (Employee e: businessController.getBusiness().getEmployees()) {
            if (e.get_role().equals("Admin"))
                admins.add(e);
        }
        assertEquals(admins,businessController.getBusiness().getEmployeeForRole("Admin"));
    }

    @Test
    public void testTotalPayrollInBusiness(){
        double totalSalary = 0;
        for (int i = 0; i < 9; i++) {
            totalSalary += i*10000;
        }
        double totalReal = businessController.getBusiness().getTotalPayroll();
        assertEquals(totalSalary,totalReal,0.1);
    }

}
