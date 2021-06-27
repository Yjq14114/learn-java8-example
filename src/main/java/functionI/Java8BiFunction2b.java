package functionI;

import java.util.function.BiFunction;
import java.util.function.Function;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/27 17:59
 */
public class Java8BiFunction2b {

    public static void main(String[] args) {

        String s = powToString(2, 2,
                Math::pow,
                (r) -> "result: " + r);
        System.out.println(s);

        String convert = convert(2, 4, Math::multiplyExact, r -> "Multiply: " + r);
        System.out.println(convert);



    }

    public static <R> R powToString(Integer a1, Integer a2,
                                    BiFunction<Integer, Integer, Double> func,
                                    Function<Double,R> func2) {
        return func.andThen(func2).apply(a1, a2);
    }

    public static <A1, A2, R1, R2> R2 convert(A1 a1, A2 a2,
                                              BiFunction<A1, A2, R1> func,
                                              Function<R1, R2> func2) {
        return func.andThen(func2).apply(a1, a2);
    }
}
