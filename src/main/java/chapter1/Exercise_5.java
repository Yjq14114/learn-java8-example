package chapter1;

/**
 * Created by yjq14 on 2017/1/3.
 */
public class Exercise_5 {
    static int b = 20;
    public static void main(String[] args) {
//        Thread thread = new Thread(new Runnable() {
//            @Override
//            public void run() {
//                b++;
//                System.out.println(b);
//            }
//        });
        Thread thread = new Thread(Exercise_5::run);
        thread.start();
    }

    private static void run() {
        b++;
        System.out.println(b);
    }
}
