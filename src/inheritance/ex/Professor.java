package inheritance.ex;

public class Professor extends Person{
    private String department;

    public Professor(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }
    @Override
    public void introduce() {
        super.introduce();
        System.out.println(department+"학과에서 근무합니다.");
    }
}
