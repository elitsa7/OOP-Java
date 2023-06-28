package RandomArrayList;

public class Main {
    public static void main(String[] args) {
        RandomArrayList<Integer> randomArrayList = new RandomArrayList();
        randomArrayList.add(10);
        randomArrayList.add(15);
        randomArrayList.add(20);
        randomArrayList.add(40);
        System.out.println(randomArrayList.getRandomElement());
    }
}
