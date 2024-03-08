package javatest3.ex5;

public class Main {
    public static void main(String[] args) {
        // Product 클래스의 객체 생성
        Product product1 = new Product("Apple", 2.5, 10);
        Product product2 = new Product("Apple", 2.5, 10);

        // equals, hashCode, toString 메서드를 각각 호출하여 결과를 출력
        System.out.println("equals 메서드 호출 결과: " + product1.equals(product2));
        System.out.println("hashCode 메서드 호출 결과 (product1): " + product1.hashCode());
        System.out.println("hashCode 메서드 호출 결과 (product2): " + product2.hashCode());
        System.out.println("toString 메서드 호출 결과 (product1): " + product1.toString());
        System.out.println("toString 메서드 호출 결과 (product2): " + product2.toString());
    }
}
