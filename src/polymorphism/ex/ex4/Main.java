package polymorphism.ex.ex4;

public class Main {
    public static void main(String[] args) {
        Cookie gingerbread = new Gingerbread();
        Cookie strawberryCookie = new StrawberryCookie();
        Cookie chocoCookie = new ChocoCookie();

        Cookie[] cookies = {gingerbread, chocoCookie, strawberryCookie};

        for (Cookie cookie : cookies) {
            cookie.run();
            cookie.jump();
            cookie.specialSkill();
        }
    }
}
