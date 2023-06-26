package PizzaCalories;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        String[] pizzaData = bufferedReader.readLine().split(" ");
        String pizzaName = pizzaData[1];
        int numberOfToppings = Integer.parseInt(pizzaData[2]);
        Pizza pizza;
        try {
            pizza = new Pizza(pizzaName, numberOfToppings);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }
        String[] doughData = bufferedReader.readLine().split("\\s+");
        String flourType = doughData[1];
        String backingTechnique = doughData[2];
        double weight = Double.parseDouble(doughData[3]);

        Dough dough;
        try {
            dough = new Dough(flourType, backingTechnique, weight);
        }catch (IllegalArgumentException exception){
            System.out.println(exception.getMessage());
            return;
        }
        pizza.setDough(dough);

        String input = bufferedReader.readLine();
        while (!"END".equals(input)){
            String[] data = input.split("\\s+");
            String toppingType = data[1];
            weight = Double.parseDouble(data[2]);

            Topping topping;
            try {
                topping = new Topping(toppingType, weight);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                return;
            }
            pizza.addTopping(topping);

            input = bufferedReader.readLine();
        }
        System.out.printf("%s - %.2f%n", pizza.getName(), pizza.getOverallCalories());
    }
}
