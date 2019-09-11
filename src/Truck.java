public class Truck extends Vehicle {
    private boolean hasSideStep;
    private int towCapacity;

    //Constructors:
    public Truck() {
        super();
        hasSideStep = false;
        towCapacity = 0;
    }

    public Truck(boolean hasSideStep, int towCapacity) {
        super();
        this.hasSideStep = hasSideStep;
        this.towCapacity = towCapacity;
    }

    public Truck(String make, String model, int modelYear, String driveType, int retailPrice, int milesPerGal, boolean hasSideStep, int towCapacity) {
        super(make, model, modelYear, driveType, retailPrice, milesPerGal);
        this.hasSideStep = hasSideStep;
        this.towCapacity = towCapacity;
    }


    public boolean isHasSideStep() {
        return hasSideStep;
    }

    public void setHasSideStep(boolean hasSideStep) {
        this.hasSideStep = hasSideStep;
    }

    public int getTowCapacity() {
        return towCapacity;
    }

    public void setTowCapacity(int towCapacity) {
        this.towCapacity = towCapacity;
    }

    @Override
    public String printVehicle() {
        return super.printVehicle() + "\n" + "Has side step: " + hasSideStep
                + "\n" + "Tow up to " + getTowCapacity() + "tons";
    }
}

