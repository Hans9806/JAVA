package inheritance.ex;

public class Ex3 {
    public static void main(String[] args) {
        Professor professor = new Professor("John Doe",40,"컴퓨터 과학");
        Student student = new Student("Jane Smith",20,20201234);

        professor.introduce();
        student.introduce();
    }
}
