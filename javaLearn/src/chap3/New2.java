package chap3;

/**
 * @description:  增强版for循环
 *      在这个方法中，集合必须是一个数组或者是一个实现了iterable接口的类对象
 * @author: wangzi
 * @time: 2021/4/17 10:10
 */
public class New2 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for (int i=0;i<a.length;++i){
            a[i]=1;
        }
        for (int i :a){
            System.out.println(i);
        }
    }
}
