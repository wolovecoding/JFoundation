package IO.FileIO.DataIO;

import java.io.*;

/**
 * @description:
 *      DataInputStream和DataOutputStream  是数据流，解决了printIo只能写字符串缺点
 *          缺点：必须用DataOutputStream写入的数据才能被读出， 不然报EOF
 *          如果想对对象进行操作，使用对象流 ObjectInputStream
 * @author: wangzi
 * @time: 2021/4/23 19:51
 */
public class TestDataStream {
    public static void main(String[] args) throws IOException {
       write();
       read();
    }

    private static void write() throws IOException {
        OutputStream os = new FileOutputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\DataIO\\fiel1");
        DataOutputStream dout = new DataOutputStream(os);
        dout.writeInt(99);
        dout.writeDouble( 3.14);
        dout.writeUTF("你好，Java");
    }

    private static void read() throws IOException {
        InputStream is = new FileInputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\DataIO\\fiel1");
        BufferedInputStream bi = new BufferedInputStream(is);
        DataInputStream di = new DataInputStream(bi);
        System.out.println(di.readInt());
        System.out.println(di.readDouble());
        System.out.println(di.readUTF());
    }
}
