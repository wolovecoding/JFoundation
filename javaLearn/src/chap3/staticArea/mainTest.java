package chap3.staticArea;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/17 11:27
 */
public class mainTest {
    public static void main(String[] args) {
        Student student1 = new Student("王男", "18");
        Student student2 = new Student("老鬼","999");
        Student student3 = new Student("老魔","999");
        System.out.println("现有学生"+Student.getStuNum()+"人");
    }
}

