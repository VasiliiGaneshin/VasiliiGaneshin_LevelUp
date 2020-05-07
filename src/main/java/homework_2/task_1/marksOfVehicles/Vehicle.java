package homework_2.task_1.marksOfVehicles;

public class Vehicle implements Comparable<Vehicle>{

    private double fuelConsumption;
    private String engineType;
    private String size;
    private int capacity;
    protected double price;

    public Vehicle(double fuelConsumption, String engineType, String size, int capacity) {
        this.fuelConsumption = fuelConsumption;
        this.engineType = engineType;
        this.size = size;
        this.capacity = capacity;
    }


    public int compareTo(Vehicle vehicle) {
        return (int)(this.fuelConsumption - vehicle.fuelConsumption);
    }

    public double getFuelConsumption() {
        return fuelConsumption;
    }

    public int getCapacity() {
        return capacity;
    }

    public String getEngineType() {
        return engineType;
    }

    public String getSize() {
        return size;
    }

    public double getPrice() {
        return price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "fuelConsumption=" + fuelConsumption +
                ", engineType='" + engineType + '\'' +
                ", size='" + size + '\'' +
                ", capacity=" + capacity +
                ", price=" + price +
                '}';
    }
}
