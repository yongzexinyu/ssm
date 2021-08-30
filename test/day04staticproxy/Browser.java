package day04staticproxy;
//浏览器
public class Browser {
    private boolean visit=false;


    public boolean getVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    public void visit(){
        System.out.println("是否能访问谷歌"+this.visit);
    }
}
