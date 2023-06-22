package OOPExercise.WorkingWithAbstraction.TrafficLights;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        String[] signals = scanner.nextLine().split("\\s+");
        int iteration = Integer.parseInt(scanner.nextLine());
        List<TrafficLights> trafficLights = Arrays.stream(signals)
                .map(Color::valueOf)
                .map(TrafficLights::new)
                .collect(Collectors.toList());

        for (int i = 0; i < iteration; i++) {
            for (TrafficLights trafficLight:trafficLights) {
                trafficLight.changeColor();
                System.out.print(trafficLight.getColor() + " ");
            }
            System.out.println();
        }
    }
}
