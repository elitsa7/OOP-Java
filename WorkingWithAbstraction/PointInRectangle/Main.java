package OOPLab.WorkingWithAbstraction.PointInRectangle;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
       Scanner scanner = new Scanner (System.in);
        int[] rectanglesPoints = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
        Point bottomLeft = new Point(rectanglesPoints[0], rectanglesPoints[1]);
        Point topRight = new Point(rectanglesPoints[2], rectanglesPoints[3]);

        Rectangle rectangle = new Rectangle(bottomLeft, topRight);

        int inputRows = Integer.parseInt(scanner.nextLine());
        while (inputRows --> 0){
            int[] points = Arrays.stream(scanner.nextLine().split("\\s+")).mapToInt(Integer::parseInt).toArray();
            Point point = new Point(points[0], points[1]);
            boolean contains = rectangle.contains(point);
            System.out.println(contains);
        }
    }
}