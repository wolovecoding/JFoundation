package chap3;

/**
 * @description: 中段控制流程语句
 * @author: wangzi
 * @time: 2021/4/17 10:00
 */
public class New1 {
    public static void main(String[] args) {
        int n=5,i=4;
        z_d:
        while (n<=5){
            for (;i>1;i++){
                n--;
                break z_d;
            }
            System.out.println("没跳出最外层循环");
        }
    }
}
