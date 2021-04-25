package Container.Set.HashSet_Mode;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @description:  存储课程例子
 *          无序  唯一
 * @author: wangzi
 * @time: 2021/4/19 17:14
 */
public class main {
    public static void main(String[] args) {
// create a container  :hashset
        //这里用set向上转更好
        Set<String> set = new HashSet<>();
// 存储课程
        //不按照原来存储顺序输出
        set.add("HTML");
        set.add("Java");
        set.add("Mysql");
       // set.add("HTML");
        set.add("Java");
//        输出信息
        System.out.println(set.size());
        System.out.println(set.toString());
//        遍历
        //这种结构不行
     /*   for (int i=0;i<set.size();i++){
            System.out.println();
        }*/
    //        foreach
        for (String s:set){
            System.out.println(s);
        }
    //        迭代器
        Iterator<String> iterator = set.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//
    }
}
