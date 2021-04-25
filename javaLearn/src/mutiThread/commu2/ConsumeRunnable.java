package mutiThread.commu2;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/24 17:35
 */
public class ConsumeRunnable implements Runnable{
    private Product product = null;
    public ConsumeRunnable(Product product){
        this.product = product;
    }

    @Override
    public void run() {
        while (true){
            synchronized (product){
                //如果没有商品就等待
                if(!product.flg){
                    try {
                        product.wait();  //进入阻塞状态，并释放锁
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("消费者在消费商品"+product.getColor()+product.getName());

                //改变商品状态
                product.flg = false;
                //通知生产者进行生产
                product.notify();
            }
        }
    }
}
