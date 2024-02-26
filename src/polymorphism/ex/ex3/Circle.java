package polymorphism.ex.ex3;

public class Circle extends Shape{

    private final double PI = 3.14159;
    private double radius;

    public Circle(double radius) {
        this.radius = radius;
    }


    // 원의 넓이 구하기
    @Override
    double area() {
        return radius * radius * PI;
    }
}
