package harvestingFields;
import java.lang.reflect.Field;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
        Scanner scanner = new Scanner (System.in);
        Class<RichSoilLand>richSoilLand = RichSoilLand.class;
        String modifierType = scanner.nextLine();
        while (!"HARVEST".equals(modifierType)){
            if (modifierType.equals("private")){
                Arrays.stream(richSoilLand.getDeclaredFields())
                    .filter(field -> Modifier.isPrivate(field.getModifiers()))
                    .forEach(Main::printField);
            } else if (modifierType.equals("public")) {
                Arrays.stream(richSoilLand.getDeclaredFields())
                    .filter(field -> Modifier.isPublic(field.getModifiers()))
                    .forEach(Main::printField);
            }else if (modifierType.equals("protected")) {
                Arrays.stream(richSoilLand.getDeclaredFields())
                    .filter(field -> Modifier.isProtected(field.getModifiers()))
                    .forEach(Main::printField);
            }else {
                Arrays.stream(richSoilLand.getDeclaredFields())
                    .forEach(Main::printField);
            }
            modifierType = scanner.nextLine();
            }
    }
    private static void printField(Field field) {
        System.out.printf("%s %s %s%n",
            Modifier.toString(field.getModifiers()),
            field.getType().getSimpleName(),
            field.getName());
    }
}
