package io_stream.file.exanother;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.stream.Stream;

public class Ex3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("디렉토리 경로를 입력하세요: ");
        String dir = scanner.nextLine();

        Path startPath = Paths.get(dir);

        long totalDirectoryFileSize = 0;
        // walk를 통해 DFS(깊이우선탐색) 파일 크기 가져오기
        try {
            totalDirectoryFileSize = Files.walk(startPath)
                    // 파일만 필터링
                    .filter(p -> p.toFile().isFile())
                    // 파일 크기 (long 기본 타입으로 변환)
                    .mapToLong(path -> path.toFile().length())
                    // 합계
                    .sum();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        // 단위 변환하기
        String formattedSize = "";
        if (totalDirectoryFileSize >= 1024) {
            formattedSize = (totalDirectoryFileSize / 1024) + "KB";
        } else {
            formattedSize = totalDirectoryFileSize + "Byte";
        }
        System.out.println("총 디렉토리 내 파일 크기 : " + formattedSize);
    }
}
