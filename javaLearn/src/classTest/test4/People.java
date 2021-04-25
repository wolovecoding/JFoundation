package classTest.test4;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:39
 */
public class People {
    private double height;  //平均身高
    private double weight;  //平均体重

    public void speakHello(){
        System.out.println("yayayaya");
    }
    public void averageHeight(){
        height = 173;
        System.out.println("average height:"+height);
    }
    public void averageWeight(){
        weight = 70;
        System.out.println("average weight:"+weight);
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }
}
