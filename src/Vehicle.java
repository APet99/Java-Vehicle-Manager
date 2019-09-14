public class Vehicle{
    private String make;
    private String model;
    private int modelYear;
    private String driveType;
    private int retailPrice;
    private int milesPerGal;


    //default constructor
    public Vehicle() {
        this.make = "Unknown";
        this.model = "Unknown";
        this.modelYear = 0000;
        this.driveType = "Unknown";
        this.retailPrice = -1;
        this.milesPerGal = -1;
    }

    public Vehicle(String make, String model, int modelYear, String driveType, int retailPrice, int milesPerGal) {
        this.make = make;
        this.model = model;
        this.modelYear = modelYear;
        this.driveType = driveType;
        this.retailPrice = retailPrice;
        this.milesPerGal = milesPerGal;
    }

    //getters
    public String getMake() {
        return make;
    }

    public String getModel() {
        return model;
    }

    public int getModelYear(){
        return modelYear;
    }

    public String getDriveType() {
        return driveType;
    }

    public int getRetailPrice() {
        return retailPrice;
    }

    public int getMilesPerGal() {
        return milesPerGal;
    }

    //setters
    public void setMake(String make) {
        this.make = make;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public void setModelYear(int modelYear){
        this.modelYear = modelYear;
    }

    public void setDriveType(String driveType) {
        this.driveType = driveType;
    }

    public void setRetailPrice(int retailPrice) {
        this.retailPrice = retailPrice;
    }

    public void setMilesPerGal(int milesPerGal) {
        this.milesPerGal = milesPerGal;
    }

    public String toString(){
        String vehiclePrintout = getModelYear() + " " + getMake() + " " + getModel() + "\n" +
                               getDriveType() + "\n" + "$" + getRetailPrice() + "\n" +
                                getMilesPerGal() + "MPG";
        return vehiclePrintout;
    }

    public static void printVehicle(String printOut){
        System.out.print(printOut);
    }


    @Override
    public int hashCode() {
        int result = 17;
        result = 31 * result + make.hashCode();
        result = 31 * result + modelYear;
        result = 31 * result + model.hashCode();
        return result;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj) return true;
        if(!(obj instanceof Vehicle)) return false;
        Vehicle v = (Vehicle) obj;

        return  this.make == v.make
                && this.model == v.model
                && this.modelYear == v.modelYear
                && this.driveType == v.driveType
                && this.retailPrice == v.retailPrice
                && this.milesPerGal == v.milesPerGal;
    }
}

