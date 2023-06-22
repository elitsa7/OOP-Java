package OOPLab.WorkingWithAbstraction.HotelReservation;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] input = scanner.nextLine().split("\\s+");
        double price = Double.parseDouble(input[0]);
        int days = Integer.parseInt(input[1]);
        Season season = Season.valueOf(input[2]);
        DiscountType discountType = DiscountType.valueOf(input[3]);

        PriceCalculator priceCalculator = new PriceCalculator(price, days, season,discountType);
        double calculate = priceCalculator.calculate();
        System.out.printf("%.2f", calculate);
    }
}
