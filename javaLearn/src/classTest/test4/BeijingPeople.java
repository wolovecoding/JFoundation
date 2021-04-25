package classTest.test4;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:55
 */
public class BeijingPeople extends ChinaPeople{
    @Override
    public void averageHeight() {
        this.setHeight(172.5);
        System.out.println("北京人的平均身高："+this.getHeight()+"厘米");
    }

    @Override
    public void averageWeight() {
        this.setWeight(70);
        System.out.println("北京人的平均体重："+this.getWeight()+"公斤");
    }

    public void beijingOpera(){
        System.out.println("花脸、青衣、花旦和老生");
    }
}
