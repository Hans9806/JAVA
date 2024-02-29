package quiz2.quiz3;

public class Triangle extends Shape{
    private double width;
    private double height;

    public Triangle(double width, double height) {
        this.width = width;
        this.height = height;
    }
    @Override
    double area() {
        return width *height * 0.5;
    }
}
