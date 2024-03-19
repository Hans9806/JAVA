package stream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.OptionalDouble;
import java.util.stream.IntStream;

public class MapEx {
    public static void main(String[] args) {
        List<Student> studentList = new ArrayList<>();
        studentList.add(new Student("홍길동", 80));
        studentList.add(new Student("홍길동", 95));
        studentList.add(new Student("홍길동", 88));

        studentList.stream()
                .mapToInt(student -> student.getScore())
                .forEach(System.out::println);

        double average = studentList.stream()  // 생성 : 학생 객체 스트림
                .mapToInt(Student::getScore)           // 중간 : 점수 정수 스트림 변환
                .average()                            // 최종 : 점수의 평균 => Optional
                .getAsDouble();

        System.out.println("average = " + average);

        int[] intArray = {1,2,3,4,5};
        IntStream intstream = Arrays.stream(intArray);

        intstream
                .asDoubleStream()    // 중간 : 실수 스트림 변환
                .forEach(System.out::println);  // 최종

        // flatMap : 하나의 요소를 여러개의 요소로 변환한 스트림을 반환
        List<String> stringList = new ArrayList<>(
                List.of("Hello, Java and Stream",   // ["Hello, Java, and, ... ]
                        "I am a developer")         // [ "I", "am", ... ]
        );                                        // =>[ "Hello"..."I",... ]

        // 문장 스트림을 단어 스트림으로 변환하여 출력
        stringList.stream()
                .flatMap(sentence -> Arrays.stream(sentence.split(" ")))
                .forEach(System.out::println);
    }
}
