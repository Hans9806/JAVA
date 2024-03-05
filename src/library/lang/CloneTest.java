package library.lang;

public class CloneTest {
    public static void main(String[] args) throws CloneNotSupportedException {
        int[] array = {1, 2, 3, 4};
        ShallowCopy original = new ShallowCopy(array);
        ShallowCopy clone = (ShallowCopy) original.clone();

        System.out.println("=========얕은 복사==========");
        //변경 전

        for (int i : original.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : clone.array) {
            System.out.print(i + " ");
        }
        System.out.println("\n ====================================");

        // 복제한 객체의 배열(참조 필드)의 일부 요소를 변경
        clone.array[3] = 10;

        // 변경 후

        for (int i : original.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : clone.array) {
            System.out.print(i + " ");
        }

        System.out.println("\n ========깊은 복사========");

        DeepCopy originalDeep = new DeepCopy(array);
        DeepCopy cloneDeep = (DeepCopy) originalDeep.clone();


        // 변경 전
        for (int i : originalDeep.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : cloneDeep.array) {
            System.out.print(i + " ");
        }
        System.out.println("\n ====================================");

        cloneDeep.array[3] = 33;

        // 변경 후
        for (int i : originalDeep.array) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i : cloneDeep.array) {
            System.out.print(i + " ");
        }
        // 2차원 배열 변경
        originalDeep.deepArray[0][0] = 9;
    }
}