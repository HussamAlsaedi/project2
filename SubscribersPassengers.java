public class SubscribersPassengers extends Passenger{

    public SubscribersPassengers(String name, String id) {
        super(name, id);
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.reserveSeat()) {
            reservedCar = car;
            tripCost = car.getRoute().getPrice() * 0.5;
        }
    }
}
