package ArrayList;

import java.util.ArrayList;

public class demo1 {
    public static void main(String[] args){
        ArrayList<String> list = new ArrayList<>();
       list.add("hello");
       list.add("world");
       list.add("java1");
       list.add("java2");
       list.set(3,"java");
      String result=list.remove(2);
        System.out.println(list);
        System.out.println(result);
        for (int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }

    }
}
