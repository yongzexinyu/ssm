package spring19aopxuqiu;
/*
* 这个类就是切面类  切面类和普通类有什么区别
* 1.逻辑上的区别？切面类 是次要业务，而普通类可能是主要业务
* 2.写法上的区别，一般切面类  里面很少有属性，只有方法
* */
public class PaiDui {
    public  static void  paiHao(){
        System.out.println("排号嘞");
    }
}
