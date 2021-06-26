package functionI;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaMoney {
    public static void main(String[] args) {
        Function<String, Integer> func = String::length;
        Function<List<String>, Integer> func2 = List::size;
        // 计算某个字符串的长度
        Integer apply = func.apply("yangjiaqi");
        List<String> collect = Stream.of("yang", "jia", "qi").collect(Collectors.toList());
        Integer apply1 = func2.apply(collect);
        System.out.println(apply);
        System.out.println(apply1);
    }
}
