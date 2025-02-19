package javademo;

public class demo5 {
    public static void main(String[] args) {
        System.out.println("hello world");
        PlayGames();
        Add(10,20);
        compare(10,20);
        int [] array = {5,2,7,2,9};
        int max = getMax(array);
        System.out.println("数组最大值为："+max);
        int [] array1 = copyArray(array,1,3);
       for (int i=0;i<array1.length;i++){
           System.out.println(array1[i]);
       }
    }
    public static void PlayGames(){
        System.out.println("Play Games");
        int sum = Add(10,20);
        System.out.println(sum);
    }
    public static int Add(int number1,int number2){
        int sum = number1 + number2;
        return sum;
    }
    public static void compare(int number1,int number2){
        if(number1 > number2){
            System.out.println(number1 + "大于" + number2);
        }else if(number1 < number2){
            System.out.println(number1 + "小于" + number2);
        }else{
            System.out.println(number1 + "等于" + number2);
        }
    }
    public static void compare(byte number1,byte number2){
        if(number1 > number2){
            System.out.println(number1 + "大于" + number2);
        }else if(number1 < number2){
            System.out.println(number1 + "小于" + number2);
        }else{
            System.out.println(number1 + "等于" + number2);
        }
    }
    public static void compare(short number1,short number2){
        if(number1 > number2){
            System.out.println(number1 + "大于" + number2);
        }else if(number1 < number2){
            System.out.println(number1 + "小于" + number2);
        }else{
            System.out.println(number1 + "等于" + number2);
        }
    }
    public static int getMax(int [] arr){
        int max=arr[0];
        for(int i= 1;i<arr.length;i++){
            if(arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }

    public static int[] copyArray(int [] arr,int from,int to){
        int [] newArray = new int[to-from];
        for (int i=from ;i<to;i++){
            newArray[i-from]=arr[i];
        }
        return newArray;
    }
}
