package module10;

/**
 * This abstract class stores information about a person
 * It is used by Employee and Students classes
 */
public abstract class Person {

    private String name;
    private int age;

    /**
     * Returns the person`s name
     * @return person name
     */
    public String getName() {
        return name;
    }

    /**
     * Sets the person`s name
     * @param name new person name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * Returns the person`s age
     * @return person age
     */
    public int getAge() {
        return age;
    }

    /**
     * Sets the person`s age
     * @param age new person age
     */
    public void setAge(int age) {
        this.age = age;
    }

    /**
     * Prints information about the person
     */
    public void introduce() {
        System.out.println("My name is " + name + " I am " + age + " years old");
    }
}
