package io_stream.file.ex;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

/*
    연습문제 1: 사용자 정보 저장 및 조회 시스템
    사용자로부터 이름, 이메일, 나이를 입력받아, 각 사용자마다 개별 파일로 저장하는 프로그램을 작성하세요. 그리고 저장된 사용자 정보 파일 목록을 조회할 수 있는 기능도 구현하세요.

    요구사항:

    - 사용자 정보는 "사용자이름.user" 형식의 파일에 저장합니다.
    - 파일에는 이름, 이메일, 나이가 각 줄에 저장되어야 합니다.
    - 프로그램 실행 시 사용자에게 "정보 저장"과 "정보 조회" 중 선택할 수 있게 합니다.
    - "정보 조회" 선택 시 저장된 모든 사용자 정보 파일 목록을 출력합니다.

    실행예시
    ===
    1: 정보 저장, 2: 정보 조회
    1
    이름: 홍길동
    이메일: abc@def.com
    나이: 30
    정보 저장 완료.


    1: 정보 저장, 2: 정보 조회
    2
    홍길동.user
     */
public class Ex1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("1: 정보 저장, 2: 정보 조회 (0 입력시 종료) ");
            int option = scanner.nextInt();
            if (option == 0) break;
            if (option == 1) {
                saveInfo();
            } else if (option == 2) {
                listInfo();
            } else {
                System.out.println("잘못 입력하였습니다.");
            }
        }
    }
    private static void saveInfo() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("이름: ");
        String name = scanner.nextLine();
        System.out.println("이메일: ");
        String email = scanner.nextLine();
        System.out.println("나이: ");
        int age = scanner.nextInt();

        try (PrintWriter printWriter = new PrintWriter(new FileWriter(name + ".user"))) {
            printWriter.println(name);
            printWriter.println(email);
            printWriter.println(age);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        System.out.println("정보 저장 완료");
    }
    private static void listInfo() {
        File dir = new File(".");
        for (File file : dir.listFiles()) {
            if (file.getName().endsWith(".user")) {
                System.out.println(file.getName());
            }
        }
    }
}