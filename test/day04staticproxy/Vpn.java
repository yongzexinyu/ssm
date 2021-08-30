package day04staticproxy;

public class Vpn {
    public boolean isVisit() {
        return visit;
    }

    public void setVisit(boolean visit) {
        this.visit = visit;
    }

    public Browser getBrowser() {
        return browser;
    }

    public void setBrowser(Browser browser) {
        this.browser = browser;
    }

    private  boolean  visit;
    private Browser browser;
    public void visit(){
       // boolean visit = browser.getVisit();
      browser.setVisit(true);
      this.visit=browser.getVisit();
        System.out.println("现在是否能访问谷歌"+this.visit);
    }
}
