package mutiThread.syn3;

/**
 * @description:
 *      方法2
 *        private synchronized void withDraw(){
 *        采用了同步方法之后，  同步监视器变为this
 *
 *        同步方法的同步监视器是this
 *
 *        一旦一个同步方法被锁定，当前类的所有同步方法都被锁定 ，效率低下
 *
 *          这些都是从线程安全变为不安全  但效率提高了。
 *        StringBuffer  -->StringBuilder
 *        Vector  -->Arraylist
 *        Hashtable  --> Hashmap
 *
 * @author: wangzi
 * @time: 2021/4/24 13:54
 */
public class AccountRunnable implements Runnable{
    private Account account = new Account();
    @Override
    public void run() {
        //此处省略20句
            //核心操作
        withDraw();
        //此处省略30句
    }

    private synchronized void withDraw(){
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
}
