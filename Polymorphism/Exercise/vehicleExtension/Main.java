package vehicle;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);

        String[] data = scanner.nextLine().split("\\s+");
        Vehicle car = new Car(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));

        data = scanner.nextLine().split("\\s+");
        Vehicle truck = new Truck(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));

        data = scanner.nextLine().split("\\s+");
        Vehicle bus = new Bus(Double.parseDouble(data[1]),Double.parseDouble(data[2]),Double.parseDouble(data[3]));

        Map<String, Vehicle> vehicles = new LinkedHashMap<>();
        vehicles.put("Car", car);
        vehicles.put("Truck", truck);
        vehicles.put("Bus", bus);

        int n = Integer.parseInt(scanner.nextLine());
        for (int i = 0; i < n; i++) {
            String[] commandsData = scanner.nextLine().split("\\s+");
            String command = commandsData[0];
            Vehicle vehicle = vehicles.get(commandsData[1]);
            try {
                switch (command) {
                    case "Drive":
                        double distance = Double.parseDouble(commandsData[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(false);
                        }
                        System.out.println(vehicle.drive(distance));
                        break;
                    case "Refuel":
                        double liters = Double.parseDouble(commandsData[2]);
                        vehicles.get(commandsData[1]).refuel(liters);
                        break;
                    case "DriveEmpty":
                        double driveEmptyBusDistance = Double.parseDouble(commandsData[2]);
                        if (vehicle instanceof Bus) {
                            ((Bus) vehicle).setEmpty(true);
                        }
                        System.out.println(vehicle.drive(driveEmptyBusDistance));
                        break;
                    default:
                        throw new IllegalArgumentException("No such command");
                }
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
        }
        vehicles.values().forEach(System.out::println);
    }
}
