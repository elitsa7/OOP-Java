package borderControl;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<String> idList = new ArrayList<>();

        String linesInput = scanner.nextLine();
        while (!"End".equals(linesInput)) {
            String[] dataForCitizenOrRobot = linesInput.split("\\s+");
            if (dataForCitizenOrRobot.length == 3) {
                String citizenId = dataForCitizenOrRobot[2];
                Citizen citizen = new Citizen(dataForCitizenOrRobot[0],
                    Integer.parseInt(dataForCitizenOrRobot[1]),
                    citizenId);

                idList.add(citizenId);
            } else {
                String robotId = dataForCitizenOrRobot[1];
                Robot robot = new Robot(dataForCitizenOrRobot[0], robotId);

                idList.add(robotId);
            }
            linesInput = scanner.nextLine();
        }
        String digitForFakeId = scanner.nextLine();
        idList.stream().filter(id -> id.endsWith(digitForFakeId)).forEach(System.out::println);
    }
}
