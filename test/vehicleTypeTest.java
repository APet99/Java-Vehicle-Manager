import org.junit.Test;

import java.lang.reflect.Array;

import static org.junit.Assert.*;

public class vehicleTypeTest {

    @Test
    public void testArrayOfMultipleObjects(){
        //Arrange
        Vehicle[] vehicleArray = new Vehicle[15];


        //Act
        vehicleArray[1] = new Vehicle();
        vehicleArray[2] = new Vehicle("Ford", "Focus", 2005, "2WD", 4600, 17);

        vehicleArray[3] = new Car();
        vehicleArray[4] = new Car(true);
        vehicleArray[5] = new Car("Toyota", "Corolla", 1999, "2WD", 1750, 11, false);

        vehicleArray[6] = new Truck();
        vehicleArray[7] = new Truck(true, 4);
        vehicleArray[8] = new Truck("Ford", "F-150", 2016, "4WD", 11600, 9, true, 7);


        //Assert: The array contains an object of vehicle, car, and truck.
        assertEquals(Vehicle.class, vehicleArray[1].getClass());
        assertEquals(Car.class, vehicleArray[3].getClass());
        assertEquals(Truck.class, vehicleArray[6].getClass());
    }


}
