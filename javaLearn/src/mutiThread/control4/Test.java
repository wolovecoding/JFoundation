package mutiThread.control4;

import mutiThread.TortoiseThread;

/**
 * @description:
 *
 *      interrupt();
 *          并没有直接中断线程，而是需要中断程序自己处理
 *      stop（）：
 *          结束线程，不推荐使用、   强制
 *
 * @author: wangzi
 * @time: 2021/4/24 12:10
 */
public class Test {
    public static void main(String[] args) {
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (!Thread.currentThread().isInterrupted()){//这里要用
                    System.err.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());
                }
            }
        });
        th.start();

        int i=0;
        while (i<1000){
            System.out.println("兔子领先了，加油！！"+Thread.currentThread().getName()+"  "+Thread.currentThread().getPriority());
            i++;
        }
        th.interrupt();
    }
}
