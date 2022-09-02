package Chapter17;

import java.util.stream.IntStream;

public class StreamFilterMapReduce {
    public static void main(String[] args) {
        System.out.printf("The answer : %d%n", IntStream.rangeClosed(1, 10)
                .filter(x -> x % 2 == 0)
                .map(x -> x * 3)
                .sum());

        System.out.printf("The answer is: %d%n", IntStream.rangeClosed(1,10)
                .filter((int x) -> x % 3 ==0)
                .map(x-> x *2)
                .sum());
    }
}
