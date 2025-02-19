package javaclass;

public class Girlfriend {
   private String name;
    private int age;
    private double weight;
    private String gender;

    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    public void setAge (int age){
        if (age>=18 && age<=50) {
            this.age = age;
        }else {
            System.out.println("Age is not correct");
        }
    }
    public int  getAge(){
        return age;
    }
    public void setGender(String gender){
        this.gender=gender;
    }

    public String getGender(){
        return gender;
    }

    public void eat(){
        System.out.println("Girlfriend is eating");
    }
    public void sleep(){
        System.out.println("Girlfriend is sleeping");
    }
}
