package javaclass.test2;

import java.util.Random;

public class Role {
    private String name;
    private int blood;

    public Role() {
    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getBlood() {
        return blood;
    }

    public void setBlood(int blood) {
        this.blood = blood;
    }
    //定义一个方法攻击别人
    public void attack(Role role){
        Random random = new Random();
        int hurt = random.nextInt(20)+1;
         int remainBoold =  role.getBlood()-hurt;
         remainBoold = remainBoold<0?0:remainBoold;
         role.setBlood(remainBoold);
        System.out.println(this.name+"攻击了"+role.name+"造成了"+hurt+"伤害"+"还剩下了"+remainBoold+"血");
    }
}
