package functionI;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.function.Supplier;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 2:51
 */
public class Java8Supplier1 {

    private static final DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public static void main(String[] args) {
        Supplier<LocalDateTime> s = LocalDateTime::now;
        LocalDateTime localDateTime = s.get();
        System.out.println(localDateTime);

        Supplier<String> s1 = () -> dtf.format(LocalDateTime.now());
        System.out.println(s1.get());
    }
}
