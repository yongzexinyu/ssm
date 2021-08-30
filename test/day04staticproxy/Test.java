package day04staticproxy;

public class Test {
    @org.junit.Test
    public  void  test01(){
        Vpn vpn=new Vpn();
        Browser browser=new Browser();
        vpn.setBrowser(browser);
        vpn.visit();
    }
}
