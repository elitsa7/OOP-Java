package OOPLab.ExceptionsAndErrorHandling;

import java.util.Scanner;

public class NumberInRange {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] range = scanner.nextLine().split("\\s+");
        int start = Integer.parseInt(range[0]);
        int end = Integer.parseInt(range[1]);

        System.out.printf("Range: [%d...%d]%n", start, end);
        while (true){
            String input = scanner.nextLine();
            try {
                int number = Integer.parseInt(input);
                if (number < start || number > end){
                    System.out.println("Invalid number: " + number);
                }else {
                    System.out.println("Valid number: " + number);
                    break;
                }
            }catch (NumberFormatException e){
                System.out.println("Invalid number: " + input);
            }
        }
    }
}
