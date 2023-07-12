package OOPLab.Polymorphism.shapes;

public class Rectangle extends Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public double getWidth() {
        return width;
    }

    @Override
    public void calculatePerimeter() {
        double perimeter = 2 * (this.height * this.width);
        super.setPerimeter(perimeter);
    }

    @Override
    public void calculateArea() {
        double area = this.height * this.width;
        super.setPerimeter(area);

    }
}
