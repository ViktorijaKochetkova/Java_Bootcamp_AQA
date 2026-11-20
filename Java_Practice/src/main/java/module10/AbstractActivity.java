package module10;

/**
 * This class creates employee and student objects
 * It calls introduce method for both
 */

public class AbstractActivity {

    /**
     * Creates an employee and a student
     * Prints their information
     * @param args command line arguments
     */

    public void main(String[] args) {

        Employee employee = new Employee("Chandan", 35, "QAr", "Accenture", 5000);

        employee.introduce();

        System.out.println("-------------------------");

        Students student = new Students();

        student.setName("Viktorija");
        student.setAge(21);
        student.setSchoolName("Riga University");

        student.introduce();
    }
}
