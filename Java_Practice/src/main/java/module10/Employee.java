package module10;

import java.util.List;

/**
 * This class stores information about an employee
 * It extends the Person class
 */

public class Employee extends Person {

    private String jobTitle;
    private String company;
    private double salary;

    /**
     * Creates an employee without information
     */
    public Employee(){
    }

    /**
     *Creates an employee with information
     * @param name employee name
     * @param age employee age
     * @param jobTitle employee job title
     * @param company company name
     * @param salary employee salary
     */
    public Employee(String name, int age, String jobTitle, String company, double salary) {

        setName(name);
        setAge(age);
        this.jobTitle = jobTitle;
        this.company = company;
        this.salary = salary;
    }

    /**
     * Returns the employee job title
     * @return job title
     */
    public String getJobTitle() {
        return jobTitle;
    }

    /**
     * Sets the employee job title
     * @param jobTitle new job title
     */
    public void setJobTitle(String jobTitle) {
        this.jobTitle = jobTitle;
    }

    /**
     * Returns the company name
     * @return company name
     */
    public String getCompany() {
        return company;
    }

    /**
     * Sets the company name
     * @param company new company name
     */
    public void setCompany(String company) {
        this.company = company;
    }

    /**
     * Returns the employee salary
     * @return employee salary
     */
    public double getSalary() {
        return salary;
    }

    /**
     * Sets the employee salary
     * @param salary new salary
     */
    public void setSalary(double salary) {
        this.salary = salary;
    }

    /**
     * Prints employee information
     */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am work as " + jobTitle + " in " + company + " and my salary is " + salary);
    }

    /**
     * Finds the employee with the highest salary
     * @param empList list of employees
     * @return name of the highest paid employee
     */
    public static String getHighestPaidEmp(List<Employee> empList) {

        if (empList == null || empList.isEmpty()) {
            return "No employees";
        }

        Employee highest = empList.get(0);

        for (Employee emp : empList) {
            if (emp.getSalary() > highest.getSalary()) {
                highest = emp;
            }
        }

        return highest.getName();
    }
}
