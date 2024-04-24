public class Motorcycle extends Vehicle {

    protected boolean hasPedals;
    protected String type;

    public Motorcycle() {

    }

    public Motorcycle(String manufacturer, String model, int yearOfManufacture, boolean hasPedals, String type) {
        super(manufacturer, model, yearOfManufacture);
        this.hasPedals = hasPedals;
        this.type = type;
    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "hasPedals=" + hasPedals +
                ", type='" + type + '\'' +
                ", manufacturer='" + manufacturer + '\'' +
                ", Model='" + Model + '\'' +
                ", yearOfManufacture=" + yearOfManufacture +
                '}';
    }
}
