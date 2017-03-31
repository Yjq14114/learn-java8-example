package chapter1;

import java.io.File;
import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yjq14 on 2017/1/3.
 */
public class Exercise_4 {
    public static void main(String[] args) {
        String pathname = "G:\\soft";
        File file = new File(pathname);
        File[] files = file.listFiles(File::isDirectory);
//        Arrays.sort(files);
//        Arrays.sort(files, new Comparator<File>() {
//            @Override
//            public int compare(File o1, File o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        Arrays.sort(files,(o1, o2) -> o1.compareTo(o2));
        Arrays.sort(files,File::compareTo);
        for (File directory:files) {
            File[] directorys = directory.listFiles(File::isDirectory);
            Arrays.sort(directorys,File::compareTo);
            System.out.println(directory);
            for (File chid:directorys){
                System.out.println(chid);
            }
        }
    }
}
