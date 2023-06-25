package ClassBoxDataValidation;

public class Box {
    private double length;
    private double width;
    private double height;

    public Box(double length, double width, double height) {
        setLength(length);
        setWidth(width);
        setHeight(height);
    }
    private void setLength(double length) {
        if (length < 1){
            throw new IllegalArgumentException("Length cannot be zero or negative.");
        }
        this.length = length;
    }
    private void setWidth(double width) {
        if (width < 1){
            throw new IllegalArgumentException("Width cannot be zero or negative.");
        }
        this.width = width;
    }
    private void setHeight(double height) {
        if (height < 1){
            throw new IllegalArgumentException("Height cannot be zero or negative.");
        }
        this.height = height;
    }
    public double calculateSurfaceArea (){
        // 2lw + 2lh + 2wh
        double surfaceArea = 2 * this.length * this.width + 2 * this.length * this.height + 2 * this.width * this.height;
        return surfaceArea;
    }
    public double calculateLateralSurfaceArea (){
        double lateralSurfaceArea = 2 * this.length * this.height + 2 * this.width * this.height;
        //2lh + 2wh
        return lateralSurfaceArea;
    }
    public double calculateVolume (){
        double volume = this.length * this.width * this.height;
        // lwh
        return volume;
    }
}
