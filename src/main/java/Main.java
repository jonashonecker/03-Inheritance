public class Main {
    public static void main(String[] args) {
        Vehicle myVehicle = new Vehicle("BMW", "X1", 2020);
        Car myCar = new Car("BMW", "X1", 2020, 5);
        Motorcycle myMotorcycle = new Motorcycle("Yamaha", "SR125", 2000, true, "Cruiser");
        System.out.println(myVehicle);
        System.out.println(myCar);
        System.out.println(myMotorcycle);
    }
}
