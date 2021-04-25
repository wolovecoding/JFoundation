package IO.FileIO.ObjectIO;

import java.io.*;
import java.util.Date;

/**
 * @description:
 *      DataInputStream和DataOutputStream  是数据流，解决了printIo只能写字符串缺点
 *          缺点：必须用DataOutputStream写入的数据才能被读出， 不然报EOF
 *          如果想对对象进行操作，使用对象流 ObjectInputStream
 *
 *          自定义对象问题
 *              .NotSerializableException
 *              实现Serializable接口
 *                  Serializable 竟然是空接口
 * @author: wangzi
 * @time: 2021/4/23 19:51
 */
public class TestObjectStream {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
       write();
       read();
    }

    private static void write() throws IOException {
        OutputStream os = new FileOutputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\ObjectIO\\fiel1");
        ObjectOutputStream dout = new ObjectOutputStream(os);
        dout.writeInt(99);
        dout.writeDouble( 3.14);
        dout.writeUTF("你好，Java");
        dout.writeObject(new Date());

        Student student = new Student(1, "wangzi", 18);
        dout.writeObject(student);
    }

    private static void read() throws IOException, ClassNotFoundException {
        InputStream is = new FileInputStream("D:\\ProLearn\\javaLearn\\src\\IO\\FileIO\\ObjectIO\\fiel1");
        BufferedInputStream bs = new BufferedInputStream(is);
        ObjectInputStream di = new ObjectInputStream(bs);
        System.out.println(di.readInt());
        System.out.println(di.readDouble());
        System.out.println(di.readUTF());
        System.out.println((Date)di.readObject());
        Student student= (Student)di.readObject();
        System.out.println(student);
    }
}
