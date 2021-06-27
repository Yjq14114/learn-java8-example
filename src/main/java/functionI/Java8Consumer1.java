package functionI;

import java.util.List;
import java.util.function.Consumer;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 2:32
 */
public class Java8Consumer1 {
    public static void main(String[] args) {
        Consumer<String> result = System.out::println;
        result.accept("java");

    }

    static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T t: list
             ) {
            consumer.accept(t);
        }

    }
}
