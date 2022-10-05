package main;

import java.util.function.*;

public class Foo {
    public static void main(String[] args) {

        Function<Integer, Integer> plus10 = (i) -> i + 10;
        Function<Integer, Integer> multiply2 = (i) -> i * 2;

        Function<Integer, Integer> multi = plus10.compose(multiply2);
        System.out.println(String.valueOf(multi.apply(2)));      //14

        Function<Integer, Integer> multi2 = plus10.andThen(multiply2);
        System.out.println(String.valueOf(multi2.apply(2)));     //24

        Consumer<Integer> printT = (i) -> System.out.printf(String.valueOf(i));
        printT.accept(10);  //10

        Supplier<Integer> get10 = () -> 10;
        System.out.printf(String.valueOf(get10.get()));     //10

        Predicate<String> startWith = (s) -> s.startsWith("hello");
        Predicate<Integer> isEven = (i) -> i%2 == 0;

        UnaryOperator<Integer> plus20 = (i) -> i + 20;
        UnaryOperator<Integer> m2 = (i) -> i * 2;

        System.out.printf(String.valueOf(plus20.andThen(m2).apply(2)));

    }
}
