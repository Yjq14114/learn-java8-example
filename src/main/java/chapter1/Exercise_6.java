package chapter1;

/**
 * Created by yjq14 on 2017/1/3.
 * 编写一个捕获所有异常的uncheck方法
 * 再将它改造为不需要检查异常的方法
 */
public class Exercise_6{

    public static void main(String[] args){
        RunnableInterface runnableEx = new RunnableExImpl();
        Thread thread = new Thread(()-> {
            System.out.println("zzz");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        });
        thread.start();
        new Thread(runnableEx.unCheck(()->{
            System.out.println("zzz");
            Thread.sleep(1000);
        })).start();
        //此处不能用callable，因为它需要返回值
        new Thread(runnableEx.unCheckWithCallable(()->{
            System.out.println("zzz");
            Thread.sleep(1000);
            return null;
        })).start();
    }
}