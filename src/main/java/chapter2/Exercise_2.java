package chapter2;

import com.google.common.io.Resources;

import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;

public class Exercise_2 {
private static String path = "";
    static {
        File file = new File(Resources.getResource("file/morallywhatishelimit.txt").getPath());
        path = file.getPath();
    }
    private static void getCompareLength() throws IOException {
        String content = new String(Files.readAllBytes(Paths.get(path)), StandardCharsets.UTF_8);
        List<String> words = Arrays.asList(content.split("[\\P{L}]+"));
        words.stream().filter(w->w.length()==5);
    }
    public static void main(String[] args) {

    }
}
