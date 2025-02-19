package javaclass.test3;

public class GoodsTest {
    public static void main(String[] args) {
        Goods []arr =new Goods[3];
        Goods g1=new Goods("001","华为p70",5000,100);
        Goods g2=new Goods("002","华为p80",6000,100);
        Goods g3=new Goods("003","华为p90",7000,100);
        arr[0] =g1;
        arr[1] =g2;
        arr[2] =g3;
        for (int i = 0; i < arr.length; i++){
            System.out.print(arr[i].getId()+" ");
            System.out.print(arr[i].getName()+" ");
            System.out.print(arr[i].getPrice()+" ");
            System.out.print(arr[i].getCount());
            System.out.println();

        }

     }
}
