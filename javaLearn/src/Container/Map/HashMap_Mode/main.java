package Container.Map.HashMap_Mode;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

/**
 * @description:
 *      重点： map里的key不是索引！！！  key是值，存在内存里。
 * @author: wangzi
 * @time: 2021/4/21 11:23
 */
public class main {
    public static void main(String[] args) {
//        创建一个容器
        Map<String, String> map = new HashMap<String, String>();
//        向容器加入东西

        map.put("US","American");
        map.put("CN","China");
        map.put("UK","Union King");

//        取出东西
        System.out.println(map.get("key"));
//       移除东西

//        遍历
        //是无序的，所以没法用for
        //集合中的对象不好提取， 用不了自己的foreach，  不过map有个foreach方法
        map.forEach((key,value)->{

        });
        Set<Map.Entry<String,String>> entrySet = map.entrySet();
        Iterator<Map.Entry<String, String>> iterator = entrySet.iterator();
        while (iterator.hasNext()){
            Map.Entry<String, String> entry = iterator.next();
            System.out.println(entry.toString());
        }
        /*
        *
        *
        * */


        //没有iterator  也不能用
        //有个方法可把key转化成set
        for (String s:map.keySet()){
            System.out.println(s+"------>"+map.get(s));
        }
    }
}
