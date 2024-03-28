package network.ex;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

/*
    연습문제 : 웹 페이지 제목 추출기

    주어진 URL의 웹 페이지로부터 HTML <title> 태그 내의 텍스트를 추출하는 자바 프로그램을 작성하세요.
    이 프로그램은 웹 페이지를 다운로드하고, HTML 내용에서 <title> 태그의 텍스트를 찾아 출력해야 합니다.

    - 웹 페이지의 HTML 내용을 가져옵니다.
    - HTML 내용에서 <title> 시작 태그와 </title> 종료 태그 사이의 텍스트를 추출합니다.
    - 추출한 텍스트를 출력합니다.

    - 입력 예시: https://www.example.com
    - 출력 예시 (웹 페이지의 제목에 따라 다름): Example Domain
     */
public class Ex2 {
    public static void main(String[] args) throws MalformedURLException {
        String inputUrl = "https://n.news.naver.com/article/025/0003350507?ntype=RANKING";

        try {
            URL url = new URL(inputUrl);
            HttpURLConnection connection = (HttpURLConnection) url.openConnection();
            connection.setRequestMethod("GET");

            BufferedReader br = new BufferedReader(new InputStreamReader(connection.getInputStream()));
            StringBuilder content = new StringBuilder();
            String line;
            while ((line = br.readLine())!= null) {
                content.append(line);
            }
            br.close();

            int titleStart = content.indexOf("<title>");
            int titleEnd = content.indexOf("</title>");
            if (titleStart != -1 && titleEnd != -1) {
                String titleText = content.substring(titleStart + 7,titleEnd);
                System.out.println(titleText);
            } else {
                System.out.println("제목을 찾을 수 없습니다.");
            }
        } catch (IOException e) {
            System.err.println("웹 페이지를 가져오는 중 오류가 발생했습니다.");
        }
    }
}
