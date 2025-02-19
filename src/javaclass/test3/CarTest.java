package javaclass.test3;

import java.util.Scanner;

public class CarTest {
    public static void main(String[] args) {
        Cars [] arr = new Cars[3];
        Scanner sc = new Scanner(System.in);
        for (int i=0;i<arr.length;i++){
            System.out.println("请输入第"+(i+1)+"辆车的品牌");
            String brand = sc.next();
            System.out.println("请输入第"+(i+1)+"辆车的价格");
            int price = sc.nextInt();
            System.out.println("请输入第"+(i+1)+"辆车的颜色");
            String color = sc.next();
            arr[i] = new Cars(brand,price,color);
        }
        for (int i=0;i<arr.length;i++){
            System.out.println("品牌"+arr[i].getBrand()+"价格"+arr[i].getPrice()+arr[i].getColor());
        }

    }
}
