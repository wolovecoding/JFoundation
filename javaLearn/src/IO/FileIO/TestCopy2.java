package IO.FileIO;

import java.io.*;

/**
 * @description:
 *      字符流读取和写入虽然说是按字符长度读取，但也可以识别字母。
 *      原理：  字母是以0开头的。 0123 1234  字符 1123 1234 1234 1234
 *          字符流是通过开头的0或1判断
 *
 *          好处： 提高了性能
 *
 *
 * @author: wangzi
 * @time: 2021/4/22 19:25
 */
public class TestCopy2 {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy3.txt");
        File file2 = new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy4.txt");

//        输入流
        FileReader reader = new FileReader(file1);
        FileWriter writer = new FileWriter(file2);

        long start = System.currentTimeMillis();
        int read = reader.read();
        while (read!=-1){
            writer.write(read);
           // System.out.println((char)read);
            read = reader.read();
        }
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-start));

//        关闭流
        reader.close();
        writer.close();

    }
}
