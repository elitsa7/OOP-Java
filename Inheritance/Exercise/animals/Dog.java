package OOPExercise.Inheritance.animals;

public class Dog extends Animal{
    private final static String sound = "Woof!";
    public Dog(String name, int age, String gender) {
        super(name, age, gender);
    }
    @Override
    public String produceSound() {
        return sound;
    }
}
