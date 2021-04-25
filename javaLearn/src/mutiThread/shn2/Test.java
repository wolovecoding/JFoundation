package mutiThread.shn2;

/**
 * @description:
 *  功能：多个用户对同一个账户取款
 *  技能：线程同步 synchronize
 *
 *      分析：
 *          1. 多个用户对同一个账户取款，有共享资源（同一个账户），建议使用Runnable
 *          2. 多个用户取款操作流程完全相同，需要开发一个取款线程
 *          3. 多个用户取款对同一个账户取款，需要开发一个账户类
 *          4. 明确：多个用户同时取款，相互之间不需要沟通
 *
 *      结果：
 *          1.账户类ACCOUNT
 *          2.取款线程 AccountRunnable
 *          3.测试类
 * @author: wangzi
 * @time: 2021/4/24 13:50
 */
public class Test {
    public static void main(String[] args) {
        //创建两个取款线程
        Runnable rn=new AccountRunnable();

        Thread th1 = new Thread(rn);
        th1.setName("张三");
        Thread th2 = new Thread(rn);
        th2.setName("马云");
        //启动两个线程
        th1.start();
        th2.start();


    }
}
