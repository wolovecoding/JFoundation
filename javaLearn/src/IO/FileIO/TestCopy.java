package IO.FileIO;

import java.io.*;


/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 23:59
 */
public class TestCopy {
    public static void main(String[] args) throws IOException {
//        最好构造个file对象
        //InputStream file1 = new FileInputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy.txt");
        File file = new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy.txt");
        InputStream is = new FileInputStream(file);
        File file2 = new File("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\tcopy2.txt");
        OutputStream os = new FileOutputStream(file2);
//    使用输入流和输出流完成文件复制
    /*
        方式1
            int n ; //中转站，好比一个水杯
            //读一个字节
            n = is.read();  //从输入流中读取一个字节的内容
            while (n!=-1){//没有到达末尾
                //写一个字节
                os.write(n);
                n = is.read();
            }*/
        byte[] buf = new byte[1024]; //少见  ，中转站，好比一个桶
        int len = is.read(buf);
        while (len!=-1){
            os.write(buf,0,len);
            len = is.read(buf);
        }



//    关闭输入流和输出流
        is.close();
        os.close();
    }

}
