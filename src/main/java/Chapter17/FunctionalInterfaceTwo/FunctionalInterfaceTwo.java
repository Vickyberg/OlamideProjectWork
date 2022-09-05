package Chapter17.FunctionalInterfaceTwo;

import java.util.Random;
import java.util.function.*;

//Consumer
//BiConsumer
//Supplier
//Predicate
//BiPredicate
//Function
//BiFunction
//UnaryOperator
//BinaryOperator

public class FunctionalInterfaceTwo {
    public static void main(String[] args) {
        Consumer<Integer> consumer = (number) -> System.out.println(number);
        consumer.accept(5);

        BiConsumer<Integer, String> biConsumer = (age, name)-> System.out.println("My name is " +name+" I am "+age+" old");
        biConsumer.accept(10,"Olamide");

        Random random = new Random();
        Supplier<Integer>  supplier = () -> random.nextInt();
        System.out.println(supplier.get());

        //Predicate interface returns boolean expression
        Predicate<String> predicate = (name) -> name.equals("Ashaks");
        System.out.println(predicate.test("Olams"));

        BiPredicate<Integer,String> biPredicate  = (num, character) -> String.valueOf(num).equals(character);
        System.out.println(biPredicate.test(5,"5"));

        Function<String,Integer> function = (word) -> word.length();
        System.out.println(function.apply("Hello!"));

        BiFunction<Integer, Integer,String> biFunction = ( num1, num2) -> String.valueOf(num1 *num2);
        System.out.println(biFunction.apply(2,4));

        UnaryOperator<Integer> unaryOperator = (number)->number*number*number;
        System.out.println(unaryOperator.apply(5));

        BinaryOperator<Integer> binaryOperator = (num1, num2) -> num1 * num2;
        System.out.println(binaryOperator.apply(1,1));
    }
}
