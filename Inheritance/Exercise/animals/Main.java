package OOPExercise.Inheritance.animals;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String input = scanner.nextLine();
        while (!"Beast!".equals(input)){
            try{
                switch (input){
                    case "Dog":
                        String[] inputData = scanner.nextLine().split("\\s+");
                        Dog dog = new Dog(inputData[0],Integer.parseInt(inputData[1]), inputData[2]);
                        System.out.println(dog);
                        break;
                    case "Cat":
                        inputData = scanner.nextLine().split("\\s+");
                        Cat cat = new Cat(inputData[0],Integer.parseInt(inputData[1]), inputData[2]);
                        System.out.println(cat);
                        break;
                    case "Frog":
                        inputData = scanner.nextLine().split("\\s+");
                        Frog frog = new Frog(inputData[0],Integer.parseInt(inputData[1]), inputData[2]);
                        System.out.println(frog);
                        break;
                    case "Kitten":
                        inputData = scanner.nextLine().split("\\s+");
                        Kitten kitten = new Kitten(inputData[0],Integer.parseInt(inputData[1]));
                        System.out.println(kitten);
                        break;
                    case "Tomcat":
                        inputData = scanner.nextLine().split("\\s+");
                        Tomcat tomcat = new Tomcat(inputData[0],Integer.parseInt(inputData[1]));
                        System.out.println(tomcat);
                        break;
                }
            }
            catch (IllegalArgumentException exception){
                System.out.println(exception.getMessage());
            }
            input = scanner.nextLine();
        }
    }
}
