package classTest.test5.test1;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 9:30
 */
public class CryTest {
    public static void main(String[] args) {
//        Animal a = new Dog();
//        a.cry();
//        Cat b = (Cat) a;
//        b.cry();
        Animal a =new Dog();
        Animal cat = new Cat();
        System.out.println("狗的类"+a.getClass());
        System.out.println("猫的类"+cat.getClass());
    }
}
