package io_stream.file.exanother;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class Ex1 {
    public static void main(String[] args) {
        String currentPath = "src/io_stream/file/exanother/";

        Scanner scanner = new Scanner(System.in);
        System.out.println("1: 정보 저장, 2: 정보 조회");
        int choice = scanner.nextInt();

        scanner.nextLine();     // 개행문자 버퍼를 비워둠

        // 정보 저장
        if (choice ==1) {
            System.out.println("이름: ");
            String name = scanner.nextLine();
            System.out.println("이메일: ");
            String email = scanner.nextLine();
            System.out.println("나이: ");
            String age = scanner.nextLine();


            File file = new File(currentPath + name + ".user");
            try(BufferedWriter bw = new BufferedWriter(new FileWriter(file))) {
                bw.write("이름: "+name);
                bw.newLine();
                bw.write("이메일: "+email);
                bw.newLine();
                bw.write("나이: "+age);
                bw.newLine();
                System.out.println("정보 저장 완료");
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        } else if (choice == 2) {
            File currentDir = new File(currentPath);
            // File file = new file(".");
            File[] files = currentDir.listFiles();

            for (File f : files) {
                String fileName = f.getName();
                if (fileName.endsWith(".user")) {
                    System.out.println(f.getName());
                }
            }
        }else {
            System.out.println("1또는 2를 선택하세요.");
        }
    }
}
