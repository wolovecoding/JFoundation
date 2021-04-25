package mutiThread.syn4;

import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

/**
 * @description:
 *      方法3  锁
 *      买锁  上锁  解锁
 *
 *      问题：
 *          如果代码块出现异常，就永远也开不了锁了。
 *
 *          解决方案
 *              自己想
 *     Lock锁和synchronized区别
 *     1.Lock是显示锁（手动开启和关闭，别忘了关闭），synchronized是隐式锁
 *     2.Lock只有代码块锁，synchronized有代码块锁和方法锁
 *     3.使用Lock锁，JVM将花费较少的时间来调度线程，性能更好，并且具有更好的扩展性（提供更多的子类）
 *
 *
 *     优先使用顺序：
 *      Lock ----同步代码块（已进入了方法内部）-----同步方法（在方法体之外）
 * @author: wangzi
 * @time: 2021/4/24 13:54
 */
public class AccountRunnable implements Runnable{

    private Lock lock = new ReentrantLock();
    private Account account = new Account();
    @Override
    public void run() {
        //此处省略20句

        //核心操作
        //上锁
        try{
            lock.lock();
            int i=400;
            if (i<account.getBalance()){
                try {
                    Thread.sleep(1);  //测试安全问题
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //就取款并输出结果
                account.withDraw(i);
                System.out.println(Thread.currentThread().getName()+"取款成功，当前余额"+account.getBalance());
            }else {
                //输出结果，余额不足
                System.out.println(Thread.currentThread().getName()+"余额不足，取款失败，当前余额"+account.getBalance());
            }
        }
//        catch (Exception e){
//            e.printStackTrace();
//        }
        finally {
            //开锁
            lock.unlock();
        }
        //此处省略30句
    }


}
