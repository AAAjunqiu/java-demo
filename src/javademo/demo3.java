package javademo;

import java.util.Random;
import java.util.Scanner;

public class demo3 {
    public static void main(String[] args) {
    /* for (int i = 0; i <= 5; i++){
         System.out.println(i);
         if (i == 3){
             break;
             //continue 跳过本次循环  break  结束整个循环
         }*/
     /*   for (int i = 0; i <= 100; i++){
            if(i%7 == 0 || i%10 == 7 || i/10%10 == 7){
                System.out.println("过");
                continue;
            }
            System.out.println(i);

     }*/
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int n = sc.nextInt();
        int i =1;
        while(i*i<=n){
            i++;
        }
        System.out.println(i-1);*/
        /*boolean flag = true;
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个数");
        int n = sc.nextInt();
        for (int i = 2; i < n ; i++){
             if (n%i == 0){
                 flag = false;
                 break;
             }
             }
        if (flag){
            System.out.println("是素数");
        }else {
            System.out.println("不是素数");
        }*/

        Random r = new Random();
        int n= r.nextInt(100)+1;
       Scanner sc = new Scanner(System.in);

       while(true){
           System.out.println("请输入一个数");
           int m = sc.nextInt();
       if(m<n){
           System.out.println("猜小了");
       }else if(m>n){
           System.out.println("猜大了");
       }else {
           System.out.println("猜对了");
           break;
       }
       }
       }
        }
