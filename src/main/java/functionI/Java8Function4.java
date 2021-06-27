package functionI;

import com.google.common.collect.Lists;
import org.apache.commons.codec.digest.DigestUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

/**
 * @author yjq list -> list
 */
public class Java8Function4 {

    public static void main(String[] args) {
        Java8Function4 obj = new Java8Function4();
        List<String> list = Lists.newArrayList("node", "c++", "java", "javascript");
        List<String> result = obj.map(list, obj::sha256);
        result.forEach(System.out::println);
    }


    public <T,R> List<R> map(List<T> list, Function<T, R> func) {
        List<R> result = Lists.newArrayList();
        list.forEach(item->result.add(func.apply(item)));
        return result;
    }

    public String sha256(String str) {
        return DigestUtils.sha256Hex(str);
    }
}
