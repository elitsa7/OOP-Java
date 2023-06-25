package ClassBoxDataValidation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        double length = Double.parseDouble(scanner.nextLine());
        double width = Double.parseDouble(scanner.nextLine());
        double height = Double.parseDouble(scanner.nextLine());

        Box box = new Box(length, width, height);

        System.out.print("Surface Area - ");
        System.out.printf("%.2f%n", box.calculateSurfaceArea());

        System.out.print("Lateral Surface Area - ");
        System.out.printf("%.2f%n", box.calculateLateralSurfaceArea());

        System.out.print("Volume - ");
        System.out.printf("%.2f%n", box.calculateVolume());
    }
}
