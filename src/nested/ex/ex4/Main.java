package nested.ex.ex4;

public class Main {
    public static void main(String[] args) {
        /*문제 4.
중첩 인터페이스가 내부에 선언된 CheckBox 클래스가 아래와 같이 있습니다.
체크박스가 선택되었을 때 "배경을 변경합니다"라고 실행되는
리스너를 클래스와 익명 객체로 각각 만들어보세요*/
        // 클래스를 이용한 리스너 생성
        class BackgroundListener implements CheckBox.OnSelectListener {

            // onSelect 메소드를 오버라이드 하여 출력
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다.");
            }
        }
        CheckBox checkBox = new CheckBox();
        // 리스너를 설정
        checkBox.setOnSelectListener(new BackgroundListener());
        // select 메소드를 호출하여 리스너의 onSelect 메소드를 실행
        checkBox.select();

        // 익명 객체를 이용한 리스너 생성
        CheckBox checkBox1 = new CheckBox();
        checkBox1.setOnSelectListener(new CheckBox.OnSelectListener() {
            // onSelect 메소드를 오버라이드하여 출력
            @Override
            public void onSelect() {
                System.out.println("배경을 변경합니다.");
            }
        });
        // select 메소드를 호출하여 리스너의 onSelect 메소드를 실행
        checkBox1.select();
    }
}
