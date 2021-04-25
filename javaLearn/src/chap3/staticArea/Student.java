package chap3.staticArea;

/**
 * @description:   静态域的应用   所有对象共享类的静态域
 * @author: wangzi
 * @time: 2021/4/17 11:22
 */
public class Student {
    private static int stuNum = 0;
    private String name;
    private String age;

    public Student(String name , String age){
        this.name=name;this.age=age;
        Student.stuNum++;
    }

    public static int getStuNum() {
        return stuNum;
    }

/* 不能要，不安全
   public static void setStuNum(int stuNum) {
        Student.stuNum = stuNum;
    }*/

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age='" + age + '\'' +
                '}';
    }
}
