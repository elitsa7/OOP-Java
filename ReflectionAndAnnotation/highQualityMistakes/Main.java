import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflectionClass = Reflection.class;
        Method[] methods = reflectionClass.getDeclaredMethods();

        Arrays.stream(reflectionClass.getDeclaredFields()).sorted(Comparator.comparing(Field::getName))
            .forEach(field -> {
                boolean isPrivate = Modifier.isPrivate(field.getModifiers());
                if (!isPrivate) {
                    System.out.println(field.getName() + " must be private!");
                }
            });
        Arrays.stream(methods).sorted(Comparator.comparing(Method::getName))
            .forEach(method -> {
                if (method.getName().startsWith("get") && !Modifier.isPublic(method.getModifiers())) {
                    System.out.println(method.getName() + " have to be public!");
                } else if (method.getName().startsWith("set") && !Modifier.isPrivate(method.getModifiers())) {
                    System.out.println(method.getName() + " have to be private!");
                }
            });
    }
}
