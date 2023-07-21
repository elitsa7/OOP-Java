package OOPExercise.WorkingWithAbstraction.jediGalaxy;

public class Field {
    private final int[][] starsField;

    public Field(int rows, int cols) {
        this.starsField = new int[rows][cols];
        fillGalaxy(rows, cols, starsField);

    }

    private void fillGalaxy(int rows, int cols, int[][] galaxy) {
        int value = 0;
        for (int currentRow = 0; currentRow < rows; currentRow++) {
            for (int currentCol = 0; currentCol < cols; currentCol++) {
                galaxy[currentRow][currentCol] = value++;
            }
        }
    }
    public boolean isValid(int row, int col) {
        return row >= 0 && col >= 0 && row < this.starsField.length && col < this.starsField[0].length;
    }

    public int getValue(int row, int col) {
        return this.starsField[row][col];
    }

    public void setValue(int row, int col, int newValue) {
        this.starsField[row][col] = newValue;
    }

    public int colLength() {
        return this.starsField[1].length;
    }
}
