package vehicle;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] data = scanner.nextLine().split("\\s+");

        Car car = new Car(Double.parseDouble(data[1]),Double.parseDouble(data[2]));

        data = scanner.nextLine().split("\\s+");

        Truck truck = new Truck(Double.parseDouble(data[1]),Double.parseDouble(data[2]));

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandsData = scanner.nextLine().split("\\s+");
            String command = commandsData[0];

            if (command.equals("Drive")){
                double distance = Double.parseDouble(commandsData[2]);
                switch (commandsData[1]){
                    case "Car":
                        System.out.println(car.drive(distance));
                        break;
                    case "Truck":
                        System.out.println(truck.drive(distance));
                        break;
                }

            } else if (command.equals("Refuel")) {
                double liters = Double.parseDouble(commandsData[2]);
                switch (commandsData[1]){
                    case "Car":
                        car.refuel(liters);
                        break;
                    case "Truck":
                        truck.refuel(liters);
                        break;
                }
            }
        }
        System.out.println(car);
        System.out.println(truck);
    }
}
