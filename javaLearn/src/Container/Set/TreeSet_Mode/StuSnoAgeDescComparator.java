package Container.Set.TreeSet_Mode;

import Container.Set.Student;

import java.util.Comparator;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 12:20
 */
public class StuSnoAgeDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getAge()-o2.getAge();
    }
}
