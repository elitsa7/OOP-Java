package OOPExercise.Encapsulation.AnimalFarm;

public class Chicken {
    private String name;
    private int age;

    public Chicken(String name, int age) {
        setName(name);
        setAge(age);
    }

    private void setName(String name) {
        if (name.length() < 1){
            throw new IllegalArgumentException("Name cannot be empty.");
        }
        this.name = name;
    }

    private void setAge(int age) {
        if (age > 15 || age < 0){
            throw new IllegalArgumentException("Age should be between 0 and 15.");
        }
        this.age = age;
    }
    private double calculateProductPerDay() {
        double eggs = 0;
        if (this.age < 6){
            eggs = 2;
        } else if (this.age <= 11) {
            eggs = 1;
        }else {
            eggs = 0.75;
        }
        return eggs;
    }
    public double productPerDay (){
        return calculateProductPerDay();
    }

    @Override
    public String toString() {
        //Chicken Chichi (age 10) can produce 1.00 eggs per day.
        return "Chicken " + this.name + " (age " + this.age + ") can produce " + productPerDay() + " eggs per day";
    }
}
