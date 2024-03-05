package library.lang;

public class DeepCopy implements Cloneable {
    int[] array;
    String str;
    int[][] deepArray;      // 차원이 높아질수록 모두 깊은 복사해야 함
    String[] strArray;

    public DeepCopy(int[] array) {
        this.array = array;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        DeepCopy cloned = (DeepCopy) super.clone();
        // 내부 필드의 참조값( 배열, 참조타입 등)을 다시 한 번 복사해야 됨
        cloned.array = this.array.clone();
        cloned.deepArray = this.deepArray.clone();
        return cloned;
    }
}
