package ArrayList;

public class TestDemo {
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
       String str = ArrayUtil.printArr(arr);
        System.out.println(str);
        double [] arr2 = {1,2,3,4,5,6,7,8,9,10};
        double avg = ArrayUtil.getAverage(arr2);
        System.out.println(avg);
    }
}
