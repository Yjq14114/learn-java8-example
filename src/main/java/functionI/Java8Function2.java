package functionI;

import java.util.function.Function;

public class Java8Function2 {
     public static void main(String[] args) {

        Function<String, Integer> func = String::length;

        Function<Integer, Integer> func2 = x -> x * 2;

        Integer result = func.andThen(func2).apply("mkyong");
        System.out.println(result);

    }
}
