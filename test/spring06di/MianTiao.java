package spring06di;

public class MianTiao implements Eat {
public MianTiao(){
    System.out.println("面条对象诞生了");
}
    @Override
    public void doEat() {
        System.out.println("吃面条");
    }
}
