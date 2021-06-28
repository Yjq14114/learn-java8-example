package functionI;

import java.util.Arrays;
import java.util.List;

/**
 * @author yang.jiaqi@vpclub.cn
 * @date 2021/6/28 17:23
 */
public class Java8Predicate7 {
    public static void main(String[] args) {
        Hosting h1 = new Hosting(1, "amazon", "aws.amazon.com");
        Hosting h2 = new Hosting(2, "linode", "linode.com");
        Hosting h3 = new Hosting(3, "liquidweb", "liquidweb.com");
        Hosting h4 = new Hosting(4, "google", "google.com");
        List<Hosting> hostings = Arrays.asList(h1, h2, h3, h4);
        List<Hosting> g = HostingRespository.filterHosting(hostings, x -> x.getName().startsWith("g"));
        System.out.println(g);
    }
}
