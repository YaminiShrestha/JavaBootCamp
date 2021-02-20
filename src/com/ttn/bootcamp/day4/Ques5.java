package com.ttn.bootcamp.day4;
/**
 * Implement following functional interfaces from java.util.function using lambdas:
 * (1) Consumer
 * (2) Supplier
 * (3) Predicate
 * (4) Function
 */

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class Ques5 {
    public static void main(String[] args) {

//      This interface accepts a single argument and does not return any result.
        Consumer<Integer> sysrootConsumer = number -> System.out.println(number);
        sysrootConsumer.accept(5);

//      This functional interface does not take any argument and produces result of type T
        Supplier<Integer> randomIntegerSupplier = () -> 2;
        System.out.println(randomIntegerSupplier.get());

//      This interface take  a single argument function that returns a boolean value
        Predicate<Integer> isEvenPredicate = number -> number % 2 == 0;
        System.out.println(isEvenPredicate.test(56));

//      This interface take an input of specific type  and return modified output of specified type
        Function<Integer, Integer> squareFunction = number-> number * number;
        System.out.println(squareFunction.apply(12));
    }
}


