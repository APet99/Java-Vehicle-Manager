public class Main {
    public static void main(String[] args) {
        // write your code here
        Car car1 = new Car("Toyota", "Prius", 2009, "2WD", 5000, 45, false);
        System.out.print(car1.printVehicle());


        System.out.println();
        System.out.println();


        Truck truck1 = new Truck(true, 10);
        System.out.println(truck1.printVehicle());
    }
}
