package bad.src;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Business.
 */
public class Business {

    /**
     * The Employee list.
     */
    List<Employee> employeeList;

    private double totalPayroll;

    /**
     * Instantiates a new Business.
     */
    public Business() {
        totalPayroll = 0;
        employeeList = new ArrayList<>();
        all();
    }

    public void all(){
        for (int i = 0; i < 9; i++) {
            employeeList.add(new Employee(i,"Name"+i,generateRole(i),i*10000));
        }
        for (Employee e:employeeList) {
            totalPayroll += e.getSalary();
        }
    }

    public List<Employee> getAdminEmployee(){
        List<Employee> employees = new ArrayList<>();
        for (Employee e:employeeList) {
            if (e.get_role().equals("Admin"))
                employees.add(e);
        }
        return employees;
    }

    public List<Employee> getMarketEmployee(){
        List<Employee> employees = new ArrayList<>();
        for (Employee e:employeeList) {
            if (e.get_role().equals("Marketing"))
                employees.add(e);
        }
        return employees;
    }

    public List<Employee> getWorkerEmployee(){
        List<Employee> employees = new ArrayList<>();
        for (Employee e:employeeList) {
            if (e.get_role().equals("worker"))
                employees.add(e);
        }
        return employees;
    }

    public String generateRole(int index){
        switch (index) {
            case 0, 1, 2 -> {
                return "Admin";
            }
            case 3,4,5 -> {
                return "Marketing";
            }
            case 6,7,8 -> {
                return "worker";
            }
            default -> {
                return "None";
            }
        }
    }


    /**
     * Print employees.
     */
    public void printEmployees(){
        StringBuilder forrmaterEmployees = new StringBuilder();
        for (Employee e:employeeList) {
            forrmaterEmployees.append(e.toString()).append("\n");
        }
        System.out.println(forrmaterEmployees);
    }

    public double getTotalPayroll() {
        return totalPayroll;
    }

    public void setTotalPayroll(double totalPayroll) {
        this.totalPayroll = totalPayroll;
    }

    public List<Employee> getEmployeeList() {
        return employeeList;
    }

    public void setEmployeeList(List<Employee> employeeList) {
        this.employeeList = employeeList;
    }
}
