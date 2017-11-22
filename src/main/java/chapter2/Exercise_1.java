package chapter2;

import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import static java.lang.System.out;

/**
 * @author yjq14
 */
public class Exercise_1 {
    private static String path = "";
    static {
        File file = new File(Resources.getResource("file/morallywhatishelimit.txt").getPath());
        path = file.getPath();
    }
    public static void getContents() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("[\\P{L}]+"));

        long begintime= System.nanoTime();
// 正文
        long count = words.stream().filter(w -> w.length() >= 12).count();
        long endtime = System.nanoTime();
        long costTime = (endtime - begintime) / 1000;
        out.println("count:"+costTime);
        long begintime1= System.nanoTime();
// 正文
        long parallel = words.parallelStream().filter(w -> w.length() >= 12).count();
        long endtime1 = System.nanoTime();
        long costTime1 = (endtime - begintime) / 1000;
        out.println("parallel:"+costTime1);
    }
    public static void getForCurrent() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("[\\P{L}]+"));
        for (String w :
                words) {
            Thread thread = new Thread(() -> {
                out.println(w);
            });
            thread.start();
        }
//        System.out.println(count);

}
    public static void main(String[] args) throws IOException {
//        Exercise_1.getContents();
        Exercise_1.getForCurrent();
    }
}
