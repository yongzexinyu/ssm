package spring16aopstaticproxy;

import org.junit.Test;

public class GameTest {

    @Test
    public  void  test01(){
        Game wangzhe=new Game();
        JiaSuQi xunyou=new JiaSuQi();
        xunyou.setGame(wangzhe);//set注入，王者注入了迅游 迅游依赖了王者  迅游才是主体类
        xunyou.conNet();

    }
}
