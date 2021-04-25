package mutiThread.commu2;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/24 17:33
 */
public class ProduceRunnable implements Runnable{
    //private Product product= new Product();  这里new  导致生产者和消费者的商品不同   ||需要注入解决
    //构造方法实现注入，保证product对象是一个
    private Product product=null;
    public ProduceRunnable(Product product){
        this.product = product;
    }

    @Override
    public void run() {
        int i=0;
        while (true){
            synchronized (product){
                //如果已经有了商品，就等待
                if (product.flg){
                    try {
                        product.wait();  //必须是同步监视器的方法   //进入阻塞状态，并释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                if(i%2==0){
                    try {
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //生产馒头
                    product.setName("馒头");
                    product.setColor("白色");
                }else {
                    try {
                        Thread.sleep(1);  //进入阻塞状态，不释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //生产玉米
                    product.setName("玉米");
                    product.setColor("黄色");
                }

            System.out.println("生产者在生产"+product.getColor()+product.getName());
            i++;
            //改变商品状态，
            product.flg = true;
            // 通知消费者可以消费
            product.notify();
            }
        }
    }
}
