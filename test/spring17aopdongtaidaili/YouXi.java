package spring17aopdongtaidaili;

public class YouXi implements Conn{
    private int wangSu=460;

    public int getWangSu() {
        return wangSu;
    }

    public void setWangSu(int wangSu) {
        this.wangSu = wangSu;
    }

    @Override
    public int conNet() {
        System.out.println("游戏本身的网速是"+ wangSu);
        return this.wangSu;
    }
}
