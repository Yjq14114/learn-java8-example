package functionI;

import com.google.common.collect.Lists;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/27 23:56
 */
public class Java8BiFunction4 {

    public static void main(String[] args) {
        Java8BiFunction4 obj = new Java8BiFunction4();
        List<String> list = Lists.newArrayList("node", "java", "c++", "javascript");
        List<String> result = obj.filterList(list, 3, obj::filterByLength);
        System.out.println(result);
        List<String> result1 = obj.filterList(list, "c", obj::filterByStarts);
        System.out.println(result1);
        List<Integer> number = Lists.newArrayList(1,2,3,4,5,6);
        List<Integer> integers = obj.filterList(number, 4, obj::filterBySurplus);
        System.out.println(integers);


    }

    public String filterByLength(String str, Integer size) {
        if (str.length() > size) {
            return str;
        } else {
            return null;
        }
    }

    public Integer filterBySurplus(Integer a, Integer b) {
        if (a % b == 0) {
            return a;
        } else {
            return null;
        }
    }

    public String filterByStarts(String str, String start) {
        if (str.startsWith(start)) {
            return str;
        } else {
            return null;
        }
    }

    public <T, U, R> List<R> filterList(List<T> list, U condition, BiFunction<T, U, R> func) {
        List<R> result = new ArrayList<>();
        list.forEach(item -> {
            R apply = func.apply(item, condition);
            if (apply != null) {
                result.add(apply);
            }
        });
        return result;
    }
}
