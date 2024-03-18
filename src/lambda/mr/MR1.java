package lambda.mr;

import access_modifier.second.C;

import java.awt.color.CMMException;

public class MR1 {
    public static void main(String[] args) {
        Person person = new Person();
        // person.action((x, y) -> Computer.staticMethod(x, y));
        person.action(Computer::staticSumMethod);

        // 인스턴스 메서드
        Computer comInstance = new Computer();
        person.action(comInstance::instanceMultiMethod);
    }
}
