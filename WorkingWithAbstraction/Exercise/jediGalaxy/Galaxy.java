package OOPExercise.WorkingWithAbstraction.jediGalaxy;

public class Galaxy {
    private final Field field;

    public Galaxy(Field field) {
        this.field = field;
    }
    public int moveJedi(int rowJedi, int colJedi) {
        int starsSum = 0;
        while (rowJedi >= 0 && colJedi < field.colLength()) {
            if (this.field.isValid(rowJedi, colJedi)) {
                starsSum += this.field.getValue(rowJedi, colJedi);
            }
            colJedi++;
            rowJedi--;
        }
        return starsSum;
    }

    public void moveEvil(int rowEvil, int colEvil) {
        while (rowEvil >= 0 && colEvil >= 0) {
            if (this.field.isValid(rowEvil, colEvil)) {
                field.setValue(rowEvil, colEvil, 0);
            }
            rowEvil--;
            colEvil--;
        }
    }
}
