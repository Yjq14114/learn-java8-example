package chapter3;

import java.util.function.IntConsumer;

/**
 * @author yjq14
 */
public class RepeatDemo {
    /**
     * 重复执行代码n次
     * 为什么要使用 IntConsumer 而不是runnable
     * 需要用到用户提供的参数
     * @param n
     * @param action
     */
    public static void repeat(int n, IntConsumer action){
        for (int i = 0; i <n ; i++) {
            action.accept(i);
        }
    }

    /**
     * 无参数的版本
     * @param n
     * @param run
     */
    public static void repeat2(int n, Runnable run){
        for (int i = 0; i < n; i++) {
            run.run();
        }
    }

    public static void main(String[] args) {
        RepeatDemo.repeat(10, i-> System.out.println("countDown: " + (9-i)));
        RepeatDemo.repeat2(10, () -> System.out.println("hello,world!"));
    }
}
