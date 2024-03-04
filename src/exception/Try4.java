package exception;

public class Try4 {
    public static void main(String[] args) {
        String str = null;
    try{
        System.out.println(str.length());
    }catch (NullPointerException e) {
        System.out.println(e.getMessage());
    }
        System.out.println("이후 로직...");
}
}
