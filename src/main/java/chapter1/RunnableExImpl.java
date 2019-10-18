package chapter1;

import java.util.concurrent.Callable;

/**
 * Created by yjq14 on 2017/3/13.
 */
public class RunnableExImpl implements RunnableInterface{
    @Override
    public  Runnable unCheck(RunnableEx runnableEx) {
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

    @Override
    public Runnable unCheckWithCallable(Callable callable) {
        return () -> {
            try {
                callable.call();
            } catch (Exception e) {
                throw new RuntimeException(e);
            }
        };
    }
}
