package spring07di;

public class People {
    private  Pad pad;
    public People(Pad pad){
        this.pad=pad;//有参鼓噪
    }

    public People(){
        System.out.println("人对象被创建");
    }

    public void play(){
        System.out.println("人玩的方法");
        pad.game();
    }
}
