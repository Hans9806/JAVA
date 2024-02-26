package polymorphism.ex.ex3;

public class Triangle extends Shape{
    private double height;
    private double width;

    public Triangle(double height, double width) {
        this.height = height;
        this.width = width;
    }
    @Override
    double area() {
        return height * width * 0.5;
    }
}
