package classTest.test4;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:51
 */
public class AmericanPeople extends People{
    public void speakHello(){
        System.out.println("How do you do?");
    }
    public void averageHeight(){
        this.setHeight(176);
        System.out.println("American's average height: 176 cm");
    }

    @Override
    public void averageWeight() {
        this.setWeight(75);
        System.out.println("American's average weight:"+this.getWeight()+"kg");
    }
    public void americanBoxing(){
        System.out.println("直拳、勾拳、组合拳");
    }
}
