package classTest.test3;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:19
 */
public class Vehicle {
    private double speed;  //速度
    private int power;   //功率
//    构造函数
    //空构造
    public Vehicle(){}

    public Vehicle(int power){
        this.power=power;
    }
    public Vehicle(double speed,int power){
        this.speed=speed;
        this.power=power;
    }

    public void speedUp(int s){
        this.speed = this.speed + s;
    }
    public void speedDown(int s){
        this.speed -= s;
    }
    public void setPower(int p){
        this.power = p;
    }

    public int getPower(){
        return power;
    }
    public double getSpeed(){
        return speed;
    }
}
