package classTest.test3;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:30
 */
public class Exp3 {
    public static void main(String[] args) {
//        车辆一
        Vehicle car1;
        car1 = new Vehicle();
        car1.setPower(128);
//        车辆二
        Vehicle car2 = new Vehicle(76);
//        车辆三
        Vehicle car3 = new Vehicle(40.5, 85);

        System.out.println("car1的功率是："+car1.getPower());
        System.out.println("car2的功率是："+car2.getPower());
        System.out.println("car3的功率是："+car3.getPower());

        car1.speedUp(80);
        car2.speedUp(100);
        car3.speedUp(30);

        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        System.out.println("car3目前的速度："+car3.getSpeed());
        car1.speedDown(10);
        car2.speedDown(20);
        car3.speedDown(30);
        System.out.println("car1目前的速度："+car1.getSpeed());
        System.out.println("car2目前的速度："+car2.getSpeed());
        System.out.println("car3目前的速度："+car3.getSpeed());
    }
}
