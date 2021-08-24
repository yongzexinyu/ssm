package spring06di;

public class HuoTui implements Eat {
    public  HuoTui(){
        System.out.println("火腿对象诞生了");
    }
    @Override
    public void doEat() {
        System.out.println("吃火腿");
    }
}
