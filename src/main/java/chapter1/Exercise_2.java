package chapter1;

import java.io.File;
import java.io.FileFilter;

/**
 * Created by yjq14 on 2017/1/1.
 */
public class Exercise_2 {
    /**
     *
     * @param args
     */
    public static void main(String[] args) {
        String pathname = "G:\\soft";
        File file = new File(pathname);
//        File[] files = file.listFiles(new FileFilter() {
//            @Override
//            public boolean accept(File pathname) {
//                return pathname.isDirectory();
//            }
//        });
//        File[] files = file.listFiles(pathname1 -> pathname1.isDirectory());
        File[] files = file.listFiles(File::isDirectory);
        for (File file1:files) {
            System.out.println(file1);
        }
    }
}
