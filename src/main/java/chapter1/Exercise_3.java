package chapter1;

import java.io.File;
import java.io.FilenameFilter;

/**
 * Created by yjq14 on 2017/1/3.
 */
public class Exercise_3 {
    public static void main(String[] args) {
        File file  = new File("D:\\picture\\wallpaper");
        String suffix = ".jpg";
//        String[] files = file.list(new FilenameFilter() {
//            @Override
//            public boolean accept(File dir, String name) {
//                return name.endsWith(suffix);
//            }
//        });
        String[] files = file.list((dir, name) -> name.endsWith(suffix));
        for (String str:files) System.out.println(str);
    }
}