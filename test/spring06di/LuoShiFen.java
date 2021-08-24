package spring06di;

public class LuoShiFen implements Eat {
    public  LuoShiFen(){
        System.out.println("螺狮粉对象诞生了");
    }
    @Override
    public void doEat() {
        System.out.println("吃螺狮粉");
    }
}
