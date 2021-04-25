package mutiThread.commu;

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
                        Thread.sleep(1);
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                    //生产玉米
                    product.setName("玉米");
                    product.setColor("黄色");
                }
            }
            System.out.println("生产者在生产"+product.getColor()+product.getName());
            i++;
        }
    }
}
