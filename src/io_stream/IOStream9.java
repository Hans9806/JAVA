package io_stream;

import java.io.*;

public class IOStream9 {
    // �⺻ ������Ÿ�� ������Ʈ��
    public static void main(String[] args) throws IOException {
        // ���� ��� ��Ʈ�� + ���� ��Ʈ�� ����

        String sourcePath = "src/io_stream/data.db";
        FileOutputStream fos = new FileOutputStream(sourcePath);
        DataOutputStream dos = new DataOutputStream(fos);

        // �⺻ Ÿ���� ����
        dos.writeInt(100);
        dos.writeDouble(80.5);
        dos.writeUTF("ȫ�浿");
        dos.writeBoolean(true);

        dos.flush();        // ���� ����
        dos.close();

        FileInputStream fis = new FileInputStream(sourcePath);
        DataInputStream dis = new DataInputStream(fis);

        // �⺻ Ÿ���� �б�
        // ���� : ���� ���� ������ �ݵ�� �� ���� ������ ������ ������ �о�� ��.
        int i = dis.readInt();
        double d = dis.readDouble();
        String s = dis.readUTF();
        boolean b = dis.readBoolean();

        System.out.println("i = " + i);
        System.out.println("d = " + d);
        System.out.println("s = " + s);
        System.out.println("b = " + b);

        dis.close();
    }
}
