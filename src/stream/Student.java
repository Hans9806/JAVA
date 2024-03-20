package stream;

public class Student {
    private String name;
    private int score;

    public Student(String name, int score) {
        this.name = name;
        this.score = score;
    }
    public String getName() {
        return name;
    }
    public int getScore() {
        return score;
    }
    public int compareTo(Student other) {
        return name.compareTo(other.getName());
    }

}
