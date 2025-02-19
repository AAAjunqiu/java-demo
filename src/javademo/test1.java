package javademo;

import javax.rmi.ssl.SslRMIClientSocketFactory;
import java.util.Scanner;

public class test1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
      System.out.println("请输入原价：");
      int price = sc.nextInt();
      System.out.println("请输入月份：");
      int month = sc.nextInt();
      System.out.println("请输入舱型（1.经济舱 2.头等舱）：");
      int type = sc.nextInt();
      int newPrice = getPrice(price,month,type);
      System.out.println("最终价格："+newPrice);

    }
    public static int getPrice(int price,int month,int type){
        int newPrice = 0 ;
        if (month>=5 && month<=10 && type == 1){
            newPrice =(int) (price * 0.85);
        }else if (month>=5 && month<=10 && type == 2){
            newPrice = (int) (price * 0.9);
        }else if (month<=5 || month>=10 ){
            if (type == 1){
                newPrice = (int) (price * 0.65);
            }
            if (type == 2){
                newPrice = (int) (price * 0.7);
            }

        }
        System.out.println("最终价格："+newPrice);
        return newPrice;
    }
}
