package day11.review.inner;

@FunctionalInterface
public interface Calculator {
    int operate(int n1, int n2);
    default void exponent(int n4){}
}
