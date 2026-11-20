package module10;

    /**
     * This class stores information about a student
     * It extends the Person class
     */

public class Students extends Person {

    private String schoolName;

        /**
         * Returns the school name
         * @return school name
         */
    public String getSchoolName() {
        return schoolName;
    }

        /**
         * Sets the school name
         * @param schoolName new school name
         */
    public void setSchoolName(String schoolName) {
        this.schoolName = schoolName;
    }

        /**
         * Prints student information
         */
    @Override
    public void introduce() {
        super.introduce();
        System.out.println("I am study in university " + schoolName);
    }
}
