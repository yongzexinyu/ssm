package day04cglibproxy;

public class Test {
    @org.junit.Test
    public  void  test01(){
        Browser vpn=new MyFactory().cglibCreate();
        boolean target = vpn.target();
        System.out.println("target = " + target);
    }
}
