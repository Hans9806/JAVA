package io_stream.file.exanother;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) throws IOException {
        String currentPath = "src/io_stream/file/exanother/";

        // 개수 입력받기
        Scanner scanner = new Scanner(System.in);
        System.out.println("병합할 파일의 개수를 입력하세요: ");
        int fileCount = scanner.nextInt();
        scanner.nextLine(); // 줄바꿈 문자 제거 버퍼 비우가

        // 병합할 파일 쓰기
        try (BufferedWriter bw = new BufferedWriter(new FileWriter(currentPath + "merged.txt"))){

        // 개수만큼 반복하여 경로 입력받기
        for (int i = 0; i < fileCount; i++) {
            System.out.println("파일 경로를 입력하세요: ");
            String filePath = scanner.nextLine();
            File file = new File(currentPath + filePath);

            // 파일 읽기
            try(BufferedReader br = new BufferedReader(new FileReader(file))) {
                while (true) {
                    String line = br.readLine();
                    if (line == null) break;
                    // 파일 읽은 라인마다 병합 파일에 쓰고 개행
                    bw.write(line);
                    bw.newLine();
                }
            } catch (IOException e) {
                System.out.println("경로가 잘못되었습니다.");
                throw new RuntimeException(e);
            }
            bw.write("=======================");    // 구분선
            bw.newLine();
            }
            System.out.println("파일 병합이 완료되었습니다.");
        }catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
