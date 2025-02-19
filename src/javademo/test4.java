package javademo;

import java.util.Scanner;

public class test4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [] score = new int [6];
        System.out.println("请输入六位评委的分数：");
        for(int i = 0;i<6;){
           int score1 = sc.nextInt();
           if (score1>=0&&score1<=100){
               score[i] = score1;
               i++;
           }else if (score1<0||score1>100){
               System.out.println("输入有误，请重新输入：");
           }


        }
        int max = score[0];
        for (int i = 0;i<6;i++){
            if(score[i]>max){
                max = score[i];
            }
        }
        int min = score[0];
        for (int i = 0;i<6;i++){
            if(score[i]<min){
                min = score[i];
            }
        }
        int sum = 0;
        for (int i = 0;i<6;i++){
            sum=sum+score[i];
        }
        System.out.println("去掉最高分"+max+"和最低分"+min+"后的平均分是："+(sum-max-min)/4);
    }
}
