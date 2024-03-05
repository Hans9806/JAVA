package library.lang.ex.ex1;

public class BankAccount {
    // toString 연습문제
    // 은행 계좌 정보를 관리하는 BankAccount 클래스가 있습니다.
    // 계좌 번호와 소유자 이름, 현재 잔액을 포함하는
    // toString() 메소드를 오버라이드하여 구현해보세요.
    private String accountNumber;
    private String name;
    private double balance;

    public BankAccount(String accountNumber, String name, double balance) {
        this.accountNumber = accountNumber;
        this.name = name;
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "계좌번호 : %s, 이름 : %s, 잔액: %.2f원".formatted(accountNumber, name, balance);
    }

    public static void main(String[] args) {
        BankAccount account = new BankAccount("1111-2222", "홍길동", 10000);

        System.out.println(account);
    }
}
