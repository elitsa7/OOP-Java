package OOPExercise.WorkingWithAbstraction.jediGalaxy;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

            int[] dimestions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rows = dimestions[0];
            int cols = dimestions[1];

            int[][] matrix = new int[rows][cols];


        Field field = new Field(rows, cols);
        Galaxy galaxy = new Galaxy(field);
        String command = scanner.nextLine();
        int starsSum = 0;
        while (!command.equals("Let the Force be with you")) {
            int[] jediPositions = Arrays.stream(command.split(" ")).mapToInt(Integer::parseInt).toArray();
            int[] evilPositions = Arrays.stream(scanner.nextLine().split(" ")).mapToInt(Integer::parseInt).toArray();
            int rowEvil = evilPositions[0];
            int colEvil = evilPositions[1];
            galaxy.moveEvil(rowEvil, colEvil);

            int rowJedi = jediPositions[0];
            int colJedi = jediPositions[1];
            starsSum = galaxy.moveJedi(rowJedi, colJedi);

            command = scanner.nextLine();
        }
            System.out.println(starsSum);
    }
}
