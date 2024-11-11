public class Car {
   //  code, a fixed route, a maximum capacity of

    private String code;
    private Route route;
    private int maxCapacity;
    private int currentCapacity;

    public Car(String code, Route route, int maxCapacity, int currentCapacity) {
        this.code = code;
        this.route = route;
        this.maxCapacity = maxCapacity;
        this.currentCapacity = currentCapacity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Route getRoute() {
        return route;
    }

    public void setRoute(Route route) {
        this.route = route;
    }

    public int getMaxCapacity() {
        return maxCapacity;
    }

    public void setMaxCapacity(int maxCapacity) {
        this.maxCapacity = maxCapacity;
    }

    public int getCurrentCapacity() {
        return currentCapacity;
    }

    public void setCurrentCapacity(int currentCapacity) {
        this.currentCapacity = currentCapacity;
    }

    public boolean reserveSeat() throws Exception {
        if (currentCapacity <= 0) {
            throw new Exception("Car is at full capacity!");
        }
        currentCapacity--;
        return true;
    }
}
