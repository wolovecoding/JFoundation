package mutiThread.method3;

import java.util.Random;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.FutureTask;

/**
 * @description:
 *      定义线程类的第三种方式
 *          public class RandomThread implements Callable<Integer> {
 *              public Integer call() throws Exception {}}
 *
 *      特点
 *          抛异常    检测一场和运行时异常都可以，  之前的Runnable只能抛出运行时异常
 *          有返回值
 * @author: wangzi
 * @time: 2021/4/24 11:46
 */
public class RandomCallable implements Callable<Integer> {
    @Override
    public Integer call() throws Exception {
        //返回随机数
        return new Random().nextInt(10);
    }

    public static void main(String[] args) throws ExecutionException, InterruptedException {
        //创建一个线程对象
        Callable callable = new RandomCallable();

        FutureTask<Integer> task = new FutureTask<Integer>(callable);

        Thread th = new Thread(task);
        //启动线程
        th.start();
        //得到返回值
        Integer result = task.get();
    }
}
