package spring18aopcglibdongtaidaili;

import org.junit.Test;

public class ManTest {
    @Test
    public  void  test01(){
        Man erzi=new CglibFactory().cglibCreate();//多态中的 父类 父类 指向儿子，本质是儿子对象
        int score=erzi.dream();
        System.out.println("score = " + score);
    }
}
