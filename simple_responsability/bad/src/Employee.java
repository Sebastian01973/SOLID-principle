package bad.src;

/**
 * The type Employee.
 */
public class Employee {

    private int id_employee;
    private String name;
    private String role;
    private double salary;

    @Override
    public String toString() {
        return "Employee{" +
                "id_employee=" + id_employee +
                ", name='" + name + '\'' +
                ", last_name='" + role + '\'' +
                ", salary=" + salary +
                '}';
    }

    /**
     * Instantiates a new Employee.
     *
     * @param id_employee the id employee
     * @param name        the name
     * @param role   the last name
     * @param salary      the salary
     */
    public Employee(int id_employee, String name, String role, double salary) {
        this.id_employee = id_employee;
        this.name = name;
        this.role = role;
        this.salary = salary;
    }

    /**
     * Gets id employee.
     *
     * @return the id employee
     */
    public int getId_employee() {
        return id_employee;
    }

    /**
     * Sets id employee.
     *
     * @param id_employee the id employee
     */
    public void setId_employee(int id_employee) {
        this.id_employee = id_employee;
    }

    /**
     * Gets name.
     *
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets name.
     *
     * @param name the name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Gets last name.
     *
     * @return the last name
     */
    public String get_role() {
        return role;
    }

    /**
     * Sets last name.
     *
     * @param role the last name
     */
    public void setRole(String role) {
        this.role = role;
    }

    /**
     * Gets salary.
     *
     * @return the salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets salary.
     *
     * @param salary the salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }
}
