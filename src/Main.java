public class Main {
    public static void main(String[] args) {
        // write your code here
        Car car1 = new Car("Toyota", "Prius", 2009, "2WD", 5000, 45, false);
        Vehicle.printVehicle(car1.toString());


        System.out.println();
        System.out.println();

        Truck truck1 = new Truck(true, 10);
        Vehicle.printVehicle(truck1.toString());
    }
}
