package io_stream.ex;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("로그 파일의 경로를 입력하세요:");
        String logFilePath = scanner.nextLine();

        try (BufferedReader reader = new BufferedReader(new FileReader(logFilePath));
             BufferedWriter writer = new BufferedWriter(new FileWriter("src/io_stream/ex/errorLogs.txt"))) {

            String line;
            int errorCount = 0;
            while ((line = reader.readLine()) != null) {
                if (line.contains("ERROR")) {
                    writer.write(line);
                    writer.newLine();
                    errorCount++;
                }
            }

            System.out.println("분석 완료. 총 " + errorCount + "개의 에러 로그를 찾았습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
