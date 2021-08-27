package samespring16;

public class Test {
    @org.junit.Test
    public void test01(){
        WangBaoQiang wangBaoQiang=new WangBaoQiang();
        SongZhe songZhe=new SongZhe();
        songZhe.setWangBaoQiang(wangBaoQiang);
        songZhe.tanHeZuo();

    }
}
