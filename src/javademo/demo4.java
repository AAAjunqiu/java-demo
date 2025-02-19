package javademo;

public class demo4 {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
   /*  String [] array2={ "as","bs","cs","ds","es"};
     double [] array3={1.1,2.2,3.3,4.4,5.5};
     System.out.println(array1);*/
        int sum = 0;
        for (int i = 0; i < array1.length; i++) {
            System.out.println(array1[i]);
            sum = sum + array1[i];
        }
        System.out.println(sum);

        int array4[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int n = 0;
        for (int i = 0; i < array4.length; i++) {
            System.out.println(array4[i]);
            if (array4[i] % 3 == 0) {
                n++;
            }
        }
        System.out.println("数组中能被3整除的数字有" + n + "个");
        int[] array5 = {1, 2, 3, 4, 5};
        for (int i = 0; i < array5.length; i++) {
            if(array5[i]%2==0){
                array5[i]=array5[i]/2;
            } else if (array5[i]%2 != 0) {
                array5[i]=array5[i]*2;
            }
        }
            for (int j = 0; j < array5.length; j++) {
                System.out.println(array5[j]);
            }
            //动态初始化
            String [] array6 = new String[5];
            int [] array7 = new int[5];
            //整数类型默认初始值为0；小数默认初始值为0.0；字符类型默认初始值为\u0000；布尔类型默认初始值为false；引用类型默认初始值为null；

        //数组练习
        int [] array8 = {55,44,66,77,34};
        int max = array8[0];
        for (int i= 1;i<array8.length;i++){
            if (array8[i]>max){
                max=array8[i];
            }
        }
        System.out.println("数组中最大的数为"+max);
        int [] array9 = new int[5];
        int sum1 = 0;
        int avg = 0;
        for (int i = 0; i < array9.length; i++){
            array9[i] =(int)(Math.round(Math.random()*100));

        }
        for (int i = 0; i < array9.length; i++){
            sum1 = sum1+array9[i];
        }
        int count = 0;
        avg = sum1/array9.length;
        for (int i = 0; i < array9.length; i++){
            if (array9[i]<avg){
                count++;
            }
        }
        System.out.println("数组的和为"+sum1);
        System.out.println("数组的平均数为"+avg);
        System.out.println("数组中小于平均数的个数为"+count);
        for (int i = 0; i < array9.length; i++){
            System.out.print(array9[i]+" ");
        }
    }

}
