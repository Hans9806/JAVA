package io_stream.serial;

import java.io.Serializable;

public class Person implements Serializable {
    // serialVersionUID : ����ȭ�Ͽ� �ְ���� �ش� Ŭ������ ����
    // ��ü�� �����ʰ� ���� ���� ��õ� Ŭ������ ������ �ٸ� ��츦 ���
    // ���� �������� ������ �ڵ����� ����
    private static final long serialVersionUID = 1;

    private String name;
    private int age;
    private double height;
    private boolean married;

    private double weight;

    // ����ȭ�� ���� ��ü Ÿ���� ������ �ش� ��ü�� Serializable �� �����ؾ� �Ѵ�.
    private Career career;

    public Person(String name, int age, double height, boolean married, double weight, Career career) {
        this.name = name;
        this.age = age;
        this.height = height;
        this.married = married;
        this.weight = weight;
        this.career = career;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", height=" + height +
                ", married=" + married +
                ", weight=" + weight +
                ", career=" + career +
                '}';
    }
}
