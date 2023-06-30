package OOPExercise.Inheritance.animals;

public class Cat extends Animal{
    private final static String sound = "Meow meow";
    public Cat(String name, int age, String gender) {
        super(name, age, gender);

    }
    @Override
    public String produceSound() {
        return sound;
    }
}
