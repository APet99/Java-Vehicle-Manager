import org.junit.Test;
import java.util.List;
import java.util.NoSuchElementException;

import static org.junit.Assert.*;
public class InventoryTest {

    private Vehicle testVehicle1;
    private Car testVehicle2;
    private Truck testVehicle3;
    protected Inventory makeInv(){
        Inventory inv = new Inventory();
        testVehicle1 = new Vehicle("Ford", "Focus", 2005, "2WD", 4600, 17);
        testVehicle2 = new Car("Toyota", "Corolla", 1999, "2WD", 37500, 11, false);
        testVehicle3 = new Truck("Ford", "F-150", 2016, "4WD", 11600, 9, true, 7);
        inv.add(testVehicle1);
        inv.add(testVehicle2);
        inv.add(testVehicle3);
        return inv;
    }
    @Test
    public void testListAdd(){
        //Arrange:
        Inventory inv = makeInv();
        Vehicle v1 = new Vehicle("Honda", "Civic", 2003, "2WD", 3700, 10);

        //Act:
        inv.add(v1);

        //Assert:
        assertTrue(inv.contains(v1));
    }

    @Test(timeout = 1000)
    public void testAddMultiple(){
        //Arrange:
        Inventory inv = makeInv();  //creates 3 vehicles and adds them to the list

        //Act:
        for(int i = 0; i < 10000000; i++){ //3 previous vehicles, and 10000000 iterations should have a size of 10000003.
            inv.add(new Vehicle("Make", "Model", i, "4WD", i * 10, i));
        }

        //Assert:
        assertEquals(10000003, inv.getSize());
    }

    @Test
    public void testAddNull(){
        //Arrange:
        Inventory inv = makeInv();

        //Act and Asset is implied:
        try{
            inv.add(null);
        }catch(NoSuchElementException e){
            //do nothing
        }
    }

    @Test
    public void testRemove(){
        Inventory inv = makeInv();
        Vehicle v1 = new Vehicle("Honda", "Civic", 2003, "2WD", 3700, 10);

        inv.add(v1);
        assertTrue(inv.contains(v1));

        inv.remove(v1);
        assertFalse(inv.contains(v1));
    }

    @Test
    public void testRemoveFromEmpty(){
        Inventory inv = new Inventory();
        Vehicle v1 = new Vehicle("Honda", "Civic", 2003, "2WD", 3700, 10);
        try{
            inv.remove(v1);
        }catch (NoSuchElementException e){
            //do nothing
        }
    }

    @Test
    public void testRemoveSizeDecrament(){
        Inventory inv = makeInv();
        assertEquals(3, inv.getSize());

        inv.remove(testVehicle1);
        assertEquals(2, inv.getSize());
    }

    @Test
    public void testRemoveFinalElement(){
        Inventory inv = makeInv();
        inv.remove(testVehicle1);
        inv.remove(testVehicle2);
        inv.remove(testVehicle3);

        assertEquals(0, inv.getSize());
    }

    @Test
    public void testGetCheapest(){
        Inventory inv = makeInv();
        Vehicle result = inv.findCheapestVehicle();

        assertEquals(testVehicle1, result);
    }

    @Test
    public void testGetCheapestAllSamePrice(){
        Inventory inv = makeInv();
        testVehicle1.setRetailPrice( 500);
        testVehicle2.setRetailPrice( 500);
        testVehicle3.setRetailPrice( 500);

        Vehicle result = inv.findCheapestVehicle();
        assertEquals(testVehicle1, result);
    }

    @Test
    public void testGetCheapestException(){
        Inventory inv = new Inventory();

        try{
            inv.findCheapestVehicle();
        }catch(NoSuchElementException e){
            //do nothing
        }
    }

    @Test
    public void testGetExpensive(){
        Inventory inv = makeInv();
        Vehicle result = inv.findMostExpensiveVehicle();

        assertEquals(testVehicle2, result);
    }

    @Test
    public void testGetExpensiveAllSamePrice(){
        Inventory inv = makeInv();
        testVehicle1.setRetailPrice( 500);
        testVehicle2.setRetailPrice( 500);
        testVehicle3.setRetailPrice( 500);

        Vehicle result = inv.findMostExpensiveVehicle();
        assertEquals(testVehicle1, result);
    }

    @Test
    public void testGetExpensiveException(){
        Inventory inv = new Inventory();

        try{
            inv.findMostExpensiveVehicle();
        }catch(NoSuchElementException e){
            //do nothing
        }
    }

    // FIXME: 9/13/2019
    @Test
    public void testPrintAvgCost(){
        Inventory inv = makeInv();
        double avg = 17900;
        assertEquals(avg, inv.calculateAvg(), .01);
    }

    @Test
    public void testContainsPositive(){
        Inventory inv = makeInv();

        assertTrue(inv.contains(testVehicle1));
    }

    @Test
    public void testContainsNegative(){
        Inventory inv = new Inventory();

        assertFalse(inv.contains(testVehicle1));
    }

    @Test
    public void testContainsNull(){
        Inventory inv = makeInv();

        assertFalse(inv.contains(null));
    }
    @Test
    public void testSize(){
        Inventory inv = makeInv();
        inv.setSize(50);

        assertEquals(50, inv.getSize());
    }
}
