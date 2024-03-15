package collection;

import javax.lang.model.type.ArrayType;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class ArrayUtil {
    public static void main(String[] args) {
        // Arrays 배열을 다루기 위한 메서드를 제공하는 유틸리티 클래스
        int[] numbers = {9, 4, 6, 2, 3, 5, 1};

        // Arrays.toString() : 배열을 문자열로 변환
        System.out.println("numbers = " + Arrays.toString(numbers));

        Arrays.sort(numbers);
        System.out.println("정렬된 numbers = " + Arrays.toString(numbers));

        // Arrays.binarySearch() : 이진 탐색으로 요소의 index 찾기
        int index = Arrays.binarySearch(numbers, 1);
        System.out.println("숫자 1의 index: " + index);

        // Arrays.fill(배열, 값) : 배열을 특정 값으로 채움
        Arrays.fill(numbers, 10);
        System.out.println("10으로 채워진 numbers = " + Arrays.toString(numbers));

        int[] arr1 = {1, 2, 3};
        int[] arr2 = {1, 2, 4};
        boolean isEquals = Arrays.equals(arr1, arr2);
        System.out.println("배열 같은지 여부 equals: " + isEquals);

        // Arrays.deepEquals() : 다차원 배열 비교
        String[][] data1 = {{"a", "b"}, {"c", "d"}};
        String[][] data2 = {{"a", "b"}, {"c", "d"}};
        boolean isEqual2 = Arrays.deepEquals(data1, data2);
        System.out.println("isEqual2 = " + isEqual2);

        // Arrays.copyOf()
        int[] originArr = {1, 2, 3, 4, 5};
        int[] copyArr = Arrays.copyOf(originArr, originArr.length);
        System.out.println("copyArr = " + Arrays.toString(copyArr));

        // 배열의 비교 요소
        // 길이가 크면 큰 것, 길이가 같으면, 배열의 요소 하나씩 비교해서
        // 인덱스 0부터 차례대로 비교하여 큰 요소가 큼.
        int[] array1 = {1, 2, 3};
        int[] array2 = {1, 2, 3};
        int[] array3 = {1, 3, 2};
        int compared = Arrays.compare(originArr, copyArr);
        System.out.println("compared = " + compared);
        System.out.println(Arrays.compare(array1, array2));  // 같으면 0
        System.out.println(Arrays.compare(array1, array3));  // 음수 : array1 < array3
        System.out.println(Arrays.compare(array3, array1));  // 양수 : array3 > array1

        // Arrays.copyOfRange(원본, 시작인덱스, 끝인덱스) : 부분적으로 배열의 일부분을 복사
        int[] copyOfRangeArr = Arrays.copyOfRange(originArr, 1, 3);
        System.out.println("Arrays.toString(copyOfRangeArr) = " + Arrays.toString(copyOfRangeArr));

        // Arrays.asList(요소, 요소, ...) : 배열을 고정크기의 리스트로 변환
        String[] strArr = {"a", "b", "c"};
        // ArrayList<String> List = Arrays.asList(strArr); // ArraysList 와는 다름
        ArrayList<String> arrayList = new ArrayList<>(Arrays.asList(strArr));
        arrayList.addAll(Arrays.asList("d", "e", "f"));

        // 배열을 소스로 하는 stream 을 생성 => 스트림 API 사용 가능
        // 배열을 소스로 하는 stream을 생성 => 스트림 API 사용 가능
        Stream<String> stream = Arrays.stream(strArr);
        stream.forEach(System.out::println);
    }
}