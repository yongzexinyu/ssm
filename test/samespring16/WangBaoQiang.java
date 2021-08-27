package samespring16;

public class WangBaoQiang {
    private int tanPianchouNengli=300;

    public int getTanPianchouNengli() {
        return tanPianchouNengli;
    }

    public void setTanPianchouNengli(int tanPianchouNengli) {
        this.tanPianchouNengli = tanPianchouNengli;
    }

    public void tanHeZuo(){
        System.out.println("现在的谈片酬能力"+this.getTanPianchouNengli());
    }
}
