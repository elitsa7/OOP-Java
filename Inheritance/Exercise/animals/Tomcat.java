package OOPExercise.Inheritance.animals;

public class Tomcat extends Cat{
    private final static String sound = "MEOW";
    private static final String GENDER = "Male";
    public Tomcat(String name, int age) {
        super(name, age, GENDER);
    }
    @Override
    public String produceSound() {
        return sound;
    }
}
