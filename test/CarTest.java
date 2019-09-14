import org.junit.Test;

import static org.junit.Assert.*;

public class CarTest {
    @Test
    public void testConstructor(){
        Car c = new Car();

        assertEquals(Car.class, c.getClass());
        assertEquals("Unknown", c.getMake());
        assertEquals("Unknown", c.getModel());
        assertEquals(0000, c.getModelYear());
        assertEquals("Unknown", c.getDriveType());
        assertEquals(-1, c.getRetailPrice());
        assertEquals(-1, c.getMilesPerGal());
        assertFalse(c.isConvertible());
    }

    @Test
    public void testConstructor2(){
        Car c = new Car(true);

        assertEquals(Car.class, c.getClass());
        assertEquals("Unknown", c.getMake());
        assertEquals("Unknown", c.getModel());
        assertEquals(0000, c.getModelYear());
        assertEquals("Unknown", c.getDriveType());
        assertEquals(-1, c.getRetailPrice());
        assertEquals(-1, c.getMilesPerGal());
        assertTrue(c.isConvertible());
    }

    @Test
    public void testConstructor3(){
        Car c = new Car("Toyota", "Prius", 2009, "2WD", 5000, 45, false);

        assertEquals(Car.class, c.getClass());
        assertEquals("Toyota", c.getMake());
        assertEquals("Prius", c.getModel());
        assertEquals(2009, c.getModelYear());
        assertEquals("2WD", c.getDriveType());
        assertEquals(5000, c.getRetailPrice());
        assertEquals(45, c.getMilesPerGal());
        assertFalse(c.isConvertible());
    }

    @Test
    public void testSetAndGetConvertible(){
        Car c = new Car("Toyota", "Prius", 2009, "2WD", 5000, 45, false);
        assertFalse(c.isConvertible());

        c.setConvertible(true);
        assertTrue(c.isConvertible());
    }

    @Test
    public void testToString(){
        Car c = new Car("Toyota", "Prius", 2009, "2WD", 5000, 45, false);
        String expected =  "2009 Toyota Prius\n2WD\n$5000\n45MPG\nIs convertible: false";

        assertEquals(expected, c.toString());
    }
}
