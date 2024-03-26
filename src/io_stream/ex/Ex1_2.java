package io_stream.ex;

import java.io.*;
import java.util.Scanner;

public class Ex1_2 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);
        System.out.println("�ؽ�Ʈ�� �Է��ϼ��� ('����' �Է� �� ���α׷� ����): ");
        String path = "src/io_stream/ex/output.txt";

        // try-with-resource ����
        // �ش� ��Ͽ����� ����ϴ� �ڿ� () �ȿ� �ְ�, ��� ���� �ڵ� ����
        try (FileWriter writer = new FileWriter(path)) {
            while(true) {
                String input = scanner.nextLine();
                // ���� �˻�
                if (input.equals("����"))break;
                // ���� ���� �ٹٲ� ����
                writer.write(input + "\n");
            }
        }catch (IOException e) {
            System.out.println("���� �߻�");
        }
    }
}
