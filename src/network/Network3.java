package network;

import java.io.*;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLConnection;

public class Network3 {
    public static void main(String[] args) throws IOException {
        // URL 객체 연결
        URL naverEntUrl = new URL("https://entertain.naver.com");
        URL url = new URL(naverEntUrl, "/ranking/read?oid=311&aid=0001707843");

        // URL 연결 객체 반환
        URLConnection connection = url.openConnection();

        // URL 연결 정보에서 입력 스트림으로 데이터를 받음
        InputStream inputStream = connection.getInputStream();
        InputStreamReader inputStreamReader = new InputStreamReader(inputStream);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);

        FileWriter writer = new FileWriter("src/network/news.html");
        BufferedWriter bw = new BufferedWriter(writer);

        // 한 줄 씩 출력하기
        while (true) {
            String line = bufferedReader.readLine();
            if (line == null) break;
            System.out.println(line);

            // 입력스트림으로 받은 내용 쓰기
            bw.write(line);
            bw.newLine();
        }
        bufferedReader.close();
        inputStreamReader.close();
        inputStream.close();
    }
}
