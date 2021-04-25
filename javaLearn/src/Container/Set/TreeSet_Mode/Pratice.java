package Container.Set.TreeSet_Mode;

import Container.Set.Student;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 10:39
 */
public class Pratice {
    public static void main(String[] args) {
        Student student1 = new Student("张三", 18, "男", 99);
        Student student2 = new Student("李四", 18, "男", 99);
        Student student3 = new Student("王五", 18, "神", 99);
        Student student4 = new Student("小六", 18, "妖", 12);

        Set<Student> set = new TreeSet<>();
        /*
        * class Container.Set.Student cannot be cast to class java.lang.Comparable
        * (Container.Set.Student is in unnamed module of loader 'app';
        *
        * 分析： 红黑树 ，这些我们自定义的类没法比较，必须要写Comparable方法
        * */
        set.add(student1);
        set.add(student2);
        set.add(student3);
        set.add(student4);

//        取出
        for (Student s:set){
            System.out.println(s.toString());
        }

        Iterator<Student> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
