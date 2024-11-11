public class NonSubscribersPassengers  extends Passenger{

    private boolean hasDiscountCoupon;

    public NonSubscribersPassengers(String name, String id, boolean hasDiscountCoupon) {
        super(name, id);
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    public boolean isHasDiscountCoupon() {
        return hasDiscountCoupon;
    }

    public void setHasDiscountCoupon(boolean hasDiscountCoupon) {
        this.hasDiscountCoupon = hasDiscountCoupon;
    }

    @Override
    public void reserveCar(Car car) throws Exception {
        if (car.reserveSeat()) {
            reservedCar = car;
            if (hasDiscountCoupon) {
                tripCost = car.getRoute().getPrice() * 0.9;
            } else {
                tripCost = car.getRoute().getPrice();
            }
        }
    }
}
