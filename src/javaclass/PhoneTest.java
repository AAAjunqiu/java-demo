package javaclass;

public class PhoneTest {
    public static void main(String[] args) {
      Phone p = new Phone();
      p.brand="华为";
      p.price=5999;
      System.out.println(p.brand);
      System.out.println(p.price);
      p.call();
      p.sendMessage();
    }
}
