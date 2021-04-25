package mutiThread.commu;

/**
 * @description:
 *
 *      功能： 生产者-消费者问题
 *      技能：线程通信  wait（）  notify（）   notifyAll()   Object类的public方法
 *
 *      业务分析：
 *      1. 生产和消费交替进行
 *      2. 生产者交替的生产白色馒头和黄色的玉米饼
 *      3. 生产者 ----- 仓库 ------ 消费者（仓库中只能存放一件商品）
 *
 *      注意：
 *      1.生产者线程和消费者线程是两个不同的线程
 *      2.之前的取款线程只要执行代码，不同线程之间没有通信
 *      3.现在的生产者线程、消费者线程需要相互通信
 *      4.同样也需要线程同步，保证线程安全性（线程通信的前提是线程同步）
 *
 *      类的设计：
 *      1.定义一个商品Product类
 *      2.定义两个线程：生产者线程、消费者线程
 *      3.定义测试类：创建线程并启动
 *
 *      问题1：  消费者没有消费生产者生产的馒头
 *      解决：注入。
 *
 *      问题2：生产者实现了交替，消费者没有实现交替
 *      原因：生产者交替的生产不同的商品，本质是修改Product的两个属性的值
 *              消费者消费的本质是输出Product当前的属性的值
 *          解决： 先加sleep使问题充分暴露；  发现出现 黄色的馒头  --》加锁。
 *     问题3：加锁后，问题没有解决，（我生产了一半，消费者可以消费）---》生产者消费者都加锁
 *              注意：不仅生产者需要加锁，消费者也要加锁，而且必须是同一把锁
 *                  正好使用共享资源做锁即可
 *     问题4：生产者已经交替，但消费者没有交替
 * @author: wangzi
 * @time: 2021/4/24 17:24
 */
public class Test {
    public static void main(String[] args) {
        Product product = new Product();
        //创建两个线程对象
        Runnable pr = new ProduceRunnable(product);
        Runnable cr = new ConsumeRunnable(product);
        Thread pt = new Thread(pr);
        Thread ct = new Thread(cr);
        //启动线程
        pt.start();
        ct.start();

    }
}
