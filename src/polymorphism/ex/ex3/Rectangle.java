package polymorphism.ex.ex3;

public class Rectangle extends Shape{
    private double height;
    private double base;

    Rectangle(double height, double base) {
        this.height = height;
        this.base = base;
    }

    @Override
    double area() {
        return height * base;
    }
}
