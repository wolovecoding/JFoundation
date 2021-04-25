package IO.FileIO.BufferIO;

import java.io.*;

/**
 * @description:
 *      按行读取文件并复制
 *
 *      只有文本文件（text）才有行的概念   字符流  可以读
 *      提高速度  缓冲字符流
 *      BufferedReader  和 BufferedWriter
 * @author: wangzi
 * @time: 2021/4/22 21:42
 */
public class BufferRW {
    public static void main(String[] args) throws IOException {
        //创建输入流和输出流
        Reader fr = new FileReader(new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\BufferIO\\text.txt"));
        Writer fw = new FileWriter("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\BufferIO\\text2.txt");
        //使用输入流和输出流   缓冲流进行处理
        BufferedReader bfr = new BufferedReader(fr);
        BufferedWriter bfw = new BufferedWriter(fw);

        String s = bfr.readLine();
        while (s!=null){  //怎么判断读没读完？？？？
            bfw.write(s);
            bfw.newLine();
            s = bfr.readLine();
        }

        //关闭输入流和输出流
    }
}
