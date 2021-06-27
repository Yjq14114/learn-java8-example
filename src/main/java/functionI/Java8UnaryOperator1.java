package functionI;

import java.util.function.UnaryOperator;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 2:00
 */
public class Java8UnaryOperator1 {

    public static void main(String[] args) {
        UnaryOperator<Integer> func = x -> x * 2;
        Integer apply = func.apply(2);
        System.out.println(apply);
    }
}
