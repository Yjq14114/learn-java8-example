package functionI;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/27 17:36
 */
public class Java8BiFunction2a {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Double>  func1 = Math::pow;
        Function<Double, String> func2 = (input) -> "Result: " + input;
        String apply = func1.andThen(func2).apply(2, 4);
        System.out.println(apply);

    }
}

