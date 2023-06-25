package OOPExercise.Encapsulation.ShoppingSpree;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] people = scanner.nextLine().split(";");
        Map<String, Person> peopleMap = new LinkedHashMap<>();
        Map<String, Product> productMap = new LinkedHashMap<>();
        for (String personString : people) {
            String[] personData = personString.split("=");
            String name = personData[0];
            double money = Double.parseDouble(personData[1]);
            try {
                Person person = new Person(name, money);
                peopleMap.put(name, person);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
                return;
            }
        }
        String[] products = scanner.nextLine().split(";");

        for (String element : products) {
            String[] productData = element.split("=");
            String name = productData[0];
            double cost = Double.parseDouble(productData[1]);

            try {
                Product product = new Product(name, cost);
                productMap.put(name, product);
            } catch (IllegalArgumentException e) {
                System.out.println(e.getMessage());
                return;
            }
        }
        String commands = scanner.nextLine();
        while (!"END".equals(commands)){
            String[] partsCommand = commands.split(" ");
            String personName = partsCommand[0];
            String productName = partsCommand[1];

            Person buyer = peopleMap.get(personName);
            Product product = productMap.get(productName);
            try {
                buyer.buyProduct(product);
            }catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            commands = scanner.nextLine();
        }
        for (Person person : peopleMap.values()) {
            System.out.print(person.getName() + " - ");
            if (person.getProducts().isEmpty()) {
                System.out.println("Nothing bought");
            } else {
                System.out.println(person.getProducts().stream().map(Product::getName).collect(Collectors.joining(", ")));
            }
        }

    }
}
