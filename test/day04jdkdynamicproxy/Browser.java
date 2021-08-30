package day04jdkdynamicproxy;

public class Browser implements  VisitInterface {
    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    private boolean visit=false;
    public boolean visit(){
        System.out.println("是否能拜访谷歌"+this.visit);
        return  this.visit;
    }
}
