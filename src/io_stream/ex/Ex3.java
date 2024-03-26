import java.io.*;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        // Scanner ��ü�� �����Ͽ� ����ڷκ��� �Է��� �޽��ϴ�.
        Scanner scanner = new Scanner(System.in);
        System.out.println("�α� ������ ��θ� �Է��ϼ���:");
        String logFilePath = scanner.nextLine();

        // �� ����ں��� ���� �޽����� ������ ������ Map ��ü�� �����մϴ�.
        Map<String, Integer> messageCountByUser = new HashMap<>();

        try (
                // �α� ������ �б� ���� BufferedReader ��ü�� �����մϴ�.
                BufferedReader reader =
                        new BufferedReader(new FileReader(logFilePath));
                // �м� ����� ������ ������ ���� ���� BufferedWriter ��ü�� �����մϴ�.
                BufferedWriter writer =
                        new BufferedWriter(new FileWriter("src/io_stream/ex/chatSummary.txt"))
        ) {
            String line;
            // �α� ������ �� ���� �о ó���մϴ�.
            while ((line = reader.readLine()) != null) {
                // �� �ٿ��� ����� �̸��� �����մϴ�.
                String userName = line.split(":")[1].split(" ")[1];
                // �ش� ������� �޽��� ������ 1 ������ŵ�ϴ�.
                messageCountByUser.put(userName, messageCountByUser.getOrDefault(userName, 0) + 1);
            }

            // �� ����ں��� ���� �޽����� ������ ��� ���Ͽ� ���ϴ�.
            for (Map.Entry<String, Integer> entry : messageCountByUser.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }

            // �м��� �Ϸ�Ǿ����� �˸���, ������ ������� ���� ����մϴ�.
            System.out.println("�м� �Ϸ�. �� " + messageCountByUser.size() + "���� ����ڰ� �޽����� ���½��ϴ�.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}