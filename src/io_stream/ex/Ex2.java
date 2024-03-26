package io_stream.ex;

import java.io.*;
import java.util.Scanner;

public class Ex2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�α� ������ ��θ� �Է��ϼ���:");
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

            System.out.println("�м� �Ϸ�. �� " + errorCount + "���� ���� �α׸� ã�ҽ��ϴ�.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
