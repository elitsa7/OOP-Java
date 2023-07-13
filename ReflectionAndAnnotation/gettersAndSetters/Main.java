import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Arrays;
import java.util.Comparator;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflectionClass = Reflection.class;
        Method[] methods = reflectionClass.getDeclaredMethods();

        Arrays.stream(methods).sorted(Comparator.comparing(Method::getName))
            .forEach(m -> {
                if (m.getName().startsWith("get") && m.getParameterCount() == 0) {
                    System.out.printf("%s will return class %s%n", m.getName(), m.getReturnType().getName());
                } else if (m.getName().startsWith("set") && m.getParameterCount() == 1) {
                    System.out.printf("%s and will set field of class %s%n", m.getName(), m.getParameterTypes()[0].getTypeName());
                }
            });
    }
}
