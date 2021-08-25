package spring04iocrongqi;

public class Pc {
    //出生后的构造方法
    public Pc(){
        System.out.println("无参构造，就是对象一旦生就会执行的方法，比如，人一出生就会哭，哭就是无参构造");
        System.out.println("构造方法 是 对象一出生就会执行的方法 一般多用来初始化自己属性的比如 颜色");
    }
    //对象的初始化方法
    public void initShow(){
        System.out.println("开机....");
        System.out.println("初始化方法 是对象一诞生就会执行的方法 和构造方法不同的是，他多用直接调用自己的方法");
    }
    //对象的普通方法 周期中... 成年中...打CF LOL
    public void playGame(){
        System.out.println("电脑的普通方法，用来打游戏");
    }
    //对象的死亡方法，参考 过滤器，Servlet
    public void destroyObj(){
        System.out.println("电脑中毒了..被砸了...地球爆炸了...总之就是 电脑对象死亡，执行的方法");
    }
}
