package IO.FileIO.PrintIO;

import java.io.*;
import java.util.Date;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/23 8:28
 */
public class test {
    public static void main(String[] args) throws IOException {

        //打印流
        //PrintStream stream = new PrintStream(System.out);   这个就没有必要了，
      //  PrintStream ps = System.out;
        PrintStream ps = new PrintStream(new FileOutputStream(new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\PrintIO\\Printtext.txt")));
        ps.println(123);
        ps.println(3.14);
        ps.println("你好");
        ps.println(true);
        ps.println(new Date());

        //按行写入文件
        PrintWriter pw = new PrintWriter("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\PrintIO\\Printtext.txt");
       // pw.
        //InputStream fileInputStream = new FileInputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\PrintIO\\Printtext.txt");
       // BufferedInputStream bi = new BufferedInputStream(fileInputStream);



//        关闭流？  我感觉System.out不要手动管把
    }
}
