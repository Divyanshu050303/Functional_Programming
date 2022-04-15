package FunctionalInterface;

import java.util.Stack;
import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        //Function takes 1 argument and produce 1 result
        int increment=increment(1);
        System.out.println(increment);
        int increment2=incrementByOneFunction.apply(1);
        System.out.println(increment2);
        int multiply=multiplyBY10Function.apply(increment);
        System.out.println(multiply);

        Function<Integer, Integer> addBy1AndThenMultiplyBy10=
                incrementByOneFunction.andThen(multiplyBY10Function);

        System.out.println(addBy1AndThenMultiplyBy10.apply(3));
        //BiFunction takes 2 argument and produce 1 result
        // both function have same work but Ist was written as java method
        //and 2nd was written as Functional programming
        System.out.println(incrementByOneAndMultiply(4, 100));
        System.out.println(incrementBYOneAndMultiplyBiFunction.apply(4, 100));
    }
    // Both the function have same work but

    //this is written in functional programming
    static Function<Integer, Integer> multiplyBY10Function=number->number*10;
    static Function<Integer, Integer> incrementByOneFunction=number->number+1;
    static BiFunction<Integer, Integer, Integer> incrementBYOneAndMultiplyBiFunction=
            (numberToIncrementByOne, numberToMultiply)
                    ->(numberToIncrementByOne+1)*numberToMultiply;
    static int incrementByOneAndMultiply(int number, int numToMultiplyBy){
        return (number+1)*numToMultiplyBy;
    }
    //and this one is written in simple java programming
    static int increment(int number){
        return number+1;
    }
}
