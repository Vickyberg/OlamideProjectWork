package ChapterSeven;

import java.util.LinkedList;
import java.util.Queue;

public class WorkingWithQueue {
    public static void main(String[] args) {
        Queue<Person> supermarket = new LinkedList<>();
        supermarket.add(new Person("Alex",22));
        supermarket.add(new Person("Zanny",18));
        supermarket.add(new Person("Kola",42));

        System.out.println(supermarket.size());
        System.out.println(supermarket.peek());
        System.out.println(supermarket.poll());
        System.out.println(supermarket.size());

    }

     static record   Person(String name, int age){}
}
