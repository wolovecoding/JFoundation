package mutiThread.control2;

/**
 * @description:
 *
 *      改变线程的优先级：优先级低执行的机会少，而不是没有
 *      join()
 *          作用
 *              阻塞当前正在运行的线程 ，插入本线程，等本线程执行完毕后，在执行被阻塞的线程
 *          注意
 *              放到start（）前
 *
 *      sleep（）
 *
 *
 * @author: wangzi
 * @time: 2021/4/24 12:10
 */
public class Test {
    public static void main(String[] args) {

        //
        int i=0;
        while (true){
            if(i==20){
                //创建线程对象
                Thread th = new Thread(new Runnable() {
                    @Override
                    public void run() {
                        while (true){
                            System.out.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());
                        }
                    }
                });
                //join
                try {
                    th.join();   //join必须放到start的前面
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                //启动线程
                th.start();
            }
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
            i++;
        }
    }
}
