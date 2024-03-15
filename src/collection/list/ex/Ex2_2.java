package collection.list.ex;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Ex2_2 {
    public static void main(String[] args) {
        List<String> strings = new ArrayList<>();
        strings.addAll(List.of("Hello", "World", "Java", "Programming"));
        Iterator<String> iterator = strings.iterator();

        while(iterator.hasNext()){
            String s = iterator.next();
            if (s.length() <= 5) {
                iterator.remove();
            }
        }
        System.out.println(strings);
    }
}
