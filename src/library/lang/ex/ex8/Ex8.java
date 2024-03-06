package library.lang.ex.ex8;

public class Ex8 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("인자가 없이 정상 종료");
            System.exit(0);
        } else {
            System.out.println("인자를 받아 비정상 종료");
            System.exit(1);
        }
    }
}
