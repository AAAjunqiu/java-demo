package ArrayList;

import java.lang.reflect.Array;

public class ArrayUtil {
    private ArrayUtil(){};

    //需要定义为静态的方便调用
    public static String printArr(int[] arr){
        StringBuilder sb = new StringBuilder();
        sb.append("[");
        for (int i = 0; i < arr.length; i++){
            if (i == arr.length - 1){
                sb.append(arr[i]);
            }else {
                sb.append(arr[i] + ",");
            }

        }
        sb.append("]");
        return sb.toString();
    }

    public static double getAverage(double [] arr){
        double sum = 0;
        for (int i = 0; i < arr.length; i++){
            sum += arr[i];
        }
        return sum/arr.length;
    }
}
