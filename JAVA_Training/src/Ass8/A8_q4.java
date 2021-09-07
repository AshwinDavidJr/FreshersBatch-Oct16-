package Ass8;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class A8_q4 {

    public static void main(String[] args) {

        List<String> list1 = new ArrayList<String>();

        list1.add("hello");
        list1.add("hello world");
        list1.add("hello guys");
        list1.add("hello fellows");
        list1.add("hello team");
        list1.add("hello people");
        list1.add("hello students");
        list1.removeIf(s->s.length()%2!=0);

        list1.forEach(System.out::println);

    }

}
