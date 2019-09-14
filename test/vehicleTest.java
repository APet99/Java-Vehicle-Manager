import org.junit.Test;
import static org.junit.Assert.*;

public class vehicleTest {


    @Test
    public void testConstructorAndGetMethods1(){
        Vehicle v = new Vehicle();

        assertEquals(Vehicle.class, v.getClass());
        assertEquals("Unknown", v.getMake());
        assertEquals("Unknown", v.getModel());
        assertEquals(0000, v.getModelYear());
        assertEquals("Unknown", v.getDriveType());
        assertEquals(-1, v.getRetailPrice());
        assertEquals(-1, v.getMilesPerGal());
    }

    @Test
    public void testConstructorAndGetMethods2(){
        Vehicle v = new Vehicle("Toyota", "Prius", 2009, "2WD", 5000, 45);

        assertEquals(Vehicle.class, v.getClass());
        assertEquals("Toyota", v.getMake());
        assertEquals("Prius", v.getModel());
        assertEquals(2009, v.getModelYear());
        assertEquals("2WD", v.getDriveType());
        assertEquals(5000, v.getRetailPrice());
        assertEquals(45, v.getMilesPerGal());
    }

    @Test
    public void testGetters(){
        Vehicle v = new Vehicle("Toyota", "Prius", 2009, "2WD", 5000, 45);

        v.setMake("Honda");
        v.setModel("Civic");
        v.setModelYear(1999);
        v.setDriveType("2WD");
        v.setRetailPrice(2700);
        v.setMilesPerGal(13);

        assertEquals("Honda", v.getMake());
        assertEquals("Civic", v.getModel());
        assertEquals(1999, v.getModelYear());
        assertEquals("2WD", v.getDriveType());
        assertEquals(2700, v.getRetailPrice());
        assertEquals(13, v.getMilesPerGal());
    }

    @Test
    public void testSetNull(){
        Vehicle v = new Vehicle("Toyota", "Prius", 2009, "2WD", 5000, 45);
        v.setModel(null);

        assertNull(v.getModel());
    }

    @Test
    public void testPrintVehicle(){
        Vehicle v = new Vehicle("Toyota", "Prius", 2009, "2WD", 5000, 45);
        String expected =  "2009 Toyota Prius\n2WD\n$5000\n45MPG";

        assertEquals(expected, v.toString());
    }

    @Test
    public void testPrintVehicleFail(){
        Vehicle v = new Vehicle("Honda", "Civic", 2009, "2WD", 5000, 45);
        String expected =  "2009 Toyota Prius\n2WD\n$5000\n45MPG";

        assertNotEquals(expected, v.toString());
    }

    @Test
    public void testEqualsPass(){
        Vehicle v = new Vehicle("Honda", "Civic", 2009, "2WD", 5000, 45);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2009, "2WD", 5000, 45);

        assertEquals(v, v2);
        assertTrue(v.equals(v2)); //compares
    }

    @Test
    public void testEqualsFail(){
        Vehicle v = new Vehicle("Unknown", "Civic", 1958, "2WD", 5000, 45);
        Vehicle v2 = new Vehicle("Honda", "Civic", 2009, "2WD", 5000, 45);

        assertNotEquals(v, v2);
        assertFalse(v.equals(v2)); //compares
    }

    @Test
    public void testEqualsDifferentObject(){
        Vehicle v = new Vehicle("Unknown", "Civic", 1958, "2WD", 5000, 45);
        Vehicle c = new Car("Unknown", "Civic", 1958, "2WD", 5000, 45, false);

        assertEquals(v, c);
        assertTrue(v.equals(c)); //compares
    }

    @Test
    public void testHash(){
        Vehicle v = new Vehicle("Unknown", "Civic", 1958, "2WD", 5000, 45);
        Vehicle v2 = new Vehicle("Unknown", "Civic", 1958, "2WD", 5000, 45);
        Vehicle c = new Car("Honda", "Civic", 1958, "2WD", 5000, 45, false);

        assertEquals(v.hashCode(), v2.hashCode());
        assertNotEquals(v.hashCode(), c.hashCode());
    }
}
