package ArrayList;

import java.sql.SQLOutput;
import java.util.ArrayList;

public class demo2 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);
        System.out.print("[");
        for (int i = 0; i < list.size(); i++) {
            if (i == list.size() - 1) {
                System.out.print(list.get(i));
            }else {
                System.out.print(list.get(i) + ",");
            }
        }
        System.out.println("]");
    }
}
