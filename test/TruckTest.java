import org.junit.Test;

import static org.junit.Assert.*;

public class TruckTest {

    @Test
    public void testConstructor(){
        Truck t = new Truck();

        assertEquals(Truck.class, t.getClass());
        assertEquals("Unknown", t.getMake());
        assertEquals("Unknown", t.getModel());
        assertEquals(0000, t.getModelYear());
        assertEquals("Unknown", t.getDriveType());
        assertEquals(-1, t.getRetailPrice());
        assertEquals(-1, t.getMilesPerGal());
        assertEquals(0, t.getTowCapacity());
        assertFalse(t.hasSideStep());
    }

    @Test
    public void testConstructor2(){
        Truck t = new Truck(true, 15);

        assertEquals(Truck.class, t.getClass());
        assertEquals("Unknown", t.getMake());
        assertEquals("Unknown", t.getModel());
        assertEquals(0000, t.getModelYear());
        assertEquals("Unknown", t.getDriveType());
        assertEquals(-1, t.getRetailPrice());
        assertEquals(-1, t.getMilesPerGal());
        assertTrue(t.hasSideStep());
        assertEquals(15, t.getTowCapacity());
    }

    @Test
    public void testConstructor3(){
        Truck t = new Truck("Toyota", "Prius", 2009, "2WD", 5000, 45, false, 14);

        assertEquals(Truck.class, t.getClass());
        assertEquals("Toyota", t.getMake());
        assertEquals("Prius", t.getModel());
        assertEquals(2009, t.getModelYear());
        assertEquals("2WD", t.getDriveType());
        assertEquals(5000, t.getRetailPrice());
        assertEquals(45, t.getMilesPerGal());
        assertFalse(t.hasSideStep());
        assertEquals(14, t.getTowCapacity());
    }

    @Test
    public void testSetAndGet(){
        Truck t = new Truck("Toyota", "Prius", 2009, "2WD", 5000, 45, false, 25);

        t.setHasSideStep(true);
        t.setTowCapacity(5);

        assertTrue(t.hasSideStep());
        assertEquals(5, t.getTowCapacity());
    }

    @Test
    public void testToString(){
        Truck t = new Truck("Toyota", "Prius", 2009, "2WD", 5000, 45, false, 5);
        String expected =  "2009 Toyota Prius\n2WD\n$5000\n45MPG\nHas side step: false\nTow up to 5 tons";

        assertEquals(expected, t.toString());
    }
}
