import java.lang.reflect.InvocationTargetException;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        Class<Reflection> reflectionClass = Reflection.class;
        System.out.println(reflectionClass);
        System.out.println(reflectionClass.getSuperclass()); //superClass
        Arrays.stream(reflectionClass.getInterfaces())
            .forEach(System.out::println); //allInterfaces

        System.out.println(reflectionClass.getDeclaredConstructor().newInstance()); // createInstance
    }
}
