package good.src;

import java.util.List;

/**
 * The type Finance.
 */
public class Finance {

    /**
     * Get total payroll double.
     *
     * @param employees the employees
     * @return the double
     */
    public double getTotalPayroll(List<Employee> employees){
        double total = 0;
        for (Employee employee:employees) {
            total += employee.getSalary();
        }
        return total;
    }
}
