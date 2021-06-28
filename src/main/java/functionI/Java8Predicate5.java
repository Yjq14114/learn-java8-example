package functionI;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 2:15
 */
public class Java8Predicate5 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("A", "AA", "AAA", "B", "BB", "BBB");
        List<String> a = StringProcessor.filter(list, x -> x.startsWith("A"));
        System.out.println(a);
    }
}

class StringProcessor {
    static List<String> filter(List<String> list, Predicate<String> predicate) {
        return list.stream().filter(predicate).collect(Collectors.toList());
    }
}
