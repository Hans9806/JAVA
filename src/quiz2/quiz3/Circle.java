package quiz2.quiz3;

public class Circle extends Shape{
    private double PI = 3.1456;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }
    @Override
    double area() {
        return radius * radius *PI;
    }
}
