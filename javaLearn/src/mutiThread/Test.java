package mutiThread;

/**
 * @description:
 *
 *      功能：龟兔赛跑
 *      技能：线程的创建和启动
 * @author: wangzi
 * @time: 2021/4/24 11:02
 */
public class Test {
    public static void main(String[] args) {

        Thread thread = new TortoiseThread();
        //不能用run
        //thread.run();
        thread.start();

        while (true){
            System.out.println("兔子领先了，加油!!"+Thread.currentThread().getName()+"级别："+Thread.currentThread().getPriority());
        }
    }
}
