package classTest.test4;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:44
 */
public class ChinaPeople extends People{
//    重写说hello方法
    public void speakHello(){
        System.out.println("你好");
    }
    public void averageHeight(){
        this.setHeight(168.78);
        System.out.println("中国人的平均身高："+this.getHeight()+"厘米");
    }
//    重写方法
    public void averageWeight(){
        this.setWeight(65);
        System.out.println("中国人的平均体重："+this.getWeight()+"公斤");
    }

    public void chinaGongfu(){
        System.out.println("坐如钟，站如松，睡如弓");
    }

}
