package good.src;

import java.util.ArrayList;
import java.util.List;

/**
 * The type Business.
 */
public class Business {

    private List<Employee> employees;
    private Finance finance;


    /**
     * Instantiates a new Business.
     */
    public Business(){
        employees = new ArrayList<>();
        finance = new Finance();
    }

    /**
     * Create employee.
     *
     * @param id     the id
     * @param name   the name
     * @param role   the role
     * @param salary the salary
     * @return the employee
     */
    public Employee create(int id, String name, String role, double salary){
        return new Employee(id,name,role,salary);
    }

    /**
     * Add employee.
     *
     * @param employee the employee
     */
    public void addEmployee(Employee employee){
        this.employees.add(employee);
    }

    /**
     * Generate random employee.
     *
     * @param index the index
     */
    public void generateRandomEmployee(int index){
        addEmployee(create(index,"name"+index,generateRole(index),index*10000));
    }

    /**
     * Get employee for role list.
     *
     * @param role the role
     * @return the list
     */
    public List<Employee> getEmployeeForRole(String role){
        List<Employee> newEmployee = new ArrayList<>();
        for (Employee employee: employees) {
            if (employee.get_role().equals(role))
                newEmployee.add(employee);
        }
        return newEmployee;
    }

    /**
     * Get total payroll double.
     *
     * @return the double
     */
    public double getTotalPayroll(){
        return finance.getTotalPayroll(employees);
    }

    /**
     * Size int.
     *
     * @return the int
     */
    public int size(){
        return employees.size();
    }

    /**
     * Generate role string.
     *
     * @param index the index
     * @return the string
     */
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
     * Gets employees.
     *
     * @return the employees
     */
    public List<Employee> getEmployees() {
        return employees;
    }
}
