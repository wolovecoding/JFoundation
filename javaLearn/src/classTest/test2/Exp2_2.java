package classTest.test2;

import java.util.Scanner;

import static java.lang.System.exit;
import static java.lang.System.setOut;

/**
 * @description:
 * @author: wangzi
 * @time: 2021/4/21 9:10
 */
public class Exp2_2 {
    public static void main(String[] args) {
        while (true){
            System.out.println("    ---------------------------");
            System.out.println("    *                         *");
            System.out.println("    *  欢迎进入学生成绩管理系统   *");
            System.out.println("    *                         *");
            System.out.println("    ---------------------------");


            System.out.println("请选择您的操作：");
            System.out.println();
            System.out.println("        1.录入学生成绩信息");
            System.out.println("        2.显示学生成绩信息");
            System.out.println("        0.退出");
            System.out.println("请选择按键（0-2）:");

            Scanner sc = new Scanner(System.in);
            int select = sc.nextInt();
//        多分支条件判断， switch最合适
            switch (select){
                case 0:{
                    exit(1);
                }
                case 1:
                    System.out.println("录入学生成绩信息");
                    System.out.println("功能正在开发中....");
                    break;
                case 2:{
                    System.out.println("显示学生成绩信息");
                    System.out.println("功能正在开发中....");
                    break;
                }
                default:
                    System.out.println("输入错误，请重新输入！");
                    break;
            }
        }
    }
}
