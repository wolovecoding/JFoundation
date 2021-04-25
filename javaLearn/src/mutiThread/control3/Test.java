package mutiThread.control3;

/**
 * @description:
 *
 *      sleep（）
 *      1.作用：
 *          让当前的线程进入阻塞状态指定的时间，时间到，线程进入就绪状态
 *          即使CPU空闲，线程也不是提前结束阻塞状态
 *      2.应用
 *          在多线程环节下实现线程的切换，让某些安全问题充分的暴露。
 *
 *     yield（）
 *     1.礼让cup，当前线程书房CPU，进入就绪状态，重新排队，抢占CPU
 *     2.作用：让同优先级别或者更高级别的线程得到执行的机会。
 *
 *     setDemon(true)
 *     让当前线程变成后台线程，启动后台线程的线程结束，后台线程也随之结束
 *
 *
 * @author: wangzi
 * @time: 2021/4/24 12:10
 */
public class Test {
    public static void main(String[] args) {
        //创建线程对象
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    System.err.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());
                }
            }
        });
        //级联？？
        th.setDaemon(true);
        th.start();
        while (true){
                //创建线程对象
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
        }
    }
}
