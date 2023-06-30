package OOPExercise.Inheritance.animals;

public class Kitten extends Cat{
    private final static String sound = "Meow";
    private static final String GENDER = "Female";
    public Kitten(String name, int age) {
        super(name, age, GENDER);
    }
    @Override
    public String produceSound() {
        return sound;
    }
}
