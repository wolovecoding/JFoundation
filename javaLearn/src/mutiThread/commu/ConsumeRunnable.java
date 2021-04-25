package mutiThread.commu;

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
                System.out.println("消费者在消费商品"+product.getColor()+product.getName());
            }
        }
    }
}
