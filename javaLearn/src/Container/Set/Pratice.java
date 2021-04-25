package Container.Set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/19 17:50
 */
public class Pratice {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18, "男", 99);
        Student student2 = new Student("李四", 18, "男", 99);
        Student student3 = new Student("王五", 18, "神", 99);
        Student student4 = new Student("小六", 18, "妖", 12);
//        这里竟然可以被存储进set里！！  明明是一样的内容/对象   之前存储String类型的时候就没遇到过。
    //      原因 ： stirng类型已经写了equals（）和hashcode()方法了
    //      我们需要在自己定义的类中自己重写这两个方法
        Student student5 = new Student("张三", 18, "男", 99);
        Set<Student> studentSet = new HashSet<Student>();
        studentSet.add(student1);
        studentSet.add(student2);
        studentSet.add(student3);
        studentSet.add(student4);
        studentSet.add(student5);

        Iterator<Student> iterator = studentSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
