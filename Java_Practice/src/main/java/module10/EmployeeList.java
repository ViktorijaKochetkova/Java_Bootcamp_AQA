package module10;

import java.util.ArrayList;
import java.util.List;

/**
 * Creates a list of employees and finds the highest salary.
 */
public class EmployeeList {

    /**
     * Creates five employees and adds them to a list
     * Prints the name of the employee with the highest salary
     * @param args command line arguments
     */
    public static void main(String[] args) {

        Employee emp1 = new Employee("Elza", 29, "QA Analyst", "Juniper Systems", 3285.50);
        Employee emp2 = new Employee("Rihards", 34, "Api Support Engineer", "Copperlane Tech", 41000);
        Employee emp3 = new Employee("Marta", 27, "Payroll Specialist", "Orion office", 3500);
        Employee emp4 = new Employee("Toms", 41,"Integration Tester", "Armagedon", 5000);
        Employee emp5 = new Employee("Liene", 31, "Project Manager", "Baltic view", 2000);

        List<Employee> empList = new ArrayList<>();

        empList.add(emp1);
        empList.add(emp2);
        empList.add(emp3);
        empList.add(emp4);
        empList.add(emp5);

        System.out.println("The Employee whose salary is the highest is : " + Employee.getHighestPaidEmp(empList));
    }
}
