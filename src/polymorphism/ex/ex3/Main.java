package polymorphism.ex.ex3;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(10);
        Rectangle rectangle = new Rectangle(10, 5);
        Triangle triangle = new Triangle(5, 6);

        System.out.println("원의 면적 : "+ circle.area());
        System.out.println("사각형의 면적 : "+ rectangle.area());
        System.out.println("삼각형의 면적 : "+ triangle.area());
    }
}
