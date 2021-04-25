package mutiThread.syn1;

/**
 * @description:  银行账户
 * @author: wangzi
 * @time: 2021/4/24 13:54
 */
public class AccountRunnable implements Runnable{
    private Account account = new Account();
    @Override
    public void run() {
        //此处省略20句
        int i=400;
        //核心操作
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

        //此处省略30句
    }
}
