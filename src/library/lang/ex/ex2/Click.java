package library.lang.ex.ex2;

import java.util.Objects;

// 연습문제2
// Click 클래스는 x좌표, y좌표, 시간(timestamp : int타입)을 저장하는 클래스
// 실제 Click 인스턴스가 x좌표, y좌표가 같으면 동등하다라고 인정되게끔
// eqauls메서드를 overriding 해서 메인메서드로 확인해보세요.
public class Click {
    int x;
    int y;
    private int timestamp;

    public Click(int x, int y, int timestamp) {
        this.x = x;
        this.y = y;
        this.timestamp = timestamp;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null || getClass() != obj.getClass())
            return false;
        Click click = (Click) obj;
        return x == click.x && y == click.y;
    }

    @Override
    public int hashCode() {
        return Objects.hash(x, y, timestamp);
    }

    public static void main(String[] args) {
        Click click1 = new Click(10,20,1000);
        Click click2 = new Click(10,20,2000);

        System.out.println(click1.equals(click2));
    }
}
