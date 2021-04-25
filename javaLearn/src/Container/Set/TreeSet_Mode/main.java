package Container.Set.TreeSet_Mode;

import java.util.Iterator;
import java.util.TreeMap;
import java.util.TreeSet;

/**
 * @description:
 *      因为set是无序的，  所以不能随机取出单个元素，
 *      类似于LinkedList   链表  可使用iterator  因为无序 ，我们也不知道具体的元素位置， 此方法也不好
 * @author: wangzi
 * @time: 2021/4/21 10:24
 */
public class main {
    public static void main(String[] args) {
//        创建一个容器
        TreeSet<String> treeSet = new TreeSet<>();
//        向容器中添加东西
    treeSet.add("HTML");
    treeSet.add("Java");
    treeSet.add("Mysql");
    treeSet.add("Java");
    treeSet.add("CSS");
//        取出内容
     //无  ，因为是无序的
//        删除元素
        treeSet.remove("HTML");
//        遍历元素
  /*      for (String s:treeSet){
            System.out.println(s);
        }*/
        Iterator<String> iterator = treeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
    }
}
