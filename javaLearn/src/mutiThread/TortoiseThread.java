package mutiThread;

/**
 * @description:
 *
 *      如何定义线程
 *           public class TortoiseThread extends Thread{
 *              public void run() {
 *                  //线程的代码
         *         }
         *     }
 *
 *     如何创建线程对象
 *            Thread thread = new TortoiseThread();
 *     如何启动线程
 *          thread.run();  //错误
 *         thread.start();  //对
 *
 *     其他
 *          1.之前的线程都是单线程 启动main（）方法，自动创建一个线程，名称main
 *          2. 控制台出现乌龟兔子交替领先，本质上交替的cpu的执行权，CPU执行代码并输出结果
 *
 *
 * @author: wangzi
 * @time: 2021/4/24 11:05
 */
public class TortoiseThread extends Thread{

    @Override
    public void run() {
        while (true){
            System.out.println("乌龟领先了！！！！"+this.getName()+"级别"+this.getPriority());
        }
    }
}
