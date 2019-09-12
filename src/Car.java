public class Car extends Vehicle {
    private boolean isConvertible;

    //Constructors:
    public Car() {
        super();
        isConvertible = false;
    }

    public Car(boolean isConvertible) {
        super();
        this.isConvertible = isConvertible;
    }

    public Car(String make, String model, int modelYear, String driveType, int retailPrice, int milesPerGal, boolean isConvertible) {
        super(make, model, modelYear, driveType, retailPrice, milesPerGal);
        this.isConvertible = isConvertible;
    }

    //getters:
    public boolean isConvertible() {
        return isConvertible;
    }

    //setters:
    public void setConvertible(boolean convertible) {
        isConvertible = convertible;
    }

    //override of printVehicle HERE

    @Override
    public String toString() {
        return super.toString() + "\n" + "Is convertible: " + isConvertible();
    }
}
