package functionI;

import java.util.List;
import java.util.function.BinaryOperator;
import java.util.function.IntBinaryOperator;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 1:10
 */
public class Java8BinaryOperator3 {

    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int math = math(numbers, 0, Integer::sum);
        System.out.println(math);
    }

    /**
     * if the math operations involve primitive types like int,change to IntBinaryOperator for better performance
     * @param list
     * @param init
     * @param accumulator
     * @return
     */
    public static int math(int[] list, int init, IntBinaryOperator accumulator) {
        int result = init;
        for (int t: list) {
            result = accumulator.applyAsInt(result, t);
        }
        return result;
    }

}
