package functionI;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author yjq
 */
public class Java8BiFunction1 {

    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = Integer::sum;
        Integer apply = func.apply(1, 2);
        System.out.println(apply);
        BiFunction<Integer, Integer, Double> func2 = Math::pow;
        Double result2 = func2.apply(2, 4);
        System.out.println(result2);
        BiFunction<Integer, Integer, List<Integer>> func3 = (x1,x2) -> Collections.singletonList(x1 + x2);
        List<Integer> apply1 = func3.apply(1, 2);
        System.out.println(apply1);

    }
}
