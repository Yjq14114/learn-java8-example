package functionI;

import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class JavaMoney {
    public static void main(String[] args) {
        // T 是String类型  R 是Integer类型
        Function<String, Integer> func = String::length;
        // T 是Integer类型  R 是Integer类型
        Function<Integer, Integer> func2 = x-> x*x;
        // andThen 方法 先求出fun的值，然后把fun的值作为入参传给func2
        Integer hello = func.andThen(func2).apply("hello");
        System.out.println(hello);
        Function<String,Integer> fun3 = String::length;
        Function<String,String> fun4 = String::toLowerCase;
        // compose 方法 fun3是以fun4的返回值作为入参来进行计算
        Integer billie = fun3.compose(fun4).apply("billie");
        String str = "billie";
        System.out.println(str.hashCode());
        System.out.println(billie);

        Function<String, String> identity = Function.identity();
        String hello1 = identity.apply("hello");
        System.out.println(hello1);
    }

}
