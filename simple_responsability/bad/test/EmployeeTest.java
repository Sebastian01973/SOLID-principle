package bad.test;

import bad.src.Business;
import bad.src.Employee;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertEquals;

public class EmployeeTest {

    private Business business;
    @Before
    public void init(){
        this.business = new Business();
    }
    @Test
    public void testListEmployeeHasNine(){
        int listSize = 9;
        assertEquals(listSize,business.getEmployeeList().size());
    }

    @Test
    public void testListEmployeeHasRoleAdmin(){
        List<Employee> admins = new ArrayList<>();
        for (Employee e: business.getEmployeeList()) {
            if (e.get_role().equals("Admin"))
                admins.add(e);
        }
        assertEquals(admins,business.getAdminEmployee());
    }

    @Test
    public void testListEmployeeHasRoleMarket(){
        List<Employee> market = new ArrayList<>();
        for (Employee e: business.getEmployeeList()) {
            if (e.get_role().equals("Marketing"))
                market.add(e);
        }
        assertEquals(market,business.getMarketEmployee());
    }

    @Test
    public void testListEmployeeHasRoleWorker(){
        List<Employee> worker = new ArrayList<>();
        for (Employee e: business.getEmployeeList()) {
            if (e.get_role().equals("worker"))
                worker.add(e);
        }
        assertEquals(worker,business.getWorkerEmployee());
    }

    @Test
    public void testTotalPayrollInBusiness(){
        double totalSalary = 0;
        for (int i = 0; i < 9; i++) {
            totalSalary += i*10000;
        }
        double totalReal = business.getTotalPayroll();
        assertEquals(totalSalary,totalReal,0.5);
    }

}
