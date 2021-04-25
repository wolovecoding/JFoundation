package Container.Set.TreeSet_Mode;

import Container.Set.Student;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 12:23
 */
public class ComparatorTest {
    public static void main(String[] args) {
        TreeSet<Student> students = new TreeSet<Student>(new StuSnoAgeDescComparator());
        /*
        * 之后就可以开始比较了
        * */
        TreeSet<Student> students2 = new TreeSet<Student>(new Comparator<Student>() {
            @Override
            public int compare(Student o1, Student o2) {
                return 0;
            }
        });
    }
}
