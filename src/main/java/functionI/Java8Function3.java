package functionI;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;

/**
 * convert list into a map
 */
public class Java8Function3 {
    public static void main(String[] args) {
        Java8Function3 obj = new Java8Function3();
        List<String> list = Arrays.asList("node", "c++", "java", "javascript");
        Map<String, Integer> map = obj.convertListToMap(list, String::length);
        System.out.println(map);
        Map<String, Integer> map2 = obj.convertListToMap(list, obj::getLength);
        System.out.println(map2);
    }

    public <T,R>Map<T, R> convertListToMap(List<T> list, Function<T,R> func) {
        Map<T,R> result = new HashMap<>();
        list.forEach(item->result.put(item, func.apply(item)));
        return result;
    }

    public Integer getLength(String str) {
        return str.length();
    }
}
