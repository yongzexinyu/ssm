package samespring16;

public class SongZhe {
    private  WangBaoQiang wangBaoQiang;
    private int tanPianChouNengLi;

    public int getTanPianChouNengLi() {
        return tanPianChouNengLi;
    }

    public void setTanPianChouNengLi(int tanPianChouNengLi) {
        this.tanPianChouNengLi = tanPianChouNengLi;
    }

    public WangBaoQiang getWangBaoQiang() {
        return wangBaoQiang;
    }

    public void setWangBaoQiang(WangBaoQiang wangBaoQiang) {
        this.wangBaoQiang = wangBaoQiang;
    }

    public void tanHeZuo(){
        int pianChouNengli=wangBaoQiang.getTanPianchouNengli();
        this.tanPianChouNengLi=pianChouNengli+500;


        System.out.println("现在 谈片酬能力:"+this.tanPianChouNengLi);
    }
}
