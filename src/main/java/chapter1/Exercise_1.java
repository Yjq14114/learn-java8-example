package chapter1;


import com.sun.istack.internal.NotNull;

import java.util.Arrays;
import java.util.Comparator;

/**
 * Created by yjq14 on 2017/1/1.
 */
public class Exercise_1 {
    /**
     *Arrays.sort方法中的比较器代码的线程
     * 与调用sort的线程是同一个吗？
     */
    public static void main(String[] args) {
        Integer[] arrs = new Integer[]{5,1,3,2,14,23,1};
//        Arrays.sort(arrs,new Comparator<Integer>() {
//            @Override
//            public int compare(Integer o1, Integer o2) {
//                return o1.compareTo(o2);
//            }
//        });
//        Arrays.sort(arrs,(o1, o2) -> o1.compareTo(o2));
        Arrays.sort(arrs,Integer::compareTo);
        Arrays.sort(arrs);
        for (Integer a:arrs) {
            System.out.println(a);
        }

    }
}
