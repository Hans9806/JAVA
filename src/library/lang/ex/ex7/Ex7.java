package library.lang.ex.ex7;

import java.util.Properties;

public class Ex7 {
    public static void main(String[] args) {

        String javaVersion = System.getProperty("java.version");
        String osName = System.getProperty("os.name");
        String userDir = System.getProperty("user.dir");

        System.out.println("javaVersion : " + javaVersion);
        System.out.println("운영체제 : " + osName);
        System.out.println("사용자 디렉토리 : " + userDir);
    }
}
