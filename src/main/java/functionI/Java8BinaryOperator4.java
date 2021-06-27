package functionI;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 1:21
 */
public class Java8BinaryOperator4 {
    public static void main(String[] args) {
        Developer dev1 = new Developer("jordan", BigDecimal.valueOf(9999));
        Developer dev2 = new Developer("jack", BigDecimal.valueOf(8888));
        Developer dev3 = new Developer("jaden", BigDecimal.valueOf(10000));
        Developer dev4 = new Developer("ali", BigDecimal.valueOf(2000));
        Developer dev5 = new Developer("mkyong", BigDecimal.valueOf(1));

        List<Developer> list = Arrays.asList(dev1, dev2, dev3, dev4, dev5);

        Comparator<Developer> comparing = Comparator.comparing(Developer::getSalary);

        BinaryOperator<Developer> bo = BinaryOperator.maxBy(comparing);

        Developer result = find(list, bo);

        System.out.println(result.toString());

        Developer developer = find(list, BinaryOperator.minBy(Comparator.comparing(Developer::getSalary)));

        System.out.println(developer.toString());

    }

    /**
     *
     * @param list
     * @param accumulator
     * @return
     */
    public static<T extends Developer> T  find(List<T> list, BinaryOperator<T> accumulator) {
        T result = null;
        for (T t:list
             ) {
            if (result == null) {
                result = t;
            } else {
                result = accumulator.apply(result, t);
            }
        }
        return result;
    }
}
