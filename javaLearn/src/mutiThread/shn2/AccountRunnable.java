package mutiThread.shn2;

/**
 * @description:
 *       synchronized (同步监视器){}
 *       1.必须是引用数据类型，不能是基本数据类型
 *       2.不能改变其引用，但可以改变其值
 *       3. 尽量不要使用String和包装类Integer做同步监视器，
 *       4.一般使用共同资源做同步监视器，没有任何业务含义
 *
 *      线程同步： 优点和缺点
 *          优点：安全
 *          缺点：效率地下  （并不能保证这个线程执行完才去执行另一个线程）  可能出现死锁
 * @author: wangzi
 * @time: 2021/4/24 13:54
 */
public class AccountRunnable implements Runnable{
    private Account account = new Account();
    @Override
    public void run() {
        //此处省略20句

        synchronized (account){
            //核心操作
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

        //此处省略30句
    }
}
