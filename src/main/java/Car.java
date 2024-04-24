public class Car extends Vehicle{
    private int numberOfDoors;

    public Car() {
        super();
    }

    public Car(String manufacturer, String model, int yearOfManufacture, int numberOfDoors) {
        super(manufacturer, model, yearOfManufacture);
        this.numberOfDoors = numberOfDoors;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", manufacturer='" + manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
