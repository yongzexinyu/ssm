package spring16aopstaticproxy;

public class Game {
    private int WangSu=460;

    public int getWangSu() {
        return WangSu;
    }

    public void setWangSu(int wangSu) {
        WangSu = wangSu;
    }

    public  void conNet(){
        System.out.println("现在的网速是"+this.getWangSu());
    }
}
