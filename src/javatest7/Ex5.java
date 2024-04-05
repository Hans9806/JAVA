package javatest7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Scanner;

/*
* 디렉토리 내 파일 크기 계산

    지정된 디렉토리 내의 모든 파일 크기의 합을 계산하여 출력하는 프로그램을 작성하세요. 하위 디렉토리의 파일 크기도 포함되어야 합니다.

    요구사항:
    - 사용자로부터 디렉토리 경로를 입력받습니다.
    - 입력된 디렉토리 내의 모든 파일 크기의 합을 계산합니다.
    - 계산된 총 크기를 Byte 단위로 출력합니다.
    - 힌트 : nio.Files의 walk를 사용하면 내부 디렉토리 및 파일을 모두 탐색할 수 있습니다.
    * */
public class Ex5 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("디렉토리의 경로를 입력하세요: ");
        String dir = scanner.nextLine();

        Path path = Paths.get(dir);

        long totalSize = Files.walk(path)
                .filter(p -> p.toFile().isFile())
                .mapToLong(p -> {
                    try {
                        return Files.size(p);
                    } catch (IOException e) {
                        throw new RuntimeException(e);
                    }
                }).sum();

        System.out.println("총 크기: " + totalSize + " Byte");
    }
}
