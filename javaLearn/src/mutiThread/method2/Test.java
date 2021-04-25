package mutiThread.method2;

import mutiThread.TortoiseThread;

/**
 * @description:
 *
 *      功能：龟兔赛跑
 *      技能：线程的创建和启动
 * @author: wangzi
 * @time: 2021/4/24 11:02
 */
public class Test {
    public static void main(String[] args) {
        //创建线程
        Runnable runnable = new TortoiseRunnable();

        //runnable.  接口就一个run方法
        Thread thread = new Thread(runnable);
        Thread t2 = new Thread(runnable);
        Thread t3 = new Thread(runnable);
        //启动线程
        thread.start();

        while (true){
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
        }
    }
}
