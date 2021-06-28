package functionI;

import java.util.List;
import java.util.function.Predicate;
import java.util.stream.Collectors;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 17:21
 */
public class HostingRespository {
    public static List<Hosting> filterHosting(List<Hosting> hostings, Predicate<Hosting> predicate) {
        return hostings.stream().filter(predicate).collect(Collectors.toList());
    }
}
