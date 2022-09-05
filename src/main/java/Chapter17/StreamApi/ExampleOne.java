package Chapter17.StreamApi;

import java.util.Random;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Stream;

public class ExampleOne {
    public static void main(String[] args) {
        Stream<Integer> numbers = Stream.empty();

        Stream<Integer> numbers2 = Stream.of(10,20,30);

        Supplier<Integer> sup = () -> new Random().nextInt();
        Stream<Integer> numberList = Stream.generate(sup);

     //   numberList.forEach((number) -> System.out.println(number));

        UnaryOperator<Integer> unaryOperator = (number)->number+1;
        Stream<Integer> badCharacters = Stream.iterate(1,unaryOperator).limit(10);
        badCharacters.forEach((c)-> System.out.println(c));

    }
}
