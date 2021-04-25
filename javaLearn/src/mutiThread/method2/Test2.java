package mutiThread.method2;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/24 11:34
 */
public class Test2 {
    public static void main(String[] args) {
        Runnable r = new Runnable() {
            @Override
            public void run() {
                while (true){
                    System.out.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());

                }
            }
        };

        //runnable.  接口就一个run方法
        Thread thread = new Thread(r);
//        Thread t2 = new Thread(r);
//        Thread t3 = new Thread(r);
        //启动线程
        thread.start();

        while (true){
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
        }
    }
}
