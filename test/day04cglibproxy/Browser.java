package day04cglibproxy;

public class Browser {
    private  boolean visit=false;

    public boolean getVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }
    public  boolean target(){
        System.out.println("是否能访问谷歌"+this.visit);
        return  this.visit;
    }
}
