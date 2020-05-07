package homework_2.task_1;

import homework_2.task_1.marksOfVehicles.Vehicle;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Manage {

    private List<Vehicle> vehicles;

    public Manage(List<Vehicle> vehicles) {
        this.vehicles = vehicles;
    }

    public double totalPrice(){
        double totalPrice = 0;
        for (Vehicle vehicle : vehicles){
         totalPrice += vehicle.getPrice();
        }
        return totalPrice;
    }

    public List<Vehicle> findVehicles(int minCapacity, int maxCapacity){
        List<Vehicle> findVehicles = new ArrayList<Vehicle>();
        for (Vehicle vehicle : findVehicles) {
            if (vehicle.getCapacity() > minCapacity && vehicle.getCapacity() < maxCapacity){
                findVehicles.add(vehicle);
            }
        }
        return findVehicles;
    }

    public void sortByFuelConsumption(){
        Collections.sort(vehicles);
    }

    public void printFuelConsumption(){
        for (Vehicle vehicle : vehicles) {
            System.out.println(vehicle);
        }
    }


}
