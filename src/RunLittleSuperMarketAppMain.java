
import person.Customer;
import supermarket.LittleSuperMarket;
import supermarket.Merchandise;

import java.sql.SQLOutput;
import java.util.Scanner;

public class RunLittleSuperMarketAppMain {
    public static void main(String[] args) {
        LittleSuperMarket littleSuperMarket = new LittleSuperMarket();
        littleSuperMarket.address = "世纪大道1号";
        littleSuperMarket.superMarketName = "有家超市";
        littleSuperMarket.parkingCount = 100;
        littleSuperMarket.merchandises = new Merchandise[200];
        littleSuperMarket.merchandiseSold = new int[littleSuperMarket.merchandises.length];
        Merchandise[] all = littleSuperMarket.merchandises;
        for(int i = 0; i < all.length; i++){
            Merchandise m = new Merchandise();
            m.count = 200;
            m.id = "ID" + i;
            m.name = "商品" + i;
            m.purchasePrice = Math.random() * 200;
            m.soldPrice = m.purchasePrice * (1 + Math.random());
            all[i]=m;
        }
        System.out.println("超市开门了");
        boolean open = true;
        while(open){
            System.out.println("本店叫做"+littleSuperMarket.superMarketName);
            System.out.println("本店地址为"+littleSuperMarket.address);
            System.out.println("本店共有停车位"+littleSuperMarket.parkingCount+"个");
            System.out.println("今日营业额为"+littleSuperMarket.incomingSum);
            System.out.println("本店共有商品"+littleSuperMarket.merchandises.length+"种");
            Customer customer = new Customer();
            customer.name="顾客编号"+(int)(Math.random()*10000);
            customer.money=Math.random()*1000;
            customer.isDrivingCar=Math.random()>0.5;
            Scanner scanner = new Scanner(System.in);

            if (customer.isDrivingCar){
                if (littleSuperMarket.parkingCount>0){
                      littleSuperMarket.parkingCount--;
                      System.out.println("欢迎"+customer.name+"驾车而来");
                }else {
                    System.out.println("本店没有停车位");
                    continue;
                }
            }else {
                System.out.println("欢迎"+customer.name+"光临本店");
            }
            double totalCost = 0;
            while(true){
                System.out.println("本店共有商品"+littleSuperMarket.merchandises.length+"种,欢迎选购，请输入商品编号");
                int index = scanner.nextInt();
                if(index<0){
                    System.out.println("欢迎下次光临");
                    break;
                }
                if (index>=all.length){
                    System.out.println("没有这个商品,请输入编号在0到"+(all.length-1)+"之内的编号");
                    continue;
                }
                Merchandise m = all[index];
                System.out.println("您选购的商品是"+m.name + "，单价是"+m.soldPrice+"，请问需要购买几个");
               int numTobuy = scanner.nextInt();
               if (numTobuy<=0){
                   System.out.println("不买看看也好，欢迎继续挑选");
                   continue;
               }
               if (numTobuy>m.count){
                   System.out.println("库存不足,欢迎继续选购");
                   continue;
               }
               if (numTobuy * m.soldPrice > customer.money){
                   System.out.println("您带的钱不够,欢迎继续挑选");
                   continue;
               }

               totalCost += m.soldPrice*numTobuy;

               m.count -= numTobuy;
               littleSuperMarket.merchandiseSold[index] += numTobuy;

            }
            customer.money -= totalCost;
            if (customer.isDrivingCar){
                littleSuperMarket.parkingCount++;
            }
            System.out.println(customer.name+"，您本次消费了"+totalCost);
            littleSuperMarket.incomingSum += totalCost;
            System.out.println("还继续营业吗");
            open =  scanner.nextBoolean();

        }
        System.out.println("超市关门了");
        System.out.println("今日营业额为"+littleSuperMarket.incomingSum+"元。营业情况如下：");
        for (int i = 0; i < littleSuperMarket.merchandiseSold.length; i++){
            Merchandise m = all[i];
            int numSold = littleSuperMarket.merchandiseSold[i];
            if(numSold>0){
                double incomming = m.soldPrice * numSold;
                double netIncomming = incomming - m.purchasePrice * numSold;
                System.out.println(m.name+"售出了"+numSold+"个，销售额为"+incomming+"，净利润为"+netIncomming);
            }

        }

    }
}
