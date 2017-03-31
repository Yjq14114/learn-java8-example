package chapter1;

import java.util.concurrent.Callable;

/**
 * Created by yjq14 on 2017/3/13.
 */
public class RunnableExImpl {
    public static Runnable unCheck(RunnableEx runnableEx) {
        return () -> {
            try {
                runnableEx.run();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }

    public static Runnable unCheckWithCallable(Callable callable) {
        return () -> {
            try {
                callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
