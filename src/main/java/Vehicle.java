public class Vehicle {
    protected String manufacturer;
    protected String Model;
    protected int yearOfManufacture;

    public Vehicle() {
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "manufacturer='" + manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
