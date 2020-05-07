package homework_2.task_1;

import homework_2.task_1.marksOfVehicles.Vehicle;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Autopark {
    Scanner scanner = new Scanner(System.in);
    public List<Vehicle> vehicles;
    public  List<Vehicle> findVehicles;




    public static void main(String[] args) {

        System.out.println("Парк общественного транспорта");
        Autopark autopark = new Autopark();
        Scanner scanner = new Scanner(System.in);
        autopark.createAutopark();

    }

    public void createAutopark() {

        int numberVehicles;

        System.out.println("Введите количество автобусов");
        numberVehicles = scanner.nextInt();








    }
}