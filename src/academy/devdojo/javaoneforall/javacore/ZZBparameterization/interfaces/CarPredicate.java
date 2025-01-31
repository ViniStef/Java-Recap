package academy.devdojo.javaoneforall.javacore.ZZBparameterization.interfaces;

import academy.devdojo.javaoneforall.javacore.ZZBparameterization.domain.Car;

@FunctionalInterface
public interface CarPredicate {
    boolean test(Car car);
}

// (Parameters) -> <expression>
// (Car x) -> x.getColor().equals("green");
// () -> System.out.println("lalala");

// Lambda expressions can only work with functional interfaces (interfaces that have only one abstract method) and the
// abstract method tells you everything you need to know about your lambda expression.
