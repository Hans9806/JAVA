import java.io.*;
import java.util.*;

public class Ex3 {
    public static void main(String[] args) throws IOException {
        // Scanner 객체를 생성하여 사용자로부터 입력을 받습니다.
        Scanner scanner = new Scanner(System.in);
        System.out.println("로그 파일의 경로를 입력하세요:");
        String logFilePath = scanner.nextLine();

        // 각 사용자별로 보낸 메시지의 개수를 저장할 Map 객체를 생성합니다.
        Map<String, Integer> messageCountByUser = new HashMap<>();

        try (
                // 로그 파일을 읽기 위한 BufferedReader 객체를 생성합니다.
                BufferedReader reader =
                        new BufferedReader(new FileReader(logFilePath));
                // 분석 결과를 저장할 파일을 쓰기 위한 BufferedWriter 객체를 생성합니다.
                BufferedWriter writer =
                        new BufferedWriter(new FileWriter("src/io_stream/ex/chatSummary.txt"))
        ) {
            String line;
            // 로그 파일의 각 줄을 읽어서 처리합니다.
            while ((line = reader.readLine()) != null) {
                // 각 줄에서 사용자 이름을 추출합니다.
                String userName = line.split(":")[1].split(" ")[1];
                // 해당 사용자의 메시지 개수를 1 증가시킵니다.
                messageCountByUser.put(userName, messageCountByUser.getOrDefault(userName, 0) + 1);
            }

            // 각 사용자별로 보낸 메시지의 개수를 결과 파일에 씁니다.
            for (Map.Entry<String, Integer> entry : messageCountByUser.entrySet()) {
                writer.write(entry.getKey() + ": " + entry.getValue());
                writer.newLine();
            }

            // 분석이 완료되었음을 알리고, 참여한 사용자의 수를 출력합니다.
            System.out.println("분석 완료. 총 " + messageCountByUser.size() + "명의 사용자가 메시지를 보냈습니다.");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}