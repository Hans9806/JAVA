package io_stream.file.ex;

import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
    연습문제 2: 텍스트 파일 병합 도구
    여러 개의 텍스트 파일을 입력받아, 그 내용을 모두 병합하여 새로운 파일에 저장하는 프로그램을 작성하세요.

    요구사항:

    - 사용자로부터 병합할 텍스트 파일 경로들을 입력받습니다.
    - 모든 파일의 내용을 순서대로 읽어, "merged.txt"라는 새 파일에 병합하여 저장합니다.
    - 각 파일 내용의 구분을 위해 파일 병합 시 각 파일 내용 사이에 구분선(예: "-----")을 삽입합니다.

    실행예시
    ===
    병합할 파일의 개수를 입력하세요:
    2
    파일 경로를 입력하세요:
    frog.txt
    파일 경로를 입력하세요:
    bear.txt
    파일 병합 완료.

    파일예시
    ===
    frog.txt
    개굴개굴 개구리 노래를 한다
    아들 손자며느리 다 모여서
    밤새도록 하여도 듣는 이 없네
    듣는 사람 없어도 날이 밝도록
    개굴개굴 개구리 노래를 한다
    개굴개굴 개구리 목청도 좋다

    bear.txt
    곰 세 마리가 한 집에 있어
    아빠 곰 엄마 곰 애기 곰
    아빠 곰은 뚱뚱해
    엄마 곰은 날씬해
    애기 곰은 너무 귀여워
    으쓱 으쓱 잘한다

    merge.txt
    개굴개굴 개구리 노래를 한다
    아들 손자며느리 다 모여서
    밤새도록 하여도 듣는 이 없네
    듣는 사람 없어도 날이 밝도록
    개굴개굴 개구리 노래를 한다
    개굴개굴 개구리 목청도 좋다
    -----
    곰 세 마리가 한 집에 있어
    아빠 곰 엄마 곰 애기 곰
    아빠 곰은 뚱뚱해
    엄마 곰은 날씬해
    애기 곰은 너무 귀여워
    으쓱 으쓱 잘한다
    -----
     */
public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("병합할 파일의  개수를 입력하세요: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        List<String> filePaths = new ArrayList<>();
        for (int i = 0; i < count; i++) {
            System.out.println("파일 경로를 입력하세요: ");
            String filePath = scanner.nextLine();
            filePaths.add(filePath);
        }
        mergeFiles(filePaths, "merge.txt");
        System.out.println("파일 병합 완료. ");

    }
    public static void mergeFiles(List<String> filePaths, String outputFilePath) {
        try (PrintWriter writer = new PrintWriter(new FileWriter(outputFilePath))) {
            for (String filePath : filePaths) {
                BufferedReader reader = new BufferedReader(new FileReader(filePath));
                String line;
                while ((line = reader.readLine()) != null) {
                    writer.println(line);
                }
                writer.println("------------");
                reader.close();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

}
