import java.util.Scanner;
public class HelloWorld {
    public static void main(String[] args) {
        //会把小括号里面的内容进行打印，对代码进行解释说明的工具，注释的内容不参与编译和运行，注释不要嵌套
        System.out.println("Hello World");
        System.out.println('a');
        System.out.println("黑马程序员");
        System.out.println(true);
        System.out.println(false);
        //System.out.println(null);空不能直接输出
        System.out.println("name"+'\t'+"age");
        System.out.println("jack"+'\t'+"12");
        System.out.println("tom"+'\t'+"13");
        /*多行
        注释*/
        int a = 10;
        System.out.println(a);
       /* Scanner sc = new Scanner(System.in);
        System.out.println("请输入第一个整数：");
       int number1 = sc.nextInt();
        System.out.println("请输入第二个整数：");
       int number2 = sc.nextInt();
        System.out.println("两数相加为：");
       System.out.println(number1+number2);
        System.out.println("两数相乘为：");
        System.out.println(number1 * number2);

        */
       double number3 = 12.3;
       int number4 = (int)number3;
       System.out.println(number4);
    }

}
