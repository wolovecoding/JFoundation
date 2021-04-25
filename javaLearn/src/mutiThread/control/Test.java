package mutiThread.control;

/**
 * @description:
 *
 *      改变线程的优先级：优先级低执行的机会少，而不是没有
 *      join()阻塞指定线程等到另一个线程完成以后再执行
 *
 *      sleep（）
 *
 *
 * @author: wangzi
 * @time: 2021/4/24 12:10
 */
public class Test {
    public static void main(String[] args) {
        //创建线程
        Thread th = new Thread(new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());

                }
            }
        });
        //改变优先级
        th.setPriority(4);
        //启动线程
        th.start();

        //改变主线程的
        Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
        //
        while (true){
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
        }
    }
}
