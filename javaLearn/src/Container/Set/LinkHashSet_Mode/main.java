package Container.Set.LinkHashSet_Mode;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;

/**
 * @description:  存储课程例子
 *          有存储速度  唯一
 * @author: wangzi
 * @time: 2021/4/19 17:14
 */
public class main {
    public static void main(String[] args) {
// create a container  :hashset
        //这里用set向上转更好
        Set<String> set = new LinkedHashSet<String>();
// 存储课程
        set.add("HTML");
        set.add("Java");
        set.add("Mysql");
        //set.add("HTML");
        set.add("Java");
//        输出信息
        System.out.println(set.size());
        System.out.println(set.toString());

    }
}
