package module9;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;


import static org.junit.Assert.assertEquals;


public class PersonTest {

    private Person person;

    @Before
    public void setUp() throws Exception {
        person = new Person();
    }

    @After
    public void tearDown() throws Exception{
        person = null;
    }

    @Test
    public void testGettersandSetters() {

        person.setWeight(70);
        person.setHeight(1.75f);

        assertEquals(70, person.getWeight());
        assertEquals(1.75f, person.getHeight(), 0.001f);

    }
    
    @Test
    public void testGetBodyMassIndex() {

        assertEquals("Underweight", person.getBodyMassIndex(50,1.7));
        assertEquals("Normal weight", person.getBodyMassIndex(65, 1.7));
        assertEquals("Overweight", person.getBodyMassIndex(80, 1.7));
        assertEquals("Obese", person.getBodyMassIndex(100, 1.7));


        assertEquals("Invalid input", person.getBodyMassIndex(0, 1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(-5, 1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(601, 1.7));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 0));
        assertEquals("Invalid input", person.getBodyMassIndex(70, -1));
        assertEquals("Invalid input", person.getBodyMassIndex(70, 3.1));

        assertEquals("Normal weight", person.getBodyMassIndex(74, 2));
        assertEquals("Overweight", person.getBodyMassIndex(100, 2));
        assertEquals("Obese", person.getBodyMassIndex(120, 2));
        assertEquals("Obese", person.getBodyMassIndex(600, 2));
    }

}
