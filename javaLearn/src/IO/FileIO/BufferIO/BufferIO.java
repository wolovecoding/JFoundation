package IO.FileIO.BufferIO;

import java.io.*;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/22 20:51
 */
public class BufferIO {
    public static void main(String[] args) throws IOException {
        File file1 = new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy3.txt");
        /*处理流、  缓冲流*/
        BufferedInputStream bfInStm = new BufferedInputStream(new FileInputStream(file1));
        BufferedOutputStream bfOutStm = new BufferedOutputStream(new FileOutputStream(new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy4.txt")));

        /*
        * 中转战，还是离不了水杯。不过速度变快了。一个是从硬盘到程序一个读取，  一个是从内存一个个读取。  后者速度肯定更快。
        *
        * */
        long start = System.currentTimeMillis();

        //用时23
        /*  int read = bfInStm.read();
        while (read!=-1){
            bfOutStm.write(read);
            read = bfInStm.read();
        }*/

        //用时1
        byte[] read = new byte[1024];
        int len  = bfInStm.read(read);
        while (len!=-1){
            bfOutStm.write(read,0,len);
            len = bfInStm.read(read);
        }
        long end = System.currentTimeMillis();
        System.out.println("用时"+(end-start));
//        关闭流
        bfInStm.close();
        bfOutStm.close();
    }
}
