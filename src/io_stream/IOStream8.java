package io_stream;

import java.io.*;

public class IOStream8 {
    // ������� Buffered ���� ��Ʈ��
    public static void main(String[] args) throws IOException {
        // ��� ����
        String origin1 = "src/io_stream/image.jpg";
        String target1 = "src/io_stream/image_copy.jpg";

        // ����� ��Ʈ�� ����
        FileInputStream fis = new FileInputStream(origin1);
        FileOutputStream fos = new FileOutputStream(target1);

        // �̹��� ������ ����
        long time = copyAndMeasureTime(fis, fos);
        System.out.println("�̹��� ������ ���� �ҿ� �ð� : " + time + "������");

        // ����� ��Ʈ�� ����
        fis.close();
        fos.close();

        // ����� ��Ʈ�� + ���� ��Ʈ��(���� ��Ʈ��)
        String target2 = "src/io_stream/image_copy_buffer.jpg";
        var fis2 = new FileInputStream(origin1);
        var fos2 = new FileOutputStream(target2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        // ���� ��Ʈ�� ����Ͽ� ���� + �ð� ����
        long bufferTime = copyAndMeasureTime(bis, bos);
        System.out.println("���� ��Ʈ���� ����� �̹��� ���� �ҿ� �ð� " + bufferTime + "������");

        bis.close();
        bos.close();
    }

    static long copyAndMeasureTime(InputStream inputStream, OutputStream outputStream) throws IOException {
        long startTime = System.nanoTime();

        // �Է½�Ʈ������ �б⸦ �Ϸ� ��, ��� ��Ʈ������ ���� ����Ʈ�� ���
        while (true) {
            int data = inputStream.read();
            if (data == -1) break;
            outputStream.write(data);
        }

        // �ð� ����
        long endTime = System.nanoTime();
        long time = endTime - startTime;
        return time;
    }
}
