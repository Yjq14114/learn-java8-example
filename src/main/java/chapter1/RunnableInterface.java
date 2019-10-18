package chapter1;

import java.util.concurrent.Callable;

/**
 * @Author: YangJiaQi
 * @Date: 2019/10/18 22:52
 */
public interface RunnableInterface {
    /**
     *
     * @param runnableEx
     * @return
     */
    Runnable unCheck(RunnableEx runnableEx);

    /**
     *
     * @param callable
     * @return
     */
    Runnable unCheckWithCallable(Callable callable);
}
