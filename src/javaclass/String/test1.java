package javaclass.String;

import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
      /*  String str = "abc";
        String str2 = "abc";
        String str3 = new String("abc");
        System.out.println(str == str2);
        System.out.println(str == str3);
        System.out.println(str.equals(str3));*/
        String Username = "admin";
        String Password = "123456";
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入用户名：");
        String username = sc.nextLine();
        System.out.println("请输入密码：");
        String password = sc.nextLine();
        for (int i = 0; i < 3; i++){
        if(username.equals(Username)&&password.equals(Password)){
            System.out.println("登录成功");
            break;
        }else{
            System.out.println("登录失败,用户名或者密码有误");
        }
        if(i==2){
            System.out.println("登录失败次数过多，请稍后再试");
        }
        }
    }
}
