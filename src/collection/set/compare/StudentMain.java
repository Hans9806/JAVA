package collection.set.compare;

import java.util.Arrays;
import java.util.TreeSet;

public class StudentMain {
    public static void main(String[] args) {
        Student ȫ�浿 = new Student("ȫ�浿",30,170.0);
        Student �Ӳ��� = new Student("�Ӳ���",40,185.4);
        Student ����ġ = new Student("����ġ",25,175.2);
        Student ��� = new Student("���",45,163.6);

        TreeSet<Student> studentTreeSet = new TreeSet<>();

        studentTreeSet.addAll(Arrays.asList(ȫ�浿,�Ӳ���,����ġ,���));

        for (Student student : studentTreeSet) {
            System.out.println(student);
        }
        System.out.println("====== �̸� �� ���� ======");
        // �̸� ���� ����
        StudentComparator nameStudentComparator = new StudentComparator(
                StudentComparator.SortBy.NAME,StudentComparator.SortDirection.ASC);
        // ���� �������� �̸� ����
        TreeSet<Student> nameSortSet = new TreeSet<>(nameStudentComparator);
        // ���� ��� ����
        nameSortSet.addAll(Arrays.asList(ȫ�浿,�Ӳ���,����ġ,���));
        for (Student student : nameSortSet) {
            System.out.println(student);
        }
        TreeSet[] treeSets = {
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.AGE,
                                StudentComparator.SortDirection.ASC
                        )
                ),
                new TreeSet<Student>(
                        new StudentComparator(
                                StudentComparator.SortBy.HEIGHT,
                                StudentComparator.SortDirection.ASC
                        )
                )
        };
        for (TreeSet<Student> treeSet : treeSets) {
            treeSet.addAll(
                    Arrays.asList(ȫ�浿, �Ӳ���, ����ġ, ���)
            );
            System.out.println("=================================");
            for (Student student : treeSet) {
                System.out.println(student);
            }
        }
    }
}
