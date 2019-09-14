import java.util.ArrayList;
import java.util.List;
import java.util.NoSuchElementException;
import java.text.DecimalFormat;

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

    //if there is a tie, it keeps the cheapest vehicle FIRST found.
    public Vehicle findCheapestVehicle() {
        if(this.size == 0) throw new NoSuchElementException("No vehicles to compare prices of.");
        Vehicle cheapest = new Vehicle("Cheapest", "Cheapest", 9999, "2WD", 999999999, 0);
        for (Vehicle v : vehicleInventory) {
            if(v.getRetailPrice() < cheapest.getRetailPrice()){
            cheapest = v;
            }
        }
        return cheapest;
        }

    //if there is a tie, it keeps the most expensive vehicle FIRST found.
        public Vehicle findMostExpensiveVehicle () {
            if(this.size == 0) throw new NoSuchElementException("No vehicles to compare prices of.");
            Vehicle expensive = new Vehicle("Cheapest", "Cheapest", 9999, "2WD", -1, 0);
            for (Vehicle v : vehicleInventory) {
                if(v.getRetailPrice() > expensive.getRetailPrice()){
                    expensive = v;
                }
            }
            return expensive;
        }

        public void printAveragePriceOfAllVehicles () {
            System.out.println("The average price is: $" + calculateAvg());
        }
        public boolean contains(Vehicle o){
        for(Vehicle v : vehicleInventory){
            if(v.equals(o)) return true;
        }
        return false;
        }

        //helpers:

    public double calculateAvg(){
        DecimalFormat numberFormat = new DecimalFormat("#.00");
        int totalCost = 0;
        for(Vehicle v : vehicleInventory){
            totalCost += v.getRetailPrice();
        }
        return (double)totalCost/this.size;
    }
}