package javaclass.String;

import java.util.Scanner;

public class test2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个字符串：");
        String str = sc.next();
        int bigCount=0;
        int smallCount=0;
        int numberCount=0;
        for (int i = 0; i < str.length(); i++){
            System.out.println(str.charAt(i));
            if(str.charAt(i)<='Z'&&str.charAt(i)>='A'){
                bigCount++;
            }else if(str.charAt(i)<='z'&&str.charAt(i)>='a'){
                smallCount++;
            }else if(str.charAt(i)<='9'&&str.charAt(i)>='0'){
                numberCount++;
            }

        }
        System.out.println("大写字母有："+bigCount);
        System.out.println("小写字母有："+smallCount);
        System.out.println("数字有："+numberCount);
    }
}
