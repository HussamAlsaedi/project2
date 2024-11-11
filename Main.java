import java.util.*;

public class Main {
    public static void main(String[] args) throws Exception {

        try {

            Route route1 = new Route("Start A", "Destination A", 400.0);
            Route route2 = new Route("Start B", "Destination B", 150.0);

            Car car1 = new Car("CAR123", route1, 2,2);
            Car car2 = new Car("CAR456", route2, 0,2);

            Passenger[] passengers = new Passenger[2];
            passengers[0] = new SubscribersPassengers("Hussam", "ID-200");
            passengers[1] = new NonSubscribersPassengers("Alsaedi", "ID-2222", true);

            passengers[0].reserveCar(car1);
            passengers[1].reserveCar(car2);

            for (Passenger passenger : passengers) {
                passenger.displayInformation();
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }



    }
}