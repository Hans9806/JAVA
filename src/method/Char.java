package method;

public class Char {
    public static void main(String[] args) {
        String str = "java";
        char[] cha = {'j', 'a', 'v', 'a'};

        boolean isCorrect = false;
        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
            System.out.print(" ");
            if (str.charAt(i) == 'a') {
                System.out.println("맞았습니다.");
                isCorrect = true;
            } else {
                System.out.println("아닙니다");
                isCorrect = false;
            }
        }


    }
}
