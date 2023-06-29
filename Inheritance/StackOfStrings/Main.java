package StackOfStrings;

public class Main {
    public static void main(String[] args) {
        StackOfStrings stackOfStrings = new StackOfStrings();
        stackOfStrings.push("java");
        stackOfStrings.push("is");
        stackOfStrings.push("the");
        stackOfStrings.push("best");
        System.out.println(stackOfStrings.peek());
        System.out.println(stackOfStrings.pop());
        System.out.println(stackOfStrings.isEmpty());
        stackOfStrings.pop();
        stackOfStrings.pop();
        stackOfStrings.pop();
        System.out.println(stackOfStrings.isEmpty());
    }
}
