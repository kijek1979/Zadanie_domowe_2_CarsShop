import java.time.LocalDate;

public class Car {

    private CarType carType;
    private CarBrand carBrand;
    private String carModel;
    private double fuelUsage;
    private double engineCapacity;
    private int carSits;
    private int enginePower;
    private LocalDate carProduceDate;
    private boolean isAutomat;
    private DriveType driveType;

    public Car(CarType carType, CarBrand carBrand, String carModel, double fuelUsage, double engineCapacity, int carSits,
               int enginePower, LocalDate carProduceDate, boolean isAutomat, DriveType driveType) {
        this.carType = carType;
        this.carBrand = carBrand;
        this.carModel = carModel;
        this.fuelUsage = fuelUsage;
        this.engineCapacity = engineCapacity;
        this.carSits = carSits;
        this.enginePower = enginePower;
        this.carProduceDate = carProduceDate;
        this.isAutomat = isAutomat;
        this.driveType = driveType;
    }

    public Car() {
    }

    @Override
    public String toString() {
        return "Car{" +
                "carType=" + carType +
                ", carBrand=" + carBrand +
                ", carModel='" + carModel + '\'' +
                ", fuelUsage=" + fuelUsage +
                ", engineCapacity=" + engineCapacity +
                ", carSits=" + carSits +
                ", enginePower=" + enginePower +
                ", carProduceDate=" + carProduceDate +
                ", isAutomat=" + isAutomat +
                ", driveType=" + driveType +
                '}';
    }

    public CarType getCarType() {
        return carType;
    }

    public void setCarType(CarType carType) {
        this.carType = carType;
    }

    public CarBrand getCarBrand() {
        return carBrand;
    }

    public void setCarBrand(CarBrand carBrand) {
        this.carBrand = carBrand;
    }

    public String getCarModel() {
        return carModel;
    }

    public void setCarModel(String carModel) {
        this.carModel = carModel;
    }

    public double getFuelUsage() {
        return fuelUsage;
    }

    public void setFuelUsage(double fuelUsage) {
        this.fuelUsage = fuelUsage;
    }

    public double getEngineCapacity() {
        return engineCapacity;
    }

    public void setEngineCapacity(double engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    public int getCarSits() {
        return carSits;
    }

    public void setCarSits(int carSits) {
        this.carSits = carSits;
    }

    public int getEnginePower() {
        return enginePower;
    }

    public void setEnginePower(int enginePower) {
        this.enginePower = enginePower;
    }

    public LocalDate getCarProduceDate() {
        return carProduceDate;
    }

    public void setCarProduceDate(LocalDate carProduceDate) {
        this.carProduceDate = carProduceDate;
    }

    public boolean isAutomat() {
        return isAutomat;
    }

    public void setAutomat(boolean automat) {
        isAutomat = automat;
    }

    public DriveType getDriveType() {
        return driveType;
    }

    public void setDriveType(DriveType driveType) {
        this.driveType = driveType;
    }
}
