package OOPLab.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        try {
            String input = scanner.nextLine();
            int number = Integer.parseInt(input);
            if (number <= 0){
                System.out.println("Invalid");
            }else {
                System.out.printf("%.2f%n", Math.sqrt(number));
            }
        }catch (NumberFormatException e){
            System.out.println("Invalid");
        }finally {
            System.out.println("Goodbye");
        }
    }
}
