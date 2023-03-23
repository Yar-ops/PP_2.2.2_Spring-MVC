package web.model;

public class Car {
    private String model;
    private int series;
    private int maxSpeed;

    public Car() {
    }

    public Car(String model, int series, int maxSpeed) {
        this.model = model;
        this.series = series;
        this.maxSpeed = maxSpeed;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    @Override
    public String toString() {
        return "CAR >>> " +
                "model='" + model + '\'' +
                ", series=" + series +
                ", maxSpeed=" + maxSpeed +
                '}';
    }
}
