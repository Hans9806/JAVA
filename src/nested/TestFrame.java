package nested;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
/*
JFrame
 */

public class TestFrame extends JFrame {
    public TestFrame() {
        setSize(800,500);
        setLocation(100,100);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        // 윈도우창 종료 시 프로세스까지 깔끔하게 닫을 수 있다.

        // FlowLayout 객체 전달하기
        setLayout((new FlowLayout(FlowLayout.LEFT)));
        // 버튼을 만들어서
        JButton btn1 = new JButton("버튼1");
        JButton btn2 = new JButton("버튼2");
        JButton btn3 = new JButton("버튼3");

        // 버튼에 액션 리스너 추가
        btn1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼1이 눌렀습니다.");
            }
        });
        btn2.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼2이 눌렀습니다.");
            }
        });
        btn3.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                System.out.println("버튼3이 눌렀습니다.");
            }
        });
        // 프레임에 추가하기
        add(btn1);
        add(btn2);
        add(btn3);

        setVisible(true);

    }

    // run 했을때 실행순서가 시작되는 main 메소드
    public static void main(String[] args) {
        new TestFrame();
    }
}
