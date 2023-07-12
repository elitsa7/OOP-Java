package OOPLab.Polymorphism.mathOperation;

public class Main {
    public static void main(String[] args) {
        MathOperation mathOperation = new MathOperation();
        System.out.println(mathOperation.add(5, 6));
        System.out.println(mathOperation.add(5, 6, 7));
        System.out.println(mathOperation.add(5, 6, 7, 8));
    }
}
