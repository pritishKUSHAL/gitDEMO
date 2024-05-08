public class Car {
    private int price;
    private int engineSize;

    public int getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", engineSize=" + engineSize +
                ", maxSpeed=" + maxSpeed +
                '}';
    }

    public int getEngineSize() {
        return engineSize;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public void setEngineSize(int engineSize) {
        this.engineSize = engineSize;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    private int maxSpeed;

    public Car(int price, int engineSize, int maxSpeed) {
        this.price = price;
        this.engineSize = engineSize;
        this.maxSpeed = maxSpeed;
    }
}
