package mutiThread.method2;

/**
 * @description:
 *      1. 如何定义线程类
 *             public class TortoiseRunnable implements Runnable{
 *                          public void run() {    }
 *      2. 如何创建线程对象
 *              Runnable runnable = new TortoiseRunnable();
 *                     Thread thread = new Thread(runnable);
 *      3. 如何启动线程
 *          thread.start();
 *
 *      4. 两种定义线程类方法的优劣
 *          方法1：继承Thread类
 *              优点：编程稍微简单
 *              缺点：只能继承一个类
 *                   多个线程共享一个资源麻烦
 *          方法2：实现Runable接口
 *              缺点：编程稍微复杂
 *              优点：可以继承其他类
 *                    更方便多个线程共享一个资源
 *
 *       5.Thread常用方法
 *              run()  线程体
 *              .getName()
 *              .setName()
 *              。getPriority()
 *              .setPriority()
 *              start()         启动线程
 *              currentThread()         获取当前线程
 *
 *      6.匿名内部类的使用
 *          如果某个Runnable的实现类只使用一次，则使用匿名内部类
 * @author: wangzi
 * @time: 2021/4/24 11:15
 */
public class TortoiseRunnable implements Runnable{

    @Override
    public void run() {
        while (true){
            System.out.println("乌龟领先了   "+Thread.currentThread().getName()+"级别"+Thread.currentThread().getPriority());
            
        }
    }
}
