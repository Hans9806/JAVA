package javatest4;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Ex1_2 {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        long startTime;
        long endTime;

        startTime = System.nanoTime();
        for (int i = 0; i < 1_000_000; i++) {
            arrayList.add(0,String.valueOf(i));
        }
        endTime = System.nanoTime();
        System.out.println("반복문 실행 시간: " +( endTime - startTime));
    }
}
