public class Car extends Vehicle{
    private int numberOfDoors;

    public Car() {
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
