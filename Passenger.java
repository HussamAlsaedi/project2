public abstract class  Passenger {

    protected String name;
    protected String id;
    protected Car reservedCar;
    protected double tripCost;

    public Passenger(String name, String id) {
        this.name = name;
        this.id = id;
    }

    public abstract void reserveCar(Car car) throws Exception;

    public void displayInformation() {
        System.out.println("Name: " + name + ", ID: " + id);
        System.out.println("Car Code: " + reservedCar.getCode());
        System.out.println("Trip Cost: " + tripCost);
    }
}
