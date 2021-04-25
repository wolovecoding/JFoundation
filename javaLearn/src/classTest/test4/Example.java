package classTest.test4;

import classTest.test5.test1.Animal;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 8:58
 */
public class Example {
    public static void main(String[] args) {
//        创建三个人
        ChinaPeople chinaPeople = new ChinaPeople();
        AmericanPeople americanPeople = new AmericanPeople();
        BeijingPeople beijingPeople = new BeijingPeople();
//        调用speakHello方法
        chinaPeople.speakHello();
        americanPeople.speakHello();
        beijingPeople.speakHello();
//        输出平均身高
        chinaPeople.averageHeight();
        americanPeople.averageHeight();
        beijingPeople.averageHeight();
//        输出平均体重
        chinaPeople.averageWeight();
        americanPeople.averageWeight();
        beijingPeople.averageWeight();
//        各地人的特色
        chinaPeople.chinaGongfu();
        americanPeople.americanBoxing();
        beijingPeople.beijingOpera();
//        从父类继承的方法
        beijingPeople.chinaGongfu();
        
    }
}
