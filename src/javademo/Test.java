package javademo;

import java.util.Scanner;

public class Test {
    public static void main(String[] args) {
        String str1 = "123";
        String str2 = "123";
        System.out.println(str1 + str2);

        //运算符
        int a = 10;
        int b = a++;
        System.out.println(b);
        int c = ++a;
        System.out.println(c);
        int d = --a;
        System.out.println(d);
        int e = a--;
        System.out.println(e);
        System.out.println(a += b);
        //System.out.println(a-=b);
        //小练习，输入数字比大小，如果后续的数字比前一个小，则成功
        Scanner sc = new Scanner(System.in);
        /*System.out.println("请输入第一个数字：");
        int number1= sc.nextInt();
        System.out.println("请输入第二个数字：");
        int number2 = sc.nextInt();
        if(number1<number2){
            System.out.println("失败");
        }else if(number1==number2){
            System.out.println("相等");
        }else {
            System.out.println("成功");
        }*/
        //小练习
        System.out.println("请输入第一个数字：");
        int sc1 = sc.nextInt();
        System.out.println("请输入第二个数字：");
        int sc2 = sc.nextInt();
        if (sc1 == 6 || sc2 == 6 || (sc1 + sc2) % 6 == 0) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }
}