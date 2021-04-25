package classTest.test2;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 9:05
 */
public class Exp2_1 {
    static int i=10;
    public static void main(String args[]) {
        {
            int k=10;
            System.out.println("i="+i);
            System.out.println("k="+k);
        }
        System.out.println("i="+i);
     //   System.out.println("k="+k);
    }
    /*错误第十七行 找不到 变量k

    分析原因：k是在{}这个代码块里定义的，17行是在此代码块外引用的，报错。
    在k定义位置的代码块中k可以被使用，没有报错。
    初步分析：k在{}类似的代码块之内定义的话，代码块中内容全部运行完后，内存被释放了
    查阅资料：
    * */

}
