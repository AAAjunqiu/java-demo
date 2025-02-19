package Math_String;

import java.util.Scanner;

public class AiAppMain {
    public static void main(String[] args) {
        AI ai = new AI();
        Scanner sc = new Scanner(System.in);
        while(true){
            String input = sc.nextLine();
            if("exit".equals(input)){
                System.out.println("byebye");
                break;
            }
         String answer = ai.answer(input);
            System.out.println(answer);
        }

    }
}
