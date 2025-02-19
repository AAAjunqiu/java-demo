package javademo;

import java.util.Random;

public class test3 {
    public static void main(String[] args) {
        char[] chs = new char[52];
        for (int i = 0; i < chs.length; i++) {
            if (i < 26) {
                //小写字母
                chs[i] = (char) (97 + i);
            }
            else {
                //大写字母
                chs[i] = (char) (65 + i - 26);
            }
        }
        Random random = new Random();
        String result = "";
        for (int i = 0; i < 4; i++){
            int index = random.nextInt(chs.length);
            result=result+chs[index];
        }
            int number  = random.nextInt(10);
        result=result+number;
        System.out.println(result);

    }
}
