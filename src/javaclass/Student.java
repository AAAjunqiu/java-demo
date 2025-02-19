package javaclass;

public class Student {
    String name;
    int age;
    double height;
    public void study()
    {
        System.out.println("study");
    }
    public void sleep()
    {
        System.out.println("sleep");
    }
    public Student(String name,int age)
    {
       this.name=name;
       this.age=age;
    }

}
