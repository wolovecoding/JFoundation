package Container.Set;

import java.util.Objects;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/19 17:50
 */
public class Student implements Comparable{
    private String name;
    private int age;
    private String sex;
    private float score;
    public Student(String name,int age,String sex,float score){
        this.name=name;
        this.age=age;
        this.sex=sex;
        this.score=score;
    }

//    想用hash存储 这一步是必要的
    /*
    * 思路：
    *   先判断着两个对象是否为同一引用， 是同一引用就不需要继续判断了
    *   引用不同  再判断对方引用是空吗？ 两个对象的类是同一个类吗？   别认为向上转型或继承可能相等，不会的！
    *   因为类是一样的， 所有可以把Object对象转成此类  之后便于进行属性的比较
    *   纪念性各个属性的比较。
    * */
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                Float.compare(student.score, score) == 0 &&
                Objects.equals(name, student.name) &&
                Objects.equals(sex, student.sex);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, sex, score);
    }

//    想储存到treeset中必须写这个方法
    @Override
    public int compareTo(Object o) {
        Student student = (Student) o;
        if (this.name!=student.name)
            return this.name.compareTo(student.name);
        else if (this.sex!=student.sex)
            return this.sex == "男" ? 1 : 0;
        else
            return this.age-student.age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public float getScore() {
        return score;
    }

    public void setScore(float score) {
        this.score = score;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", sex='" + sex + '\'' +
                ", score=" + score +
                '}';
    }


}
