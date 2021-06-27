package functionI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 2:10
 */
public class Java8Predicate {
    public static void main(String[] args) {
        Predicate<Integer> noGreaterThan5 = x -> x>5;
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        List<Integer> collect = list.stream()
                .filter(noGreaterThan5)
                .collect(Collectors.toList());

        System.out.println(collect); // [6, 7, 8, 9, 10]
    }
}
