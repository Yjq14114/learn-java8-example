package functionI;

import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 1:02
 */
public class Java8BinaryOperator2 {


    public static void main(String[] args) {
        Integer[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        Integer math = math(Arrays.asList(numbers), 0, Integer::sum);
        System.out.println(math);
    }

    /**
     * this example simulates a stream.reduce() to sum all the Integer.
     * @param list
     * @param init
     * @param accumulator
     * @param <T>
     * @return
     */
    public static <T> T math(List<T> list, T init, BinaryOperator<T> accumulator) {
        T result = init;
        for (T t: list) {
            result = accumulator.apply(result, t);
        }
        return result;
    }
}
