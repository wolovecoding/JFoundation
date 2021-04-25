package Container.List.ArrayList_Mode;

import java.util.ArrayList;
import java.util.Iterator;

/**
 * @description:
 *      有先后顺序  List
 *      ArrayList
 *          不唯一  有顺序
 * @author: wangzi
 * @time: 2021/4/18 10:33
 */
public class main {

    public static void main(String[] args) {
//        创建容器
        ArrayList<Integer> arrayList = new ArrayList<Integer>();

//         填充容器/放东西
        arrayList.add(Integer.valueOf(88));
        arrayList.add(15);   //这里是自动装箱打包  详见 Java核心技术 184页
        arrayList.add(1,12);
    //        arrayList.addAll()   把另一个容器的东西放到这个容器里，  第一个参数是插入位置
//        取出容器中东西/得到相关信息
        System.out.println("得到第2个元素"+arrayList.get(1));
        System.out.println("得到容器尺寸"+arrayList.size());
        System.out.println("容器的toString方法"+arrayList.toString());
//        修改容器元素内容
        arrayList.set(1,99);
//        容器是否包含元素
        arrayList.contains(Integer.valueOf(99));
//        扔掉容器中的东西  好几个多态方法
        System.out.println(arrayList.remove(0));
        //arrayList.removeAll(c)   从集合中删除在c容器内的东西
//      遍历三种方式
        for (int i=0;i<arrayList.size();i++){
            System.out.println(arrayList.get(i));
        }

        for(Integer e:arrayList){
            System.out.println(e);  //这里因为指定了泛型，所以。。。
        }

        //Iterator迭代器   是从container继承来的
        Iterator<Integer> listItrt = arrayList.iterator();
        while (listItrt.hasNext()) {   //next相当于指针，
            System.out.println(listItrt.next());
        }


    }
}
