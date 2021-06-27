package functionI;

import java.util.function.BiFunction;
import java.util.function.BinaryOperator;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 0:32
 */
public class Java8BinaryOperator1 {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> func = Integer::sum;
        Integer apply = func.apply(2, 3);
        System.out.println(apply);
        BinaryOperator<Integer> func2 = Integer::sum;
        Integer apply1 = func2.apply(2, 3);
        System.out.println(apply1);
    }
}
