package spring06di;

public class Person1 {
    public Eat getEat() {
        return eat;
    }

    public void setEat(Eat eat) {
        this.eat = eat;
    }

    private  Eat eat;
   public Person1(){
        System.out.println("人类对象在容器中诞生了");
    }
    public void eatFood(){
        System.out.println("人在吃食物");
        eat.doEat();
    }
}
