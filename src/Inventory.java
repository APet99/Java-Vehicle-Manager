import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;

public class Inventory {
    private List<Vehicle> vehicleInventory;
    private int size;

    public Inventory() {
        this.vehicleInventory = new ArrayList<>();
        this.size = 0;
    }

    public List<Vehicle> getVehicleInventory() {
        return vehicleInventory;
    }

    public void setVehicleInventory(List<Vehicle> vehicleInventory) {
        this.vehicleInventory = vehicleInventory;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public void add(Vehicle v) {
        if (v == null) throw new NoSuchElementException("ERROR:Invalid vehicle can not be added!");
        vehicleInventory.add(v);
        size++;
    }

    public void remove(Vehicle v) {
        if (v == null || this.size <= 0) throw new NoSuchElementException("ERROR: The list of vehicles is empty!");
        vehicleInventory.remove(v);
        size--;
    }

    public Vehicle findCheapestVehicle() {
        Vehicle cheapest = new Vehicle("Cheapest", "Cheapest", 9999, "2WD", 999999999, 0);
        for (Vehicle v : vehicleInventory) {
            if(v.getRetailPrice() < cheapest.getRetailPrice()){
            cheapest = v;
            }
        }
        return cheapest;
        }

        public Vehicle findMostExpensiveVehicle () {
            Vehicle expensive = new Vehicle("Cheapest", "Cheapest", 9999, "2WD", -1, 0);
            for (Vehicle v : vehicleInventory) {
                if(v.getRetailPrice() > expensive.getRetailPrice()){
                    expensive = v;
                }
            }
            return expensive;
        }

        public void printAveragePriceOfAllVehicles () {
        int totalCost = 0;
            for(Vehicle v : vehicleInventory){
                totalCost += v.getRetailPrice();
            }
            System.out.println("The average price is: $" + totalCost/size);
        }
}