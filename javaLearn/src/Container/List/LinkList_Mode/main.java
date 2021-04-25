package Container.List.LinkList_Mode;

import java.util.Iterator;
import java.util.LinkedList;

/**
 * @description:  和动态数组一样，  本质上是线性表。
 *                  只不过这个使用链表方式实现的。
 * @author: wangzi
 * @time: 2021/4/19 9:46
 */
public class main {
    public static void main(String[] args) {
//        create a container
        LinkedList<Integer> list = new LinkedList<Integer>();
//        add element to container
        list.add(5);
        list.add(10);
        list.add(1,7);
//        traverse  methods
        // 1.
        for (int i=0;i<list.size();i++){
            System.out.println(list.get(i));
        }
        // 2.
        System.out.println("********************");
        for (int i:list){
            System.out.println(i);
        }
        //  3.
        System.out.println("********************");
        Iterator<Integer> iterator = list.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }
//      其他方法类似
    }
}
