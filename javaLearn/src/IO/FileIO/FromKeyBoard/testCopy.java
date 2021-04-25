package IO.FileIO.FromKeyBoard;import java.io.*;

/**
 * @description:
 *      system.in 从控制台输入 节点流？？
 *     共能： 将从键盘输入的一行行数据复制到另外一个文件中
 *
 *     2.InputStreamReader到底是一个Input Stream流  还是一个Reader
 *       实现了reader接口，是reader流
 *
 *    3. 转化流使用了一个设计模式： 适配器（转换器）模式
 *    两相插座  ----（两相插座）转换头（三相插头）------三相插头
 *
 * @author: wangzi
 * @time: 2021/4/22 21:42
 */
public class testCopy {
    public static void main(String[] args) throws IOException {
        //创建输入流和输出流
        InputStream in = System.in;  //从键盘输入流
        Reader fr = new InputStreamReader(in);
        Writer fw = new FileWriter("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\BufferIO\\text4.txt");
        //使用输入流和输出流   缓冲流进行处理
        BufferedReader bfr = new BufferedReader(fr);
        BufferedWriter bfw = new BufferedWriter(fw);



        String s = bfr.readLine();
       // while (s!="bye"){  //从键盘读入， 什么时候结束？  错误  ==  != 只能判断基本类型，  或者同一引用
        while (!"bye".equals(s)){
            bfw.write(s);
            bfw.newLine();
            s = bfr.readLine();
        }

        //关闭输入流和输出流
        bfr.close();
        bfw.close();
    }
}
