package Container.Set.TreeSet_Mode;

import Container.Set.Student;

import java.util.Comparator;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 12:18
 */
public class StuSnoNameDescComparator implements Comparator<Student> {
    @Override
    public int compare(Student o1, Student o2) {
        return o1.getName().compareTo(o2.getName());
    }
}
