import org.junit.Test;

import static org.junit.Assert.*;

public class vehicleTypeTest {
    private static Vehicle[] makeArray() {
        Vehicle[] vehicleArray = new Vehicle[3];

        vehicleArray[0] = new Vehicle("Ford", "Focus", 2005, "2WD", 4600, 17);
        vehicleArray[1] = new Car("Toyota", "Corolla", 1999, "2WD", 1750, 11, false);
        vehicleArray[2] = new Truck("Ford", "F-150", 2016, "4WD", 11600, 9, true, 7);

        return vehicleArray;
    }

    @Test
    public void testAddArray(){
        //Arrange:
        String output = "";
        String v ="Ford Focus";
        String c = "Toyota Corolla";
        String t = "Ford F-150";


        Vehicle[] vehicleArray = makeArray();

        //Act:
        for(Vehicle veh : vehicleArray){
            output += veh.toString();
        }

        //Assert:
        assertEquals(Vehicle.class, vehicleArray[0].getClass());        //checks the classes
        assertEquals(Car.class, vehicleArray[1].getClass());
        assertEquals(Truck.class, vehicleArray[2].getClass());

        assertTrue(output.contains(v));
        assertTrue(output.contains(c));
        assertTrue(output.contains(t));
    }
}
