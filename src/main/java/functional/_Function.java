package functional;

import java.util.function.BiFunction;
import java.util.function.Function;

public class _Function {
    public static void main(String[] args) {
        Integer result = incrementByOneFunction.apply(0);
        int result2 = increment(0);


        System.out.println("functional: " + result + " " + "Imperative: " + result2);


        //Encadenar funciones con andThen
        Integer resultadoEncadenado = incrementByOneFunction.andThen(multiplyByTen).apply(0);
        System.out.println(resultadoEncadenado);

        //BIFunctions: en vez de tener un input y producir un ouput, tiene 2 inputs y 1 output.
        //BiFunction<input1, input2, result>
        BiFunction<Integer, Integer, Integer> incrementAndMultiplyBiFunction = (numberToIncrementByOne, multiplier) ->
            (numberToIncrementByOne + 1) * multiplier;


    }



    //IMPERATIVE APPROACH
    static int increment(int a) {
        return a + 1;
    }


    //FUNCTIONAL
    //Function<INPUT, OUTPUT>
   static Function<Integer, Integer> incrementByOneFunction = number -> number + 1;

   static Function<Integer, Integer> multiplyByTen = number -> number * 10;
}
